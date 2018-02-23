/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.telecom.properties.gpon;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.TelecomPropertiesEnum;
import br.net.gvt.efika.fulltest.model.telecom.properties.Validavel;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;

/**
 *
 * @author G0042204
 */
public class TabelaParametrosGponBasic extends ValidavelAbs implements Validavel {

    private Double potOnt;

    public TabelaParametrosGponBasic() {
        super(TelecomPropertiesEnum.TabelaParametrosGpon);
    }

    public Double getPotOnt() {
        return potOnt;
    }

    public void setPotOnt(Double potOnt) {
        this.potOnt = potOnt;
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.getPotOnt().compareTo(new Double("-8")) <= 0 && this.getPotOnt().compareTo(new Double("-28")) >= 0;
    }

}
