/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.telecom.properties.metalico;

import java.util.List;

/**
 *
 * @author G0042204
 */
public class TabelaParametrosMetalicoVdsl extends TabelaParametrosMetalico {

    private Double snrDown1, snrDown2,
            snrUp1, snrUp2,
            atnDown1, atnDown2,
            atnUp1, atnUp2;

    public Boolean validar(TabelaParametrosMetalicoVdsl t) {
        return invalidados(t).isEmpty();
    }

    public List<String> invalidados(TabelaParametrosMetalicoVdsl t) {
        List<String> l = super.invalidados(t);
        if (this.snrDown1 >= t.getSnrDown1()) {
            l.add(" Snr Down 1 deve ser maior que " + t.getSnrDown1() + ", está em " + this.snrDown1 + ".");
        }
        if (this.snrDown2 >= t.getSnrDown2()) {
            l.add(" Snr Down 2 deve ser maior que " + t.getSnrDown2() + ", está em " + this.snrDown2 + ".");
        }
        if (this.snrUp1 >= t.getSnrUp1()) {
            l.add(" Snr Up 1 deve ser maior que " + t.getSnrUp1() + ", está em " + this.snrUp1 + ".");
        }
        if (this.snrUp2 >= t.getSnrUp2()) {
            l.add(" Snr Up deve ser maior que " + t.getSnrUp2() + ", está em " + this.snrUp2 + ".");
        }
        if (this.atnDown1 >= t.getAtnDown1()) {
            l.add(" Atn Down deve ser maior que " + t.getAtnDown1() + ", está em " + this.atnDown1 + ".");
        }
        if (this.atnDown2 >= t.getAtnDown2()) {
            l.add(" Atn Up deve ser maior que " + t.getAtnDown2() + ", está em " + this.atnDown2 + ".");
        }
        if (this.atnUp1 >= t.getAtnUp1()) {
            l.add(" Atn Up deve ser maior que " + t.getAtnUp1() + ", está em " + this.atnUp1 + ".");
        }
        if (this.atnUp2 >= t.getAtnUp2()) {
            l.add(" Atn Up deve ser maior que " + t.getAtnUp2() + ", está em " + this.atnUp2 + ".");
        }
        return l;
    }

    public Double getSnrDown1() {
        return snrDown1;
    }

    public void setSnrDown1(Double snrDown1) {
        this.snrDown1 = snrDown1;
    }

    public Double getSnrDown2() {
        return snrDown2;
    }

    public void setSnrDown2(Double snrDown2) {
        this.snrDown2 = snrDown2;
    }

    public Double getSnrUp1() {
        return snrUp1;
    }

    public void setSnrUp1(Double snrUp1) {
        this.snrUp1 = snrUp1;
    }

    public Double getSnrUp2() {
        return snrUp2;
    }

    public void setSnrUp2(Double snrUp2) {
        this.snrUp2 = snrUp2;
    }

    public Double getAtnDown1() {
        return atnDown1;
    }

    public void setAtnDown1(Double atnDown1) {
        this.atnDown1 = atnDown1;
    }

    public Double getAtnDown2() {
        return atnDown2;
    }

    public void setAtnDown2(Double atnDown2) {
        this.atnDown2 = atnDown2;
    }

    public Double getAtnUp1() {
        return atnUp1;
    }

    public void setAtnUp1(Double atnUp1) {
        this.atnUp1 = atnUp1;
    }

    public Double getAtnUp2() {
        return atnUp2;
    }

    public void setAtnUp2(Double atnUp2) {
        this.atnUp2 = atnUp2;
    }

}
