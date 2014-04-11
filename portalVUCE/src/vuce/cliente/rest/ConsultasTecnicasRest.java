/**
 * 
 */
package vuce.cliente.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import vuce.modelo.Clasificacion;
import vuce.modelo.MedioConsulta;
import vuce.modelo.MotivoConsulta;
import vuce.modelo.Tipo;
import vuce.modelo.TipoInstitucion;
import vuce.modelo.TipoSolicitante;
import vuce.modelo.ConsultaTecnica;

import com.google.gson.Gson;

/**
 * @author Paul
 *
 */
public class ConsultasTecnicasRest {

	public ConsultaTecnica registrarCTRest(ConsultaTecnica ct) throws ClientProtocolException, IOException{
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost(
				"http://localhost:8080/siscontecSD/digemid/rest/registrar-consulta");
		
		Gson gson = new Gson();
		ConsultaTecnica oct = null;
		
		String input = gson.toJson(ct);
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
			oct = otro.fromJson(retornoJson.toString(), ConsultaTecnica.class);
			
			System.out.println("SOLICITANTE REGISTRADO ->" + oct.getApellidos()+", "+oct.getNombres());
			
			httpClient.getConnectionManager().shutdown();

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return oct;
	}
	
	public ArrayList<ConsultaTecnica> listarCTRestBySoli(String idSolicitante) throws ClientProtocolException, IOException{
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost(
				"http://localhost:8080/siscontecSD/digemid/solicitante/lista-consultas-tecnicas");
		
		//Gson gson = new Gson();
		//ConsultaTecnica oct = null;
		
		//String input = gson.toJson(ct);
		//System.out.println("ENVIA ->" + input);
		ArrayList<ConsultaTecnica> lista = null;
		
		try {
			
			StringEntity inputJson = new StringEntity(idSolicitante);
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
			lista = otro.fromJson(retornoJson.toString(), ArrayList.class);
			
			//System.out.println("SOLICITANTE REGISTRADO ->" + oct.getApellidos()+", "+oct.getNombres());
			
			httpClient.getConnectionManager().shutdown();

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
}
