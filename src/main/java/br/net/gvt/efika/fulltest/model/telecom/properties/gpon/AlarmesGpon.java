/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.telecom.properties.gpon;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import java.util.ArrayList;
import java.util.List;
import br.net.gvt.efika.fulltest.model.telecom.properties.TelecomPropertiesEnum;
import br.net.gvt.efika.fulltest.model.telecom.properties.Validavel;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;

/**
 *
 * @author G0041775
 */
public class AlarmesGpon extends ValidavelAbs implements Validavel {

    private List<String> listAlarmes;

    public AlarmesGpon() {
        super(TelecomPropertiesEnum.AlarmesGpon);
        this.listAlarmes = new ArrayList<>();
    }

    public List<String> getListAlarmes() {
        return listAlarmes;
    }

    public void setListAlarmes(List<String> listAlarmes) {
        this.listAlarmes = listAlarmes;
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.listAlarmes.isEmpty();
    }

}
