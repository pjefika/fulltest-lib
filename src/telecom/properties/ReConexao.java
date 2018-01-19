/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties;

import br.net.gvt.efika.customer.EfikaCustomer;

public class ReConexao extends ValidavelAbs implements Validavel {

    private Integer reconnects;

    private static final TelecomPropertiesEnum NOME = TelecomPropertiesEnum.ReConexao;

    public ReConexao() {
        super(NOME);
    }

    public ReConexao(Integer reconnects) {
        super(NOME);
        this.reconnects = reconnects;
    }

    @Override
    public Boolean validar(EfikaCustomer cust) {
        return reconnects.compareTo(new Integer("3")) <= 0;
    }

    public Integer getReconnects() {
        return reconnects;
    }

    public void setReconnects(Integer reconnects) {
        this.reconnects = reconnects;
    }

}
