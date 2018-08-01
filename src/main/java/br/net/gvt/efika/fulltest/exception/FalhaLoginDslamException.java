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
public class FalhaLoginDslamException extends Exception {

    public FalhaLoginDslamException() {
        super("Falha ao realizar login no DSLAM/OLT.");
    }

    public FalhaLoginDslamException(String mensagemCausa) {
        super("Falha ao realizar login no DSLAM, causa: " + mensagemCausa + ".");
    }

}
