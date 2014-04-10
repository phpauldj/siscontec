/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.sunat;

import edu.upc.entidades.persona;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Eduardo
 */
@WebService(serviceName = "validaRUC")
public class validaRUC {

    

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "consultaRuc")
    public persona consultaRuc(@WebParam(name = "ruc") String ruc, @WebParam(name="usuario") String usu, @WebParam(name="clave") String pwd) {
        List<persona> lstP = new ArrayList<persona>();
        persona aux1 = new persona();
        aux1.setRuc("12121212121");
        aux1.setUsuario("ericka");
        aux1.setClave("123456");
        aux1.setNombre("Melisa");
        aux1.setApellido("Ponce Pozo");
        aux1.setDireccion("Jr. Acapana 555");
        aux1.setFecnaci("01/01/1991");
        aux1.setRpta("");
        lstP.add(aux1);

        persona aux2 = new persona();
        aux2.setRuc("12345678912");
        aux2.setUsuario("paul");
        aux2.setClave("123456");
        aux2.setNombre("Paul Carlos");
        aux2.setApellido("Taboada Casas");
        aux2.setDireccion("Jr. Acapana 124");
        aux2.setFecnaci("01/01/1990");
        aux2.setRpta("");
        lstP.add(aux2);

        persona aux3 = new persona();
        aux3.setRuc("89898989898");
        aux3.setUsuario("invitado");
        aux3.setClave("123456");
        aux3.setNombre("Invitado");
        aux3.setApellido("Usuario Invitado");
        aux3.setDireccion("Jr. Acapana 666");
        aux3.setFecnaci("01/01/1982");
        aux3.setRpta("");
        lstP.add(aux3);
        
        persona aux = new persona();
        int enc = -1;
        persona dt = null;
        for(int i = 0; i < lstP.size(); i++){
            dt= (persona)lstP.get(i);
            if(dt.getUsuario().equals(usu) && dt.getClave().equals(pwd) && dt.getRuc().equals(ruc)){
                aux = dt;
                enc = 1;
                aux.setRpta("OK");
                System.out.println("Ruc encontrado");
            }
        }
        if(enc == -1){
            aux.setRpta("RUC no valido");
            System.out.println("Ruc no valido");
        }
        return aux;
    }
}
