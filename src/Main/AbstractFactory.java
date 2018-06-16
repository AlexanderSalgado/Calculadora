/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Aritmetica.Aritmetica;
import Convertor.Convertor;

/**
 *
 * @author rodol
 */
public interface AbstractFactory {
    Convertor getConvertor(String type);
    Aritmetica getAritmetica(String type);
}
