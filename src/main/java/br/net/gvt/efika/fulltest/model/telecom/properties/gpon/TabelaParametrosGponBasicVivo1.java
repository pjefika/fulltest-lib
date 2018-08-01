/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.telecom.properties.gpon;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;

public class TabelaParametrosGponBasicVivo1 extends TabelaParametrosGpon {

    public TabelaParametrosGponBasicVivo1() {
        super();
    }

    @Override
    public Double getPotOntMin() {
        return new Double("-26");
    }

    @Override
    public Double getPotOntMax() {
        return new Double("-8");
    }

    @Override
    public Double getPotOltMin() {
        return null;
    }

    @Override
    public Double getPotOltMax() {
        return null;
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.getPotOnt().compareTo(this.getPotOntMax()) <= 0 && this.getPotOnt().compareTo(this.getPotOntMin()) >= 0;
    }
}
