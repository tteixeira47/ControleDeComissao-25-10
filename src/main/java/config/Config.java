/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ResourceBundle;

public class Config {

    //Define o idioma de internacionalização
    public static final ResourceBundle i18n = ResourceBundle.getBundle(String.format("i18n.Bundle_%s", "pt_BR"));

    //Define o formatador de data
    public static final DateTimeFormatter df
            = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

    //Define o formatador de número-moeda
    public static final NumberFormat nfc
            = NumberFormat.getCurrencyInstance();

    //Define o formatador de número
    public static final NumberFormat nf
            = NumberFormat.getNumberInstance();
    
    //Constante de Update
    public static final char ALTERAR = 'A';
    
    //Constante de Create
    public static final char INCLUIR = 'I';
    
    //Constante de Delete
    public static final char DELETAR = 'D';


}
