/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties;

import br.net.gvt.efika.customer.EfikaCustomer;
import telecom.velocidade.Velocidades;

public class ProfileMetalico extends Profile {


    @Override
    public Boolean validar(EfikaCustomer ec) {
        return getDown() == Velocidades.find(ec.getServicos().getVelDown());
    }

}
