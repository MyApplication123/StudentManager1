/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg17;

/**
 *
 * @author phong.th
 */
public class ExceptionC extends ExceptionB {
    public ExceptionC() {
    }
    
    public ExceptionC(String message) {
        super(message);
    }
    public void speak(){
        System.out.println("hehe");
    }
}
