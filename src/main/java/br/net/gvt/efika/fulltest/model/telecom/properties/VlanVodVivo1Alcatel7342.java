/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.telecom.properties;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;

public class VlanVodVivo1Alcatel7342 extends VlanVodVivo1Alcatel {

    public VlanVodVivo1Alcatel7342() {
        super(5);
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return super.validar(e) && getState() == EnumEstadoVlan.UP; //To change body of generated methods, choose Tools | Templates.
    }

}
