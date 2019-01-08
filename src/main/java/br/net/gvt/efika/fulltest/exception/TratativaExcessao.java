/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.fulltest.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author G0041775
 */
public class TratativaExcessao {

    public static Exception treatException(Exception e) throws Exception {
        if (e instanceof ComandoNaoImplException
                || e instanceof SemGerenciaException
                || e instanceof MetodoNaoImplementadoException
                || e instanceof InventarioRedeIncompletoException
                || e instanceof FuncIndisponivelDslamException
                || e instanceof FalhaLoginDslamException
                || e instanceof FalhaJumpAccessEsception
                || e instanceof FalhaInventarioRedeException
                || e instanceof FalhaAoValidarException
                || e instanceof FalhaAoIdentificarPlacaException
                || e instanceof FalhaAoExecutarComandoException
                || e instanceof FalhaAoCorrigirException
                || e instanceof FalhaAoConsultarException
                || e instanceof DslamNaoImplException
                || e instanceof DlsamInacessivelException
                || e instanceof CorrecaoInterruptoraException
                || e instanceof ComandoNaoImplException
                || e instanceof CadastroITException
                || e instanceof WorkOrderInexException) {
            throw e;
        }
        e.printStackTrace();
        throw new FalhaComunicacaoDslam();
    }
}
