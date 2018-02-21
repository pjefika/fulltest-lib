/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.telecom.config;

import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import java.util.List;
import br.net.gvt.efika.fulltest.model.telecom.config.velocidade.VelocidadeDTO;

/**
 *
 * @author G0042204
 */
public class ProfileConfig {

    private ValidacaoResult atual;

    private List<VelocidadeDTO> downValues;

    public ProfileConfig() {
    }

    public ProfileConfig(ValidacaoResult atual, List<VelocidadeDTO> downValues) {
        this.atual = atual;
        this.downValues = downValues;
    }

    public ValidacaoResult getAtual() {
        return atual;
    }

    public void setAtual(ValidacaoResult atual) {
        this.atual = atual;
    }

    public List<VelocidadeDTO> getDownValues() {
        return downValues;
    }

    public void setDownValues(List<VelocidadeDTO> downValues) {
        this.downValues = downValues;
    }

}
