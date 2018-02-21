/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.telecom.properties.gpon;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.enums.OrigemPlanta;
import br.net.gvt.efika.telecom.properties.TelecomPropertiesEnum;
import br.net.gvt.efika.telecom.properties.Validavel;
import br.net.gvt.efika.telecom.properties.ValidavelAbs;

/**
 *
 * @author G0041775
 */
public class SerialOntGpon extends ValidavelAbs implements Validavel {

    private String serial, idOnt;

    private Integer slot, porta;

    public SerialOntGpon() {
        super(TelecomPropertiesEnum.SerialOntGpon);
    }

    public SerialOntGpon(String serial) {
        super(TelecomPropertiesEnum.SerialOntGpon);
        this.serial = serial;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Integer getPorta() {
        return porta;
    }

    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getIdOnt() {
        return idOnt;
    }

    public void setIdOnt(String idOnt) {
        this.idOnt = idOnt;
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        if (e.getRede().getPlanta() == OrigemPlanta.VIVO1) {
            return (!this.serial.isEmpty()) && this.idOnt.equalsIgnoreCase(e.getRede().getIdOnt());
        }
        return !this.serial.isEmpty();
    }

//    @Override
//    public String getNome() {
//        return "Associação Serial ONT";
//    }
}
