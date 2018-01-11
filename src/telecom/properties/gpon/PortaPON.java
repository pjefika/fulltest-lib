/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties.gpon;

import br.net.gvt.efika.customer.EfikaCustomer;
import telecom.properties.EstadoDaPorta;

public class PortaPON extends EstadoDaPorta {

    public PortaPON() {
    }

    public PortaPON(Boolean adminState) {
        super(adminState);
    }

    @Override
    public Boolean validar(EfikaCustomer e) {
        return this.getOperState();
    }

}
