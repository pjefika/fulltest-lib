/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.telecom.properties;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import br.net.gvt.efika.telecom.properties.gpon.AlarmesGpon;
import br.net.gvt.efika.telecom.properties.gpon.SerialOntGpon;
import br.net.gvt.efika.telecom.properties.gpon.TabelaParametrosGpon;
import br.net.gvt.efika.telecom.properties.metalico.Modulacao;
import br.net.gvt.efika.telecom.properties.metalico.TabelaParametrosMetalico;
import br.net.gvt.efika.telecom.properties.metalico.TabelaRedeMetalico;

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
    @JsonSubTypes.Type(value = DeviceMAC.class)
    , 
    @JsonSubTypes.Type(value = EstadoDaPorta.class)
    , 
    @JsonSubTypes.Type(value = Profile.class)
    , 
    @JsonSubTypes.Type(value = ReConexao.class)
    , 
    @JsonSubTypes.Type(value = VlanBanda.class)
    , 
    @JsonSubTypes.Type(value = VlanMulticast.class)
    , 
    @JsonSubTypes.Type(value = VlanVod.class)
    , 
    @JsonSubTypes.Type(value = VlanVoip.class)
    , 
    @JsonSubTypes.Type(value = AlarmesGpon.class)
    , 
    @JsonSubTypes.Type(value = SerialOntGpon.class)
    , 
    @JsonSubTypes.Type(value = TabelaParametrosGpon.class)
    , 
    @JsonSubTypes.Type(value = Modulacao.class)
    , 
    @JsonSubTypes.Type(value = TabelaParametrosMetalico.class)
    , 
    @JsonSubTypes.Type(value = TabelaRedeMetalico.class)
    ,
    @JsonSubTypes.Type(value = ValidacaoFake.class),
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
