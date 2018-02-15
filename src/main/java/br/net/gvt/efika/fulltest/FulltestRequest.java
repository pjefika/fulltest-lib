package br.net.gvt.efika.fulltest;

import br.net.gvt.efika.customer.model.customer.EfikaCustomer;

public class FulltestRequest {

    private EfikaCustomer cust;
    private String executor;

    public FulltestRequest() {
    }

    public FulltestRequest(EfikaCustomer cust, String executor) {
        this.cust = cust;
        this.executor = executor;
    }

    public EfikaCustomer getCust() {
        return cust;
    }

    public void setCust(EfikaCustomer cust) {
        this.cust = cust;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

}
