/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author PC01
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "user") String user, @WebParam(name = "contrasena") String contrasena) {
       if (user.equals("Pame") && contrasena.equals("Pame03")) {
            return true;
        } else {
            return false;
        }
    }

   
    @WebMethod(operationName = "ProcesarPago")
    public int ProcesarPago(@WebParam(name = "total") int total, @WebParam(name = "pago") int pago) {
        if (pago >= total) {

            //retorna el vuelto del pago
            return pago - total;
        } else {
            return -1;
        }
    }

    
}
