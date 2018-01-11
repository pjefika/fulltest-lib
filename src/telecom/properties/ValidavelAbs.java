/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties;

/**
 *
 * @author g0042204
 */
public abstract class ValidavelAbs {

    private TelecomPropertiesEnum nome;

    public ValidavelAbs(TelecomPropertiesEnum nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome.getNome();
    }

    public void setNome(TelecomPropertiesEnum nome) {
        this.nome = nome;
    }

}
