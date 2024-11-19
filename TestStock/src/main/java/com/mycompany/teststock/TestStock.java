/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teststock;

/**
 *
 * @author cagda
 */
public class TestStock {

    public static void main(String[] args) {
        Stock stock1 = new Stock("TUPRS", "TÜPRAŞ", 151.02, 152.00);
        System.out.println("\tTÜPRAŞ" +  "\nMaliyet: " + stock1.previousClosingPrice + "\nKapanış Fiyatı: " + stock1.currentPrice + "\nFark %: " + stock1.getChargePercent());
    }
}

class Stock {
    String symbol, name;
    double previousClosingPrice, currentPrice;
    
    Stock(String new_symbol, String new_name, double previousClosingPrice, double currentPrice) {
        this.symbol = new_symbol;
        this.name = new_name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
    
    public double getChargePercent() {
        
        double fark = previousClosingPrice - currentPrice;
        
        double result = (Math.abs(fark) * 100) / previousClosingPrice;
        return result;
            
    }
    
}
