/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties;

import br.net.gvt.efika.customer.EfikaCustomer;
import java.math.BigInteger;

public class ReConexao extends ValidavelAbs implements Validavel {

    private BigInteger reconnects;

    private static final TelecomPropertiesEnum NOME = TelecomPropertiesEnum.ReConexao;

    public ReConexao() {
        super(NOME);
    }

    @Override
    public Boolean validar(EfikaCustomer cust) {
        return reconnects.compareTo(new BigInteger("3")) <= 0;
    }

}
