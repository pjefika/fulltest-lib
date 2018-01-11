/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import fulltest.FullTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0041775
 */
public class JacksonMapperIT {
    
    public JacksonMapperIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
private String string = "{" +
"   \"resultado\":true," +
"   \"dataInicio\":1515705406262," +
"   \"dataFim\":1515705449790," +
"   \"mensagem\":\"Não foram identificados problemas de configuração. Se o problema/sintoma informado pelo cliente persiste, seguir o fluxo.\"," +
"   \"id\":null," +
"   \"cl\":{" +
"      \"designador\":\"CTA-813PE2SDIL-013\"," +
"      \"instancia\":\"4130157784\"," +
"      \"designadorAcesso\":\"CTA-15958501-069\"," +
"      \"designadorTv\":\"TV-CTA-813PE2SDIU-050\"," +
"      \"rede\":{" +
"         \"tipo\":\"METALICA\"," +
"         \"origem\":\"ONLINE\"," +
"         \"planta\":\"VIVO2\"," +
"         \"ipDslam\":\"10.141.23.164\"," +
"         \"vendorDslam\":\"ZHONE\"," +
"         \"modeloDslam\":\"COMBOZH48\"," +
"         \"idOnt\":null," +
"         \"terminal\":null," +
"         \"ipMulticast\":null," +
"         \"nrc\":null," +
"         \"slot\":4," +
"         \"porta\":45," +
"         \"sequencial\":45," +
"         \"logica\":45," +
"         \"rin\":465," +
"         \"vlanVoip\":1131," +
"         \"vlanVod\":3131," +
"         \"vlanMulticast\":4000," +
"         \"cvlan\":145," +
"         \"bhs\":null" +
"      }," +
"      \"redeExterna\":{" +
"         \"tipo\":null," +
"         \"origem\":null," +
"         \"planta\":null," +
"         \"splitter1n\":null," +
"         \"splitter2n\":null," +
"         \"caboAlim\":null," +
"         \"fibra1n\":null," +
"         \"fibra2n\":null" +
"      }," +
"      \"servicos\":{" +
"         \"velDown\":15360," +
"         \"velUp\":1024," +
"         \"tipoTv\":\"DTH\"," +
"         \"tipoLinha\":\"TDM\"" +
"      }," +
"      \"linha\":{" +
"         \"tipo\":\"TDM\"," +
"         \"dn\":\"4130157784\"," +
"         \"central\":\"PRCTA_LPS01\"" +
"      }," +
"      \"radius\":{" +
"         \"status\":\"ATIVO\"," +
"         \"armario\":\"PRCTA_O1B26\"," +
"         \"rin\":\"465\"," +
"         \"velocidade\":\"15360 - 1024\"," +
"         \"ipFixo\":\"-\"," +
"         \"profile\":\"a1024b15360\"," +
"         \"porta\":\"45\"," +
"         \"isIpFixo\":false" +
"      }," +
"      \"asserts\":[" +
"         {" +
"            \"asserts\":\"DIVERGENCIA_TBS_RADIUS\"," +
"            \"value\":false," +
"            \"creationDate\":1515705914022" +
"         }," +
"         {" +
"            \"asserts\":\"CIRCUITO_ATIVO\"," +
"            \"value\":true," +
"            \"creationDate\":1515705914022" +
"         }," +
"         {" +
"            \"asserts\":\"HAS_BLOQUEIO_RADIUS\"," +
"            \"value\":false," +
"            \"creationDate\":1515705914022" +
"         }" +
"      ]," +
"      \"eventos\":[" +
"" +
"      ]" +
"   }," +
"   \"valids\":[" +
"      {" +
"         \"nome\":\"Estado Administrativo da Porta\"," +
"         \"mensagem\":\"Porta Ativada (Adm state Up).\"," +
"         \"resultado\":true," +
"         \"foiCorrigido\":false," +
"         \"result\":{" +
"            \"nome\":\"Estado da Porta\"," +
"            \"adminState\":true," +
"            \"operState\":true" +
"         }" +
"      }," +
"      {" +
"         \"nome\":\"Estado Operacional da Porta\"," +
"         \"mensagem\":\"Sincronismo OK.\"," +
"         \"resultado\":true," +
"         \"foiCorrigido\":null," +
"         \"result\":{" +
"            \"nome\":\"Estado da Porta\"," +
"            \"adminState\":true," +
"            \"operState\":true" +
"         }" +
"      }," +
//"      {" +
//"         \"nome\":\"Parâmetros\"," +
//"         \"mensagem\":\"Parâmetros dentro dos padrões.\"," +
//"         \"resultado\":true," +
//"         \"foiCorrigido\":null," +
//"         \"result\":{" +
//"            \"snrDown\":9.7," +
//"            \"snrUp\":7.5," +
//"            \"atnDown\":5.7," +
//"            \"atnUp\":3," +
//"            \"velSincDown\":17661.1," +
//"            \"velSincUp\":1215.9," +
//"            \"velMaxDown\":22656," +
//"            \"velMaxUp\":1281.4" +
//"         }" +
//"      }," +
"      {" +
"         \"nome\":\"Confiabilidade de Rede\"," +
"         \"mensagem\":\"Rede confiável.\"," +
"         \"resultado\":true," +
"         \"foiCorrigido\":false," +
"         \"result\":{" +
"            \"pctDown\":99478088," +
"            \"pctUp\":370543583," +
"            \"crcDown\":62," +
"            \"crcUp\":1," +
"            \"fecDown\":0," +
"            \"fecUp\":2," +
"            \"resync\":0," +
"            \"tempoMedicao\":null," +
"            \"nome\":\"Confiabilidade de Rede\"," +
"            \"crcOk\":true," +
"            \"pctSuficiente\":true" +
"         }" +
"      }," +
"      {" +
"         \"nome\":\"Modulação\"," +
"         \"mensagem\":\"Modulação configurada corretamente.\"," +
"         \"resultado\":true," +
"         \"foiCorrigido\":false," +
"         \"result\":{" +
"            \"nome\":\"Modulação\"," +
"            \"modulacao\":\"adsl2plusmode\"," +
"            \"modulEnum\":\"ADSL\"" +
"         }" +
"      }," +
"      {" +
"         \"nome\":\"Profile\"," +
"         \"mensagem\":\"Profile configurado corretamente.\"," +
"         \"resultado\":true," +
"         \"foiCorrigido\":false," +
"         \"result\":{" +
"            \"nome\":\"Profile\"," +
"            \"profileUp\":\"1280000\"," +
"            \"profileDown\":\"17664000\"," +
"            \"down\":\"VEL_15360\"," +
"            \"up\":\"VEL_1024\"" +
"         }" +
"      }," +
"      {" +
"         \"nome\":\"Vlan Banda Larga\"," +
"         \"mensagem\":\"Vlan de Banda configurado corretamente.\"," +
"         \"resultado\":true," +
"         \"foiCorrigido\":false," +
"         \"result\":{" +
"            \"cvlan\":145," +
"            \"svlan\":465," +
"            \"pctDown\":null," +
"            \"pctUp\":null," +
"            \"state\":\"UP\"," +
"            \"nome\":\"Vlan Banda Larga\"" +
"         }" +
"      }," +
"      {" +
"         \"nome\":\"Vlan VoIP\"," +
"         \"mensagem\":\"Cliente sem VoIP.\"," +
"         \"resultado\":true," +
"         \"foiCorrigido\":false," +
"         \"result\":null" +
"      }," +
"      {" +
"         \"nome\":\"Vlan VoD/IPTV\"," +
"         \"mensagem\":\"Cliente sem TV Híbrida/IPTV.\"," +
"         \"resultado\":true," +
"         \"foiCorrigido\":false," +
"         \"result\":null" +
"      }," +
"      {" +
"         \"nome\":\"Vlan Multicast\"," +
"         \"mensagem\":\"Cliente sem TV Híbrida/IPTV.\"," +
"         \"resultado\":true," +
"         \"foiCorrigido\":false," +
"         \"result\":null" +
"      }," +
"      {" +
"         \"nome\":\"MAC do Equipamento\"," +
"         \"mensagem\":\"Mac identificado ac:c6:62:7e:40:08.\"," +
"         \"resultado\":true," +
"         \"foiCorrigido\":null," +
"         \"result\":{" +
"            \"nome\":\"MAC do Equipamento\"," +
"            \"mac\":\"ac:c6:62:7e:40:08\"" +
"         }" +
"      }" +
"   ]" +
"}";
    /**
     * Test of deserialize method, of class JacksonMapper.
     */
    @Test
    public void testDeserialize() throws Exception {
        System.out.println("deserialize");
        
        JacksonMapper instance = new JacksonMapper(FullTest.class);
        Object result = instance.deserialize(string);
        
    }

    /**
     * Test of serialize method, of class JacksonMapper.
     */
    @Test
    public void testSerialize() throws Exception {
        System.out.println("serialize");
        JacksonMapper instance = new JacksonMapper(FullTest.class);
        String result = instance.serialize(instance.deserialize(string));
        System.out.println(result);
    }
    
}
