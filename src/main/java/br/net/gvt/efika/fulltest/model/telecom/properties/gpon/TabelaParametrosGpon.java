/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.telecom.properties.gpon;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.Validavel;

/**
 *
 * @author G0042204
 */
public class TabelaParametrosGpon extends TabelaParametrosGponBasic implements Validavel {

    private Double potOlt;

    private Double potOltMin = new Double("-26");

    private Double potOltMax = new Double("-8");

    public TabelaParametrosGpon() {
        super();
    }

    public Double getPotOlt() {
        return potOlt;
    }

    public void setPotOlt(Double potOlt) {
        this.potOlt = potOlt;
    }

    public Double getPotOltMin() {
        return potOltMin;
    }

    public void setPotOltMin(Double potOltMin) {
        this.potOltMin = potOltMin;
    }

    public Double getPotOltMax() {
        return potOltMax;
    }

    public void setPotOltMax(Double potOltMax) {
        this.potOltMax = potOltMax;
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return super.validar(e)
                && this.getPotOlt().compareTo(getPotOltMax()) <= 0 && this.getPotOlt().compareTo(getPotOltMin()) >= 0;
    }

}
