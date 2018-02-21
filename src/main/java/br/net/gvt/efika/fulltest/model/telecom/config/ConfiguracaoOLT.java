/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.telecom.config;

import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import java.util.List;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;

/**
 *
 * @author G0042204
 */
public class ConfiguracaoOLT extends ConfiguracaoPorta {

    private ValidacaoResult serial;

    private List<SerialOntGpon> serialDisp;
    
    private ProfileGpon profileG;

    public ConfiguracaoOLT() {
    }

    @Override
    public ProfileGpon getProfile() {
        return profileG;
    }

    @Override
    public void setProfile(ProfileConfig profile) {
        this.profileG = (ProfileGpon) profile;
    }

    public List<SerialOntGpon> getSerialDisp() {
        return serialDisp;
    }

    public void setSerialDisp(List<SerialOntGpon> serialDisp) {
        this.serialDisp = serialDisp;
    }

    public ValidacaoResult getSerial() {
        return serial;
    }

    public void setSerial(ValidacaoResult serial) {
        this.serial = serial;
    }

}