/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.service.config_porta;


import br.net.gvt.efika.fulltest.model.fulltest.FulltestRequest;
import br.net.gvt.efika.fulltest.model.fulltest.SetOntToOltRequest;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.properties.ValidavelAbs;
import java.util.List;

/**
 *
 * @author G0041775
 */
public interface ConfigPortaService {

    public ValidacaoResult confiabilidadeRede(FulltestRequest request) throws Exception;

    public List<ValidavelAbs> ontsDisponiveis(FulltestRequest request) throws Exception;

    public ValidacaoResult setOntToOlt(SetOntToOltRequest request) throws Exception;

    public ValidacaoResult getOntFromOlt(FulltestRequest request) throws Exception;

    public ValidacaoResult corretorEstadoPorta(FulltestRequest request) throws Exception;

    public ValidacaoResult corretorVlanBanda(FulltestRequest request) throws Exception;

    public Boolean isManageable(FulltestRequest request) throws Exception;

}
