/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.exception;

/**
 *
 * @author G0042204
 */
public class CadastroITException extends Exception {

    public CadastroITException() {
        super("Falha ao consultar inventário de TI");
    }

}
