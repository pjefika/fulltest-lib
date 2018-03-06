/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.service.fulltest;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.efika_customer.model.customer.mock.CustomerMock;
import br.net.gvt.efika.fulltest.model.fulltest.FullTest;
import br.net.gvt.efika.fulltest.model.fulltest.FulltestRequest;
import br.net.gvt.efika.util.json.JacksonMapper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class FulltestServiceImplIT {

    public FulltestServiceImplIT() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of fulltest method, of class FulltestServiceImpl.
     */
    @Test
    public void testFulltest() throws Exception {
        try {
            System.out.println("fulltest");
            FulltestRequest request = new FulltestRequest(CustomerMock.gponKeymile(), "G0042204");
            FulltestServiceImpl instance = new FulltestServiceImpl();
            FullTest result = instance.fulltest(request);
            System.out.println(new JacksonMapper<>(FullTest.class).serialize(result));
            assertTrue(result != null);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

}
