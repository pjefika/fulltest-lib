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
public class FalhaInventarioRedeException extends Exception {

    public FalhaInventarioRedeException() {
        super("Inventário de Rede inexistente.");
    }

}
