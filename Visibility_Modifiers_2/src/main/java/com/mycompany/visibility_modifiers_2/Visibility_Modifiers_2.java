/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.visibility_modifiers_2;
import com.mycompany.visibility_modifiers_2.deneme.A;
/**
 *
 * @author cagda
 */
public class Visibility_Modifiers_2 {

    public static void main(String[] args) {
        A a = new A("Try to create the instance of public constructor outside the package");
        System.out.println(a.msg);
        a.Display();
        // a.info();   // ulaşamıyoruz!!
    }
}
