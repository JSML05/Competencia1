/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author jsml
 */
public class Atleta {
    //Declaracion de atributos
    public double Tiempo;
    
    //Constructor no parametrizado

    public Atleta() {
    }
    
    //Constructor parametrizado

    public Atleta(double Tiempo) {
        this.Tiempo = Tiempo;
    }
    
    //Setters y getters

    public double getTiempo() {
        return Tiempo;
    }

    public void setTiempo(double Tiempo) {
        this.Tiempo = Tiempo;
    }
    
    
}
