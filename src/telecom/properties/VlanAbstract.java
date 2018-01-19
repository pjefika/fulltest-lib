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
public abstract class VlanAbstract extends ValidavelAbs implements Validavel {

    private Integer cvlan;

    private Integer svlan;

    private Integer pctDown, pctUp;

    private EnumEstadoVlan state;

    public VlanAbstract() {
        super(null);
    }
    

    public VlanAbstract(Integer cvlan, Integer svlan, EnumEstadoVlan estado, TelecomPropertiesEnum nome) {
        super(nome);
        this.cvlan = cvlan;
        this.svlan = svlan;
        this.state = estado;
    }

    @Deprecated
    public VlanAbstract(Integer p100, Integer cvlan) {
        super(null);
        this.cvlan = p100;
        this.svlan = cvlan;
        this.state = EnumEstadoVlan.UP;
    }

    public EnumEstadoVlan getState() {
        return state;
    }

    public void setState(EnumEstadoVlan state) {
        this.state = state;
    }

    public Integer getCvlan() {
        return cvlan;
    }

    public void setCvlan(Integer cvlan) {
        this.cvlan = cvlan;
    }

    public Integer getSvlan() {
        return svlan;
    }

    public void setSvlan(Integer svlan) {
        this.svlan = svlan;
    }

    public Integer getPctDown() {
        return pctDown;
    }

    public void setPctDown(Integer pctDown) {
        this.pctDown = pctDown;
    }

    public Integer getPctUp() {
        return pctUp;
    }

    public void setPctUp(Integer pctUp) {
        this.pctUp = pctUp;
    }

    @Override
    public abstract Boolean validar(EfikaCustomer e);

}
