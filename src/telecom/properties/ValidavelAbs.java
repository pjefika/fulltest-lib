/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.properties;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import telecom.properties.gpon.AlarmesGpon;
import telecom.properties.gpon.SerialOntGpon;
import telecom.properties.gpon.TabelaParametrosGpon;
import telecom.properties.metalico.Modulacao;
import telecom.properties.metalico.TabelaParametrosMetalico;
import telecom.properties.metalico.TabelaRedeMetalico;

/**
 *
 * @author g0042204
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.CLASS,
        property = "type",
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
//        visible = true,
        defaultImpl = ValidacaoFake.class)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DeviceMAC.class, name = "MAC do Equipamento")
    , 
    @JsonSubTypes.Type(value = EstadoDaPorta.class, name = "telecom.properties.EstadoDaPorta")
    , 
    @JsonSubTypes.Type(value = Profile.class, name = "Profile")
    , 
    @JsonSubTypes.Type(value = ReConexao.class, name = "Reconexões")
    , 
    @JsonSubTypes.Type(value = VlanBanda.class, name = "Vlan Banda Larga")
    , 
    @JsonSubTypes.Type(value = VlanMulticast.class, name = "Vlan Multicast")
    , 
    @JsonSubTypes.Type(value = VlanVod.class, name = "Vlan VoD/IPTV")
    , 
    @JsonSubTypes.Type(value = VlanVoip.class, name = "Vlan VoIP")
    , 
    @JsonSubTypes.Type(value = AlarmesGpon.class, name = "Lista de Alarmes")
    , 
    @JsonSubTypes.Type(value = SerialOntGpon.class, name = "Associação Serial ONT")
    , 
    @JsonSubTypes.Type(value = TabelaParametrosGpon.class, name = "Parâmetros Ópticos")
    , 
    @JsonSubTypes.Type(value = Modulacao.class, name = "Modulação")
    , 
    @JsonSubTypes.Type(value = TabelaParametrosMetalico.class, name = "Parâmetros")
    , 
    @JsonSubTypes.Type(value = TabelaRedeMetalico.class, name = "Confiabilidade de Rede")
})
public abstract class ValidavelAbs {

    private TelecomPropertiesEnum nome;

    private String type;

    public ValidavelAbs(TelecomPropertiesEnum nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome.getNome();
    }

    public void setNome(TelecomPropertiesEnum nome) {
        this.nome = nome;
    }

    public String getType() {
        return this.getClass().getName();
    }

    public void setType(String type) {
        this.type = type;
    }

}
