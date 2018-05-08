package br.net.gvt.efika.fulltest.model.telecom.properties.metalico;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author G0042204
 */
public class TabelaParametrosMetalico extends TabelaParametrosAbstract<TabelaParametrosMetalico> {

    private Double snrDown, snrUp, atnDown, atnUp;

    private Double velSincDown, velSincUp, velMaxDown, velMaxUp;

    public TabelaParametrosMetalico() {
    }

    @Override
    public Boolean validar(TabelaParametrosMetalico t) {
        return  invalidados(t).isEmpty();
    }

    @Override
    public List<String> invalidados(TabelaParametrosMetalico t) {
        List<String> l = new ArrayList<>();
        if (this.velSincDown >= t.getVelSincDown()) {
            l.add(" Velocidade Down deve ser maior que " + t.getVelSincDown() + ", está em " + this.velSincDown + ".");
        }
        if (this.velSincUp >= t.getVelSincUp()) {
            l.add(" Velocidade Up deve ser maior que " + t.getVelSincUp() + ", está em " + this.velSincUp + ".");
        }
        if (this.snrDown >= t.getSnrDown()) {
            l.add(" Snr Down deve ser maior que " + t.getSnrDown() + ", está em " + this.snrDown + ".");
        }
        if (this.snrUp >= t.getSnrUp()) {
            l.add(" Snr Up deve ser maior que " + t.getSnrUp() + ", está em " + this.snrUp + ".");
        }
        if (this.atnDown >= t.getAtnDown()) {
            l.add(" Atn Down deve ser maior que " + t.getSnrDown() + ", está em " + this.atnDown + ".");
        }
        if (this.atnUp >= t.getAtnUp()) {
            l.add(" Atn Up deve ser maior que " + t.getAtnUp() + ", está em " + this.atnUp + ".");
        }
        return l;
    }

    public Boolean validarAttainableDown(TabelaParametrosMetalico t) {
        return this.velMaxDown >= t.velMaxDown;
    }

    public Boolean validarAttainableUp(TabelaParametrosMetalico t) {
        return this.velMaxUp >= t.velMaxUp;
    }

    public Double getVelSincDown() {
        return velSincDown;
    }

    public void setVelSincDown(Double velSincDown) {
        this.velSincDown = velSincDown;
    }

    public Double getVelSincUp() {
        return velSincUp;
    }

    public void setVelSincUp(Double velSincUp) {
        this.velSincUp = velSincUp;
    }

    public Double getVelMaxDown() {
        return velMaxDown;
    }

    public void setVelMaxDown(Double velMaxDown) {
        this.velMaxDown = velMaxDown;
    }

    public Double getVelMaxUp() {
        return velMaxUp;
    }

    public void setVelMaxUp(Double velMaxUp) {
        this.velMaxUp = velMaxUp;
    }

    public Double getSnrDown() {
        return snrDown;
    }

    public void setSnrDown(Double snrDown) {
        this.snrDown = snrDown;
    }

    public Double getSnrUp() {
        return snrUp;
    }

    public void setSnrUp(Double snrUp) {
        this.snrUp = snrUp;
    }

    public Double getAtnDown() {
        return atnDown;
    }

    public void setAtnDown(Double atnDown) {
        this.atnDown = atnDown;
    }

    public Double getAtnUp() {
        return atnUp;
    }

    public void setAtnUp(Double atnUp) {
        this.atnUp = atnUp;
    }

}
