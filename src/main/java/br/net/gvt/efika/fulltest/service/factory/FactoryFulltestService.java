/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.service.factory;

import br.net.gvt.efika.fulltest.service.config_porta.ConfigPortaService;
import br.net.gvt.efika.fulltest.service.config_porta.ConfigPortaServiceImpl;
import br.net.gvt.efika.fulltest.service.fulltest.FulltestService;
import br.net.gvt.efika.fulltest.service.fulltest.FulltestServiceImpl;

/**
 *
 * @author G0042204
 */
public class FactoryFulltestService {

    public static FulltestService newFulltestService() {
        return new FulltestServiceImpl();
    }

    public static ConfigPortaService newConfigPortaService() {
        return new ConfigPortaServiceImpl();
    }

}
