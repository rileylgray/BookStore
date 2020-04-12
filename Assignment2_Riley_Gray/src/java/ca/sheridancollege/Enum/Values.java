/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.Enum;

import java.util.Random;

/**
 *
 * @author Riley
 */
public class Values {
    
    
    public enum Name {
    
    Riley,
    Jump,
    Cool,
    Math,
    Java,
    Crazy,
    What,
    SQL,
    Ezio,
    Book,
    Zelda,
    Pound,
    Moist,
    Cellar_Door,
    Altair,
    Houndoom,
    Palkia,
    Pikachu,
    Coffee,
    Mythology,
    
    }
    
    public static Name getRandomValue() {
            Random random = new Random();
            return Name.values()[random.nextInt(Name.values().length)];
        }
    
}
