/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author JoseJulio
 */
public class ServerErrorException extends Exception{
    
    @Override
    public String getMessage(){
        return "Ha ocurrido un error en el servidor";
    }
    
}
