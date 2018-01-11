/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties.metalico;

import telecom.properties.TelecomPropertiesEnum;
import telecom.properties.ValidavelAbs;

/**
 *
 * @author G0041775
 * @param <T>
 */
public abstract class TabelaParametrosAbstract<T> extends ValidavelAbs{

    public TabelaParametrosAbstract() {
        super(TelecomPropertiesEnum.TabelaParametrosMetalico);
    }

    public abstract Boolean validar(T t);


}
