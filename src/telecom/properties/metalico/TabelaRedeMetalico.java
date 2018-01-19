/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties.metalico;

import br.net.gvt.efika.customer.EfikaCustomer;
import telecom.properties.TelecomPropertiesEnum;
import telecom.properties.Validavel;
import telecom.properties.ValidavelAbs;

public class TabelaRedeMetalico extends ValidavelAbs implements Validavel {

    private Integer pctDown, pctUp, crcDown, crcUp, fecDown, fecUp, resync, tempoMedicao;

    private Boolean crcOk, pctSuficiente;

    public TabelaRedeMetalico() {
        super(TelecomPropertiesEnum.TabelaRedeMetalico);
    }

    /**
     * *
     * Implementar
     *
     * @param cust
     * @return
     */
    @Override
    public Boolean validar(EfikaCustomer cust) {
        if (isCrcOk() && resync5()) {
            return isPctSuficiente();
        }
        return false;
    }

    public Integer getResync() {
        return resync;
    }

    public void setResync(Integer resync) {
        this.resync = resync;
    }

    public Integer getPctDown() {
        return pctDown;
    }

    public void setPctDown(Integer pctDown) {
        this.pctDown = pctDown;
    }

    public Integer getPctUp() {
        return pctUp;
    }

    public void setPctUp(Integer pctUp) {
        this.pctUp = pctUp;
    }

    public Integer getCrcDown() {
        return crcDown;
    }

    public void setCrcDown(Integer crcDown) {
        this.crcDown = crcDown;
    }

    public Integer getCrcUp() {
        return crcUp;
    }

    public void setCrcUp(Integer crcUp) {
        this.crcUp = crcUp;
    }

    public Integer getFecDown() {
        return fecDown;
    }

    public void setFecDown(Integer fecDown) {
        this.fecDown = fecDown;
    }

    public Integer getFecUp() {
        return fecUp;
    }

    public void setFecUp(Integer fecUp) {
        this.fecUp = fecUp;
    }

    public Integer getTempoMedicao() {
        return tempoMedicao;
    }

    public void setTempoMedicao(Integer time) {
        this.tempoMedicao = time;
    }

    public Boolean isCrcOk() {
        Integer maxCrcDown = this.getPctDown() / new Integer("6000");
        Integer maxCrcUp = this.getPctUp() / new Integer("5000");
        if (this.getCrcDown().compareTo(maxCrcDown) > 0 || this.getCrcUp().compareTo(maxCrcUp) > 0) {
            return false;
        }
        return true;
    }

    /**
     * True para resync menor que 300
     *
     * @return
     */
    public Boolean resync300() {
        return this.getResync().compareTo(new Integer("300")) < 0;
    }

    /**
     * True para tempoMedicao maior que 5 minutos
     *
     * @return
     */
    public Boolean cincoMin() {
        return this.getTempoMedicao().compareTo(300) > 0;
    }

    /**
     * True para resync menor que 50
     *
     * @return
     */
    public Boolean resync50() {
        return this.getResync().compareTo(new Integer("50")) < 0;
    }

    /**
     * True para resync menor que 5
     *
     * @return
     */
    public Boolean resync5() {
        return this.getResync().compareTo(new Integer("5")) < 0;
    }

    /**
     * True para resync 0
     *
     * @return
     */
    public Boolean resync0() {
        return this.getResync().compareTo(new Integer("0")) == 0;
    }

    /**
     * True para pacotes down E up menor que 50
     *
     * @return
     */
    public Boolean pctA() {
        return this.getPctDown().compareTo(new Integer("50")) < 0 && this.getPctUp().compareTo(new Integer("50")) < 0;
    }

    /**
     * True para pacotes down >= 6000
     *
     * @return
     */
    public Boolean pctDown() {
        return this.getPctDown().compareTo(new Integer("6000")) >= 0;
    }

    /**
     * True para pacotes up >= 5000
     *
     * @return
     */
    public Boolean pctUp() {
        return this.getPctDown().compareTo(new Integer("5000")) >= 0;
    }

    /**
     * True para pacotes up >= 5000
     *
     * @return
     */
    public Boolean isPctSuficiente() {
        return pctDown() && pctUp();
    }

    /**
     * True para pacotes down E up maior que 3000
     *
     * @return
     */
    public Boolean pctB() {
        return this.getPctDown().compareTo(new Integer("3000")) > 0 && this.getPctUp().compareTo(new Integer("3000")) > 0;
    }

    /**
     * True para pacotes down E up menor que 1000
     *
     * @return
     */
    public Boolean pctC() {
        return this.getPctDown().compareTo(new Integer("1000")) < 0 && this.getPctUp().compareTo(new Integer("1000")) < 0;
    }
}
