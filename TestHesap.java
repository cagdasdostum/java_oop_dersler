/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizelere_hazirlik_oop;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author cagda
 */
public class TestHesap {
    public static void main(String[] args) {
        Hesap hesap1 = new Hesap();
        double[] odemeler = hesap1.aylikOdemeGetir();
        hesap1.paraYatir(2000);
        System.out.println("------------Hesap------------\n"
                + "Hesap id:" + hesap1.GetId() + "\n" +
                "Hesap Bakiyesi:" + hesap1.GetBakiye() + "\n" +
                "Aylık Faiz Oranı ve Aylık Ödeme Miktarı:" + Arrays.toString(odemeler) + "\n" +
                "Hesabın oluşturulduğu tarih:" + hesap1.GetOlusturulanTarih()+ "\n" );
    }
}

class Hesap {

    private int id = 0, yilSayisi;
    private double bakiye = 0, krediMiktari, yillikFaizOrani = 0;
    private Date olusturulanTarih;

    public Hesap() {
        this(2, 2000, 5.6, 20, 20000);
    }

    public Hesap(int id, double bakiye, double yillikFaizOrani, int yilSayisi, double krediMiktari) {
        this.id = id;
        this.bakiye = bakiye;
        this.yillikFaizOrani = yillikFaizOrani;
        this.yilSayisi = yilSayisi;
        this.krediMiktari = krediMiktari;
    }

    public int GetId() {
        return id;
    }

    public void SetId(int id) {
        this.id = id;
    }

    public int GetYilSayisi() {
        return yilSayisi;
    }

    public void SetYilSayisi(int yilSayisi) {
        this.yilSayisi = yilSayisi;
    }

    public double GetBakiye() {
        return bakiye;
    }

    public void SetBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public double GetYillikFaizOrani() {
        return yillikFaizOrani;
    }

    public void SetYillikFaizOrani(double yillikFaizOrani) {
        this.yillikFaizOrani = yillikFaizOrani;
    }

    public double GetKrediMiktari() {
        return krediMiktari;
    }

    public void SetKrediMiktari(double krediMiktari) {
        this.krediMiktari = krediMiktari;
    }

    public Date GetOlusturulanTarih() {
        return olusturulanTarih;
    }

    public double[] aylikOdemeGetir() {
        double aylikFaizOrani = yillikFaizOrani / 12;
        double aylikOdemeMiktari = krediMiktari / (yilSayisi * 12);
        double[] dizi = new double[2];
        dizi[0] = aylikFaizOrani;
        dizi[1] = aylikOdemeMiktari;
        return dizi;
    }

    public double paraCek(double miktar) {
        bakiye -= miktar;
        return bakiye;
    }

    public double paraYatir(double miktar) {
        bakiye += miktar;
        return bakiye;
    }

}
