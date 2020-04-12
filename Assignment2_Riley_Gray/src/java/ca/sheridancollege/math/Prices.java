/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.math;

/**
 *
 * @author Riley
 */
public class Prices {
    public double subTotal(int quantity, double price){
        double sub= (Math.round((quantity*price)*100));
        double subR= sub/100;
        return subR;
    }
    public double tax(double sub){
        double tax= (Math.round((sub*0.13)*100));
        double taxR= tax/100;
        return taxR;
    }
    public double total(double sub, double tax){
        double total= sub+tax;
        return total;
    }
}
