/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teststack;

/**
 *
 * @author cagda
 */
public class TestStack {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Solution sol1 = new Solution();
        System.out.println(sol1.isPalindrome(121));
        
    }
}

class Solution {
    public boolean isPalindrome(int x) {

        int tempX = x;
        int kalan;
        int yeniSayi=0;


        while(tempX != 0) {
            kalan = tempX / 10;
            tempX /= 10;
            yeniSayi = (kalan * 10) + kalan;
            System.out.println(yeniSayi);

        }

        if(yeniSayi == x) {
            return true;
        }
        else 
            return false;
    }
    
}
