/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizelere_hazirlik_oop;

/**
 *
 * @author cagda
 */
import java.text.DecimalFormat;
public class Stocks {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Stock s1 = new Stock("JAVA", "Sun microsystems");
        System.out.println("Stock symbol:" + s1.symbol + "\n"
                + "Stock name:" + s1.name + "\n"
                + "Previous closing price:" + s1.previousClosingPrice + "\n"
                + "Current price:" + s1.currentPrice + "\n"
                + "Change:" + s1.getChargePercent() + "\n");
    }
}

class Stock {

    String symbol, name;
    double previousClosingPrice = 4.35, currentPrice = 4.5;
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    

    public Stock(String new_symbol, String new_name) {
        this.symbol = new_symbol;
        this.name = new_name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public String getChargePercent() {
        double result = ((currentPrice - previousClosingPrice) * 100) / previousClosingPrice;
        return df.format(result);
    }
}
