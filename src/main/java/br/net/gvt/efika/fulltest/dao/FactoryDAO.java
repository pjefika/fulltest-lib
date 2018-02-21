/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.dao;

/**
 *
 * @author G0042204
 */
public class FactoryDAO {

    public static FulltestDAO newFulltestDAO() {
        return new FulltestDAOImpl();
    }
}
