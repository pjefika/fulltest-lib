/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom.config;

import java.util.List;
import telecom.config.velocidade.VelocidadeDTO;

/**
 *
 * @author G0042204
 */
public class ProfileGpon extends ProfileConfig {

    private List<VelocidadeDTO> upValues;

    public ProfileGpon() {
    }

    public List<VelocidadeDTO> getUpValues() {
        return upValues;
    }

    public void setUpValues(List<VelocidadeDTO> upValues) {
        this.upValues = upValues;
    }

}
