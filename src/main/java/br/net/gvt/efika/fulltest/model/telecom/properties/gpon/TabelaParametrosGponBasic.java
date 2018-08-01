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

    private Double potOntMin = new Double("-25");

    private Double potOntMax = new Double("-8");

    public TabelaParametrosGponBasic() {
        super(TelecomPropertiesEnum.TabelaParametrosGpon);
    }

    public Double getPotOnt() {
        return potOnt;
    }

    public void setPotOnt(Double potOnt) {
        this.potOnt = potOnt;
    }

    public Double getPotOntMin() {
        return potOntMin;
    }

    public void setPotOntMin(Double potOntMin) {
        this.potOntMin = potOntMin;
    }

    public Double getPotOntMax() {
        return potOntMax;
    }

    public void setPotOntMax(Double potOntMax) {
        this.potOntMax = potOntMax;
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.getPotOnt().compareTo(this.getPotOntMax()) <= 0 && this.getPotOnt().compareTo(this.getPotOntMin()) >= 0;
    }

}
