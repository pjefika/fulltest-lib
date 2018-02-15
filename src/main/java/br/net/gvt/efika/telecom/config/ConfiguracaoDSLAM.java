/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.telecom.config;

import br.net.gvt.efika.fulltest.ValidacaoResult;

/**
 *
 * @author G0042204
 */
public class ConfiguracaoDSLAM extends ConfiguracaoPorta {

    private ValidacaoResult tabRede;

    public ConfiguracaoDSLAM() {
    }

    public ValidacaoResult getTabRede() {
        return tabRede;
    }

    public void setTabRede(ValidacaoResult tabRede) {
        this.tabRede = tabRede;
    }

}
