/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties;

import br.net.gvt.efika.customer.EfikaCustomer;

/**
 *
 * @author G0041775
 */
public class VlanVod extends VlanAbstract {

    public VlanVod() {
        super(null, null, null, TelecomPropertiesEnum.VlanVod);
    }

//    @Override
//    public String getNome() {
//        return TelecomPropertiesEnum.VlanVod.getNome();
//    }
    public VlanVod(Integer cvlan, Integer svlan, EnumEstadoVlan est) {
        super(cvlan, svlan, est, TelecomPropertiesEnum.VlanVod);
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        if (getCvlan() == null || getSvlan() == null) {
            return false;
        }

        return this.getSvlan().equals(e.getRede().getVlanVod()) && this.getCvlan().equals(e.getRede().getCvlan())
                && this.getState().equals(EnumEstadoVlan.UP);
    }
}
