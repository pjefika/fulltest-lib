/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.telecom.properties;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;

public class VlanBandaVivo1Huawei extends VlanBandaVivo1 {

    private Integer gemport;

    public VlanBandaVivo1Huawei() {
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return getCvlan().compareTo(e.getRede().getCvlan()) == 0
                && getGemport().compareTo((e.getRede().getLogica() + 128)) == 0
                && getSvlan().compareTo(e.getRede().getRin()) == 0;
    }

    public Integer getGemport() {
        return gemport;
    }

    public void setGemport(Integer gemport) {
        this.gemport = gemport;
    }

}
