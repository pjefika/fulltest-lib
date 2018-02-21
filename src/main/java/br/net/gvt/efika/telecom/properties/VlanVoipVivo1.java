/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.telecom.properties;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;

public class VlanVoipVivo1 extends VlanVoip {

    public VlanVoipVivo1() {
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        if (getSvlan() == null) {
            return false;
        }
        return this.getSvlan().compareTo(e.getRede().getVlanVoip()) == 0;
    }

}
