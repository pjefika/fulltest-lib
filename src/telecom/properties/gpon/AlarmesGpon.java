/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.util.ArrayList;
import java.util.List;
import telecom.properties.Validavel;
import telecom.properties.ValidavelAbs;

/**
 *
 * @author G0041775
 */
public class AlarmesGpon extends ValidavelAbs implements Validavel {

    private List<String> listAlarmes;

    public AlarmesGpon() {
        super("Lista de Alarmes");
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
