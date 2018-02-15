/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.telecom.properties;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    VlanVoip("Vlan VoIP"),
    AlarmesGpon("Lista de Alarmes"),
    SerialOntGpon("Associação Serial ONT"),
    TabelaParametrosGpon("Parâmetros Ópticos"),
    Modulacao("Modulação"),
    TabelaParametrosMetalico("Parâmetros"),
    TabelaRedeMetalico("Confiabilidade de Rede"),
    ValidavelFake("Propriedade não validada.");

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

    private static Map<String, TelecomPropertiesEnum> FORMAT_MAP = Stream
            .of(TelecomPropertiesEnum.values())
            .collect(Collectors.toMap(s -> s.valor, Function.identity()));

    @JsonCreator // This is the factory method and must be static
    public static TelecomPropertiesEnum fromString(String string) {
        return Optional
                .ofNullable(FORMAT_MAP.get(string))
                .orElseThrow(() -> new IllegalArgumentException(string));
    }

}
