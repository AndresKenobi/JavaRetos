/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


public class Bebidas extends ProductosAlimentarios{
    
    // Atributos
    
    private char lugarOrigen;
    private final char LUGAR_ORIGEN = 'N';
    //ProductosAlimentarios objuno = new ProductosAlimentarios();
    
    // Constructores
    public Bebidas(){
        
        //this.precioBase = PRECIO_BASE;
        //this.pesoBase = PESO_BASE;
        this.lugarOrigen = LUGAR_ORIGEN; 
    
        }
    
    public Bebidas(Double precioBase, Integer peso){
            
            this.precioBase = precioBase;
            this.pesoBase = peso; //Es necesario este valor? No comprendo la inclusion
            this.lugarOrigen = LUGAR_ORIGEN; 
        }
    public Bebidas(Double precioBase, Integer peso, char lugarOrigen){
            
            this.precioBase = precioBase;
            this.pesoBase = peso;
            this.lugarOrigen = lugarOrigen;
        }
    
    public void comprobarLugarOrigen(char lugarOrigen){ //void cambiado boolean
    // Condicion validar lugar de origen N,I   
        
        Boolean respuesta = false;
        
        if (lugarOrigen == 'N' /*||lugarOrigen == 'n'*/) {
                respuesta = true;
            }
        if (lugarOrigen == 'I' /*||lugarOrigen == 'i'*/) {
                respuesta = false;
            }     
//                return respuesta;          
                
        }
    
    @Override
    public Double calcularPrecio(){
    // Codigo calcular precio final
        Integer adicion = (lugarOrigen == 'N' /*||lugarOrigen == 'n'*/) ? 5 :  10;
        
        Double precioFinal = super.calcularPrecio(); 
        
        precioFinal = precioFinal + adicion;
        
        return precioFinal;
        
        }
    
}
