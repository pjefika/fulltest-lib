/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.telecom.properties;

import br.net.gvt.efika.customer.model.customer.EfikaCustomer;

/**
 *
 * @author G0041775
 */
public class DeviceMAC extends ValidavelAbs implements Validavel {

    private String mac = "";
    private static TelecomPropertiesEnum NOME = TelecomPropertiesEnum.DeviceMAC;

    public DeviceMAC() {
        super(NOME);
    }

    public DeviceMAC(String mac) {
        super(NOME);
        this.mac = mac;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public Boolean validar(EfikaCustomer cust) {
        return !mac.isEmpty();
    }


}
