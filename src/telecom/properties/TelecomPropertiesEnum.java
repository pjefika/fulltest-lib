/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties;

/**
 *
 * @author G0041775
 */
public enum TelecomPropertiesEnum {

    DeviceMAC("MAC do Equipamento"),
    EstadoDaPorta("Estado da Porta"),
    Profile("Profile"),
    ReConexao("Reconexões"),
    VlanBanda("Vlan Banda Larga"),
    VlanMulticast("Vlan Multicast"),
    VlanVod("Vlan VoD/IPTV"),
    VlanVoip("VlanVoIP"),
    AlarmesGpon("Lista de Alarmes"),
    SerialOntGpon("Associação Serial ONT"),
    TabelaParametrosGpon("Parâmetros Ópticos"),
    Modulacao("Modulação"),
    TabelaParametrosMetalico("Parâmetros"),
    TabelaRedeMetalico("Confiabilidade de Rede");

    private final String valor;

    private TelecomPropertiesEnum(String nome) {
        valor = nome;
    }

    public String getNome() {
        return valor;
    }

    public static TelecomPropertiesEnum find(String nome) {
        return TelecomPropertiesEnum.valueOf(nome);
    }

}
