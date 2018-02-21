/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.dao;

import br.net.gvt.efika.fulltest.FullTest;
import br.net.gvt.efika.fulltest.FulltestRequest;
import br.net.gvt.efika.util.dao.http.Urls;
import br.net.gvt.efika.util.dao.http.factory.FactoryHttpDAOAbstract;

public class FulltestDAOImpl implements FulltestDAO {

    @Override
    public FullTest fulltest(FulltestRequest request) throws Exception {
        FactoryHttpDAOAbstract<FullTest> fac = new FactoryHttpDAOAbstract<>(FullTest.class);
        return (FullTest) fac.createWithoutProxy().post(Urls.FULLTEST.getUrl(),
                new FulltestRequest(request.getCust(), request.getExecutor()));
    }

}
