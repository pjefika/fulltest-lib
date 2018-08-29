/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.fulltest;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class FullTest extends FullTestAbs {

    protected EfikaCustomer cl;

    protected List<ValidacaoResult> valids;

    protected String owner;

    public FullTest() {
        valids = new ArrayList<>();
    }

    public FullTest(String owner) {
        this.valids = new ArrayList<>();
        this.owner = owner;
    }

    public EfikaCustomer getCl() {
        return cl;
    }

    public void setCl(EfikaCustomer cl) {
        this.cl = cl;
    }

    public List<ValidacaoResult> getValids() {
        return valids;
    }

    public void setValids(List<ValidacaoResult> valids) {
        this.valids = valids;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
