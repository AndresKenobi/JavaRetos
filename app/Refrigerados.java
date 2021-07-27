/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


public class Refrigerados extends ProductosAlimentarios {
    
    // Atributos
    
    private final Integer TEMPERATURA = 10;
    private  Integer temperatura;
    
    // Constructores
    
    public Refrigerados(){
        
            this.temperatura = TEMPERATURA;
        
        }
    
    public Refrigerados(Double precioBase, Integer peso){
        
            this.precioBase = precioBase;
            this.pesoBase = peso;
            this.temperatura = TEMPERATURA; //???
    
        }
    
    public Refrigerados(Double precioBase, Integer peso, Integer temperatura){
            
            this.precioBase = precioBase;
            this.pesoBase = peso;
            this.temperatura = temperatura; //???
        }
    
    @Override
    public Double calcularPrecio(){
    //Codigo calcular precio final
    
        Double precioFinal3 = super.calcularPrecio(); 
        Double adicion = 0.0;
        
        if (temperatura >= 5 & temperatura < 10) {
                adicion += 20;
            }
        else if (temperatura >= 10 & temperatura <= 15) {
                adicion += 18;
            }
        else if (temperatura > 15) {
                adicion += 5; //
            }
        
        precioFinal3 = precioFinal3 + adicion;
        return precioFinal3;
        
    }
    
}
