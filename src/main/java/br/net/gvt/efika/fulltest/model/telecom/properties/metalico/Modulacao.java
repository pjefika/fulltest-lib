/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.telecom.properties.metalico;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.TelecomPropertiesEnum;
import br.net.gvt.efika.fulltest.model.telecom.properties.Validavel;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Modulacoes;

/**
 *
 * @author G0041775
 */
public class Modulacao extends ValidavelAbs implements Validavel {

    private String modulacao;

    private Modulacoes modulEnum;

    public Modulacao() {
        super(TelecomPropertiesEnum.Modulacao);
    }

    public String getModulacao() {
        return modulacao;
    }

    public void setModulacao(String modulacao) {
        this.modulacao = modulacao;
    }

    public Modulacoes getModulEnum() {
        return modulEnum;
    }

    public void setModulEnum(Modulacoes modulEnum) {
        this.modulEnum = modulEnum;
    }

    @Override
    public Boolean validar(EfikaCustomer cust) {
        return modulEnum == Modulacoes.find(cust.getServicos().getVelDown());
    }

}
