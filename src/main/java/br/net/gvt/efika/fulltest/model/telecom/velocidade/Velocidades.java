package br.net.gvt.efika.fulltest.model.telecom.velocidade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author G0041775
 */
public enum Velocidades {
    VEL_307200("300"),
    VEL_204800("200"),
    VEL_153600("150"),
    VEL_102400("100"),
    VEL_76800("75"),
    VEL_51200("50"),
    VEL_35840("35"),
    VEL_25600("25"),
    VEL_15360("15"),
    VEL_12800("12.5"),
    VEL_10240("10"),
    VEL_7680("7.5"),
    VEL_5120("5"),
    VEL_3072("3"),
    VEL_2048("2"),
    VEL_1024("1"),
    VEL_256("0.25"),
    VEL_285("0.25"),
    VEL_390("0.35"),
    VEL_569("0.5"),
    VEL_611("0.55"),
    VEL_667("0.6"),
    VEL_833("0.8"),
    VEL_889("0.8"),
    VEL_1137("1"),
    VEL_1333("1"),
    VEL_1730("1.5"),
    VEL_2247("2"),
    VEL_3245("3"),
    VEL_4326("4"),
    VEL_6489("6"),
    VEL_8651("8"),
    VEL_10813("10"),
    VEL_11370("10"),
    VEL_16220("15"),
    VEL_17302("15"),
    VEL_21627("20"),
    VEL_27034("25"),
    VEL_27304("25"),
    VEL_32440("30"),
    VEL_32441("30"),
    VEL_32450("30"),
    VEL_54067("50"),
    VEL_64881("60"),
    VEL_65536("64"),
    VEL_108134("100"),
    VEL_108135("100"),
    VEL_216269("200"),
    VEL_324403("300"),
    VEL_324500("300"),
    VEL_1048576("1000"),
    VEL_128("0.1"),
    VEL_200("0.2"),
    VEL_300("0.3"),
    VEL_600("0.6"),
    VEL_500("0.5"),
    VEL_2274("2"),
    VEL_5407("5"),
    VEL_7569("7"),
    VEL_13400("12.5"),
    VEL_150000("150"),
    VEL_162202("150");

    private final String valor;

    private Velocidades(String vel) {
        valor = vel;
    }

    public String getVel() {
        return valor;
    }

    public String getValor() {
        return valor;
    }

    public static Velocidades find(Long vel) {
        return Velocidades.valueOf("VEL_" + vel.toString());
    }

}
