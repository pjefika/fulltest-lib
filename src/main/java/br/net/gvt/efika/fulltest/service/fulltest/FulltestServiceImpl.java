/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.service.fulltest;

import br.net.gvt.efika.fulltest.model.fulltest.FullTest;
import br.net.gvt.efika.fulltest.model.fulltest.FulltestRequest;
import br.net.gvt.efika.util.dao.http.Urls;
import br.net.gvt.efika.util.dao.http.factory.FactoryHttpDAOAbstract;

public class FulltestServiceImpl implements FulltestService {

    @Override
    public FullTest fulltest(FulltestRequest request) throws Exception {
        FactoryHttpDAOAbstract<FullTest> fac = new FactoryHttpDAOAbstract<>(FullTest.class);
        return (FullTest) fac.createWithoutProxy().post(Urls.FULLTEST.getUrl(),
                new FulltestRequest(request.getCust(), request.getExecutor()));
    }

}
