/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.exception;

/**
 *
 * @author G0041775
 */
public class FalhaComunicacaoDslam extends Exception {

    public FalhaComunicacaoDslam() {
        super("Falha na comunicação com o DSLAM/OLT.");
    }

    public FalhaComunicacaoDslam(String message) {
        super(message);
    }

}