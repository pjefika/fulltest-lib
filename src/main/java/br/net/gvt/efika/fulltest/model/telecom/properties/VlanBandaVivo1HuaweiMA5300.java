/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.telecom.properties;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;

public class VlanBandaVivo1HuaweiMA5300 extends VlanBandaVivo1 {

    public VlanBandaVivo1HuaweiMA5300() {
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.getCvlan().compareTo(e.getRede().getCvlan()) == 0;
    }

}
