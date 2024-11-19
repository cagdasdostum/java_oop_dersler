/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testpayment;

/**
 *
 * @author cagda
 */
public class TestPayment {

    public static void main(String[] args) {
        Payment [] payments=(
            new CreditCardPayment(35000, "Akt12423525"),
            new PayPalPayment(20000, "cagdas@gmail.com"),
            new CryptoPayment(100000, "0dcxc23250xc34n"),
            
        );
        
        
        
    }


class Payment {

    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public void processPayment() {
        System.out.println("Ödeme işleniyor: " + amount + " TL");
    }

    public void initalize() {
        System.out.println("Ödeme işlemi başlatılıyor...");
    }
}

class CreditCardPayment extends Payment {

    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Kredi kartı ile ödeme yapılıyor " + getAmount()
                + "TL. Kart numarası: " + cardNumber);

    }

    @Override
    public void initalize() {
        System.out.println("kredi kartı ile ödeme işlemi başlatılıyor...");
    }

    public void validateCard() {
        System.out.println("kart numarası: " + cardNumber);
    }

}

class PayPalPayment extends Payment {

    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Paypal ile ödeme yapılıyor " + getAmount()
                + "TL. Paypal email: " + email);

    }

    @Override
    public void initalize() {
        System.out.println("paypal ile ödeme işlemi başlatılıyor...");
    }

    public void authentiacteUser() {
        System.out.println("kullanıcı paypal ile doğrulanıyor: " + email);
    }
}

class CryptoPayment extends Payment {

    private String walletAdress;

    public CryptoPayment(double amount, String walletAdress) {
        super(amount);
        this.walletAdress = walletAdress;
    }

    @Override
    public void processPayment() {
        System.out.println("Kripto para ile ödeme yapılıyor " + getAmount()
                + "TL. Cüzdan adresi " + walletAdress);

    }

    @Override
    public void initalize() {
        System.out.println("kripto para ile ödeme işlemi başlatılıyor...");
    }

    public void verifyTransaction() {
        System.out.println("işlem blok zincirinde doğrulanıyor" + walletAdress);
        
    }

}
