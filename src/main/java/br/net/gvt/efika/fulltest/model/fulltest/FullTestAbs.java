/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.model.fulltest;

import java.util.Calendar;

/**
 *
 * @author G0042204
 */
public abstract class FullTestAbs {

    protected Boolean resultado;

    protected Calendar dataInicio;

    protected Calendar dataFim;

    protected String mensagem;

    protected Boolean leituraConfirmada;

    public FullTestAbs() {
    }

    public FullTestAbs(Boolean resultado, Calendar dataInicio, Calendar dataFim, String mensagem) {
        this.resultado = resultado;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.mensagem = mensagem;
    }

    public FullTestAbs(Boolean resultado, Calendar dataInicio, Calendar dataFim, String mensagem, Boolean leituraConfirmada) {
        this.resultado = resultado;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.mensagem = mensagem;
        this.leituraConfirmada = leituraConfirmada;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Boolean getLeituraConfirmada() {
        return leituraConfirmada;
    }

    public void setLeituraConfirmada(Boolean leituraConfirmada) {
        this.leituraConfirmada = leituraConfirmada;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FullTestAbs{");
        sb.append("resultado=").append(resultado);
        sb.append(", dataInicio=").append(dataInicio);
        sb.append(", dataFim=").append(dataFim);
        sb.append(", mensagem='").append(mensagem).append('\'');
        sb.append(", leituraConfirmada=").append(leituraConfirmada);
        sb.append('}');
        return sb.toString();
    }
}
