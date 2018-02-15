/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.telecom.properties.gpon;

import br.net.gvt.efika.customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.telecom.properties.TelecomPropertiesEnum;
import br.net.gvt.efika.telecom.properties.Validavel;
import br.net.gvt.efika.telecom.properties.ValidavelAbs;

/**
 *
 * @author G0042204
 */
public class TabelaParametrosGpon extends ValidavelAbs implements Validavel {

    private Double potOnt;

    private Double potOlt;

    public TabelaParametrosGpon() {
        super(TelecomPropertiesEnum.TabelaParametrosGpon);
    }

    public Double getPotOnt() {
        return potOnt;
    }

    public void setPotOnt(Double potOnt) {
        this.potOnt = potOnt;
    }

    public Double getPotOlt() {
        return potOlt;
    }

    public void setPotOlt(Double potOlt) {
        this.potOlt = potOlt;
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.getPotOlt().compareTo(new Double("-8")) <= 0 && this.getPotOlt().compareTo(new Double("-28")) >= 0
                && this.getPotOnt().compareTo(new Double("-8")) <= 0 && this.getPotOnt().compareTo(new Double("-28")) >= 0;
    }

}
