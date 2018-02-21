package br.net.gvt.efika.fulltest.model.fulltest;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.telecom.properties.gpon.SerialOntGpon;

public class SetOntToOltRequest {

    private EfikaCustomer cust;
    private String executor;
    private SerialOntGpon serial;

    public SetOntToOltRequest() {
    }

    public SetOntToOltRequest(EfikaCustomer cust, String executor, SerialOntGpon serialOnt) {
        this.cust = cust;
        this.executor = executor;
        this.serial = serialOnt;
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

    public SerialOntGpon getSerial() {
        return serial;
    }

    public void setSerial(SerialOntGpon serial) {
        this.serial = serial;
    }

}
