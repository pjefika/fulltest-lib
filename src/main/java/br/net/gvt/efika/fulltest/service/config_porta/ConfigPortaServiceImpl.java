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
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;
import br.net.gvt.efika.util.dao.http.Urls;
import br.net.gvt.efika.util.dao.http.factory.FactoryHttpDAOAbstract;
import java.util.List;

public class ConfigPortaServiceImpl implements ConfigPortaService {

    @Override
    public ValidacaoResult confiabilidadeRede(FulltestRequest request) throws Exception {
        FactoryHttpDAOAbstract<ValidacaoResult> fac = new FactoryHttpDAOAbstract<>(ValidacaoResult.class);
        return (ValidacaoResult) fac.createWithoutProxy().post(Urls.CONF_REDE.getUrl(), request);
    }

    @Override
    public List<ValidavelAbs> ontsDisponiveis(FulltestRequest request) throws Exception {
        FactoryHttpDAOAbstract<List> fac = new FactoryHttpDAOAbstract<>(List.class);
        return (List<ValidavelAbs>) fac.createWithoutProxy().post(Urls.ONTS_DISP.getUrl(), request);

    }

    @Override
    public ValidacaoResult setOntToOlt(SetOntToOltRequest request) throws Exception {
        FactoryHttpDAOAbstract<ValidacaoResult> fac = new FactoryHttpDAOAbstract<>(ValidacaoResult.class);
        return (ValidacaoResult) fac.createWithoutProxy().post(Urls.SET_ONT.getUrl(), request);
    }

    @Override
    public ValidacaoResult getOntFromOlt(FulltestRequest request) throws Exception {
        FactoryHttpDAOAbstract<ValidacaoResult> fac = new FactoryHttpDAOAbstract<>(ValidacaoResult.class);
        return (ValidacaoResult) fac.createWithoutProxy().post(Urls.GET_ONT.getUrl(), request);
    }

}
