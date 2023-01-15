/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReyesKainan;

/**
 *
 * @author Reyes Fam
 */
public class ParentClass {
    
    public double plainRiceM;
    public double javaRiceM;
    public double barbequeM;
    public double porkSisigM;
    public double liempoM;  
    
    public double spriteD;
    public double cokeD;
    public double icedTD;
    public double pineappleD;
    public double rootBeerD; 
    
    public double meals;
    public double refreshments;
    public double totalMD;
    public double totalTotal;
    
    public double getAmount(){
        meals = plainRiceM + javaRiceM + barbequeM + porkSisigM + liempoM;
        refreshments = spriteD + cokeD + icedTD + pineappleD + rootBeerD; 
        
        totalMD = meals + refreshments;
        
        totalTotal = totalMD;
        return totalTotal;
    }
    
    public double priceplainRiceM = 20.0;
    public double pricejavaRiceM = 45.0; 
    public double pricebarbequeM = 65.0; 
    public double priceporkSisigM = 145.0;
    public double priceliempoM = 165.0;  
    
    public double pricespriteD = 37.0;
    public double pricecokeD = 35.0;
    public double priceicedTD = 40.0;
    public double pricepineappleD = 36.0;
    public double pricerootBeerD = 45.0; 
    
    public double tax = 0.12;
    
    public Double actTax(double taxAmount){
        
    double rTax = taxAmount * tax;
    return rTax;
    }
}
