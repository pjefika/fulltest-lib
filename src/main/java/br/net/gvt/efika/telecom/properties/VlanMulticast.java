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
public class VlanMulticast extends VlanAbstract {

    private String ipIgmp;

    public VlanMulticast() {
        super(null, null);
    }

//    @Override
//    public String getNome() {
//        return TelecomPropertiesEnum.VlanMulticast.getNome();
//    }

    public VlanMulticast(Integer cvlan, Integer svlan, EnumEstadoVlan estado) {
        super(cvlan, svlan, estado, TelecomPropertiesEnum.VlanMulticast);
    }

    public String getIpIgmp() {
        return ipIgmp;
    }

    public void setIpIgmp(String ipIgmp) {
        this.ipIgmp = ipIgmp;
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        if (getSvlan() == null) {
            return false;
        }

        return getSvlan().equals(e.getRede().getVlanMulticast()) && EnumEstadoVlan.UP == getState();
    }

}
