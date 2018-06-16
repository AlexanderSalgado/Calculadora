/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertor;

/**
 *
 * @author rodol
 */
public class Conversor implements Convertor{

    @Override
    public int convertir(int numero) {
        String binario = "";
       while(numero/2 != 0){
           binario = Integer.toString(numero%2) + binario;
           numero = numero /2;
       }
       binario = Integer.toString(numero) + binario;
        return Integer.parseInt(binario);
    }
     
}