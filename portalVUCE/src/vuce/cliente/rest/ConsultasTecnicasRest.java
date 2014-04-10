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

	public static void main(String[] args) throws ClientProtocolException, IOException{
		
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost(
				"http://localhost:8080/siscontecSD/digemid/rest/registrar-consulta");
		
		ConsultaTecnica objc = new ConsultaTecnica();
		
		Clasificacion clasificacion = new Clasificacion();
		clasificacion.setId_Clasificacion(1);
		
		Tipo tipo = new Tipo();
		tipo.setId_Tipo(1);
		
		MotivoConsulta motivo = new MotivoConsulta();
		motivo.setId_MotivoConsulta(1);
		
		TipoInstitucion tipoInsti = new TipoInstitucion();
		tipoInsti.setId_TipoInstitucion(1);
	
		TipoSolicitante tipoSoli = new TipoSolicitante();
		tipoSoli.setId_TipoSolicitante(4);
		
		MedioConsulta medio = new MedioConsulta();
		medio.setId_MedioConsulta(1);
		
		objc.setId_Clasificacion(clasificacion);
		objc.setId_Tipo(tipo);
		objc.setId_MotivoConsulta(motivo);
		objc.setId_TipoInstitucion(tipoInsti);
		objc.setDescripcion("Example Two");
		objc.setArea("AREA 2");
		objc.setId_TipoSolicitante(tipoSoli);
		objc.setApellidos("Montenegro");
		objc.setNombres("Juan Pablo");
		objc.setDNI("32445433");
		objc.setRUC("10234567894");
		objc.setTelefono("789-3273");
		objc.setFax("2224324554");
		objc.setEmail("juan.montenegro@gmail.com");
		objc.setId_MedioConsulta(medio);
		objc.setDescripcion("Alguna descripcion en la consulta");
		
		Gson gson = new Gson();
		
		String input = gson.toJson(objc);
		System.out.println("ENVIA ->" + input);
		
		//String input = "{\"userId\":\"100\"}";
		
		//System.out.println(input);
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
			
			ConsultaTecnica oct = otro.fromJson(retornoJson.toString(), ConsultaTecnica.class);
			
			System.out.println("SOLICITANTE REGISTRADO ->" + oct.getApellidos()+", "+oct.getNombres());
			
			httpClient.getConnectionManager().shutdown();

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
