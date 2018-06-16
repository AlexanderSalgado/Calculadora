/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Main.AbstractFactory;
import Aritmetica.Aritmetica;
import Convertor.Convertor;
import Main.FactoryProducer;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author rodol
 */
public class Ventana extends JPanel {
    public int WIDTH = 300, widthTF = 120, widthB = 80;
    public int HEIGHT = 300, heightTF = 30, heightB = 30;
    public JTextField textEntrada1,textResultado,textEntrada2, textConver;
    public JButton buttonConversor, buttonMas, buttonMenos, buttonDividir, buttonMulti;
    public AbstractFactory factory;
    

    public Ventana() {
        
        textEntrada1 = new JTextField();
        textEntrada1.setBounds(new Rectangle(20,40,widthTF,heightTF));
        textEntrada2 = new JTextField();
        textEntrada2.setBounds(new Rectangle(150,40,widthTF,heightTF));
        textConver = new JTextField();
        textConver.setBounds(new Rectangle(80,150,widthTF,heightTF));
        textResultado = new JTextField();
        textResultado.setBounds(new Rectangle(80,240,widthTF,heightTF));
        
        buttonConversor = new JButton("Convertir");
        buttonConversor.setBounds(new Rectangle(100,190,87,heightB));
        buttonMas = new JButton("+");
        buttonMas.setBounds(new Rectangle(50,96,41,heightB));
        buttonMenos = new JButton("-");
        buttonMenos.setBounds(new Rectangle(100,96,41,heightB));
        buttonDividir = new JButton("/");
        buttonDividir.setBounds(new Rectangle(150,96,41,heightB));
        buttonMulti = new JButton("*");
        buttonMulti.setBounds(new Rectangle(200,96,41,heightB));
        
        textEntrada1.setEditable(true);
        textEntrada2.setEditable(true);
        textConver.setEditable(true);
        textResultado.setEditable(false);
        
        buttonConversor.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent arg0){
               factory = FactoryProducer.getFactory("convertir");
               Convertor conversion = factory.getConvertor("convertir");
                textResultado.setText(Integer.toString(conversion.convertir(Integer.parseInt(textConver.getText()))));
           }
        });
        buttonMas.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent arg0){
               factory = FactoryProducer.getFactory("aritmetica");
               Aritmetica suma = factory.getAritmetica("sumar");
                textResultado.setText(Float.toString(suma.operar(Integer.parseInt(textEntrada1.getText()), Integer.parseInt(textEntrada2.getText()))));
           }
        });
        buttonMenos.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent arg0){
               factory = FactoryProducer.getFactory("aritmetica");
               Aritmetica resta = factory.getAritmetica("restar");
                textResultado.setText(Float.toString(resta.operar(Integer.parseInt(textEntrada1.getText()), Integer.parseInt(textEntrada2.getText()))));
           }
        });
        buttonMulti.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent arg0){
               factory = FactoryProducer.getFactory("aritmetica");
               Aritmetica multiplicar = factory.getAritmetica("multiplicar");
                textResultado.setText(Float.toString(multiplicar.operar(Integer.parseInt(textEntrada1.getText()), Integer.parseInt(textEntrada2.getText()))));
           }
        });
        buttonDividir.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent arg0){
               factory = FactoryProducer.getFactory("aritmetica");
               Aritmetica dividir = factory.getAritmetica("dividir");
                textResultado.setText(Float.toString(dividir.operar(Integer.parseInt(textEntrada1.getText()), Integer.parseInt(textEntrada2.getText()))));
           }
        });
        
        add(textEntrada1);
        add(buttonConversor);
        add(textResultado);
        add(textEntrada2);
        add(textConver);
        add(buttonMas);
        add(buttonMenos);
        add(buttonMulti);
        add(buttonDividir);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        
    }
            
    
}