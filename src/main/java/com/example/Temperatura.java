package com.example;

import java.util.Set;

/*
 * Rappresenta una temperatura espressa in gradi Celsius. Permette conversioni in Fahrenheit e Kelvin, e modifiche del valore attraverso incrementi o decrementi.
*/

public class Temperatura {
    /*
     * Il Valore della temperatura in gradi Celsius
    */
    protected double valoreCelsius;

    /*
     * Costruisce un oggetto Temperatura a partire da un valore in gradi Celsius.
    */
    public Temperatura(double valoreCelsius){
        this.valoreCelsius = valoreCelsius;
    }

    /*
     * Aumenta la temperatura di un certo valore.
     * @param delta la quantita' di gradi da sommare alla temperatura corrente
    */
    public void aumenta(double delta){
        this.valoreCelsius += delta; 
    }

    /*
     * Diminuisce la temperatura di un certo valore.
     * @param delta la quantita' di gradi da sottrare alla temperatura corrente
    */
    public void diminuisci(double delta){
        this.valoreCelsius -= delta; 
    }

    /*
     * Restituisce il valore attuale della temperatura in gradi Celsius.
     * @return il valore della temperatura in Celsius
    */
    public double getValoreCelsius() {
        return valoreCelsius;
    }

    /*
     * Restituisce la temperatura convertita in gradi Fahrenheit.
     * @return il valore della temperatura in Fahrenheit
    */
    public double inFahrenheit(){
        return this.valoreCelsius * (9/5) + 32;
    }

    /*
     * Restituisce la temperatura convertita in Kelvin.
     * @return il valore della temperatura in Kelvin
    */
    public double inKelvin(){
        return this.valoreCelsius + 273.15;
    }

}
