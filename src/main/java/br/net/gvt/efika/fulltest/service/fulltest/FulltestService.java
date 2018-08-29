/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.service.fulltest;

import br.net.gvt.efika.fulltest.model.fulltest.FullTest;
import br.net.gvt.efika.fulltest.model.fulltest.FulltestRequest;

/**
 *
 * @author G0042204
 */
public interface FulltestService {

    public FullTest fulltest(FulltestRequest request) throws Exception;

    public FullTest getById(String ownerId) throws Exception;

}
