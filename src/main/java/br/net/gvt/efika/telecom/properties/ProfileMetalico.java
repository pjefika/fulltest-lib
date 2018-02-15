/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.telecom.properties;

import br.net.gvt.efika.customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.telecom.velocidade.Velocidades;

public class ProfileMetalico extends Profile {


    @Override
    public Boolean validar(EfikaCustomer ec) {
        return getDown() == Velocidades.find(ec.getServicos().getVelDown());
    }

}
