/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

import Main.AbstractFactory;
import Convertor.Convertor;

/**
 *
 * @author rodol
 */
public class FactoryAritmetica  implements AbstractFactory{
    
    @Override
    public Convertor getConvertor(String dato){
        return null;
    }
    
    @Override
    public Aritmetica getAritmetica(String dato){
        switch(dato){
            case "multiplicar":
                return new Multiplicar();
            case "dividir":
                return new Dividir();
            case "sumar":
                return new Sumar();
            case "restar":
                return new Restar();  
        }
        return null;
    }
    
}
