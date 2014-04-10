/**
 * 
 */
package vuce.cliente.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import vuce.modelo.Usuario;

import com.google.gson.Gson;

/**
 * @author Paul
 *
 */
public class LoginSolicitanteRest {

	public Usuario logear(String usuario, String clave) throws ClientProtocolException, IOException{
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost(
				"http://localhost:8080/siscontecSD/digemid/login/validar-usuario-json/");
		
		Gson gson = new Gson();
		Usuario us = null;
		Usuario getu = new Usuario();
		getu.setLogin(usuario);
		getu.setContrasenia(clave);
		
		String input = gson.toJson(getu);
		System.out.println("ENVIA ->" + input);
		
		try {
			
			StringEntity inputJson = new StringEntity(input);
			inputJson.setContentType("application/json");
			post.setEntity(inputJson);

			HttpResponse response = httpClient.execute(post);

			if (response.getStatusLine().getStatusCode() != 200) {

				throw new RuntimeException("ERROR HTTP ->"
						+ response.getStatusLine().getStatusCode());

			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			String mensajeRetorno = "";
			StringBuilder  retornoJson =new StringBuilder();
			System.out.println("RETORNA:");
			while ( (mensajeRetorno=br.readLine())!=null){
				retornoJson.append(mensajeRetorno);
			}
			
			Gson otro = new Gson();
			us = otro.fromJson(retornoJson.toString(), Usuario.class);
			
			System.out.println("SOLICITANTE LOGEADO ->" + us.getApellidos()+", "+us.getNombres());
			
			httpClient.getConnectionManager().shutdown();

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return us;
	}
}
