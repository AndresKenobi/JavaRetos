/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


public class ProductosAlimentarios {
    
    // Atributos
    private final Double PRECIO_BASE = 80.0;
    private final Integer PESO_BASE = 5;
    private final char TIPO_ALIMENTO = 'N';
    
    protected Double precioBase; //se cambia a public, No se puede acceder a los atributos en las subclases
    protected Integer pesoBase;
    protected char tipoAlimento;
        
    // Constructores
    
    public ProductosAlimentarios(){
        
            this.precioBase = PRECIO_BASE;
            this.pesoBase = PESO_BASE;
            this.tipoAlimento = TIPO_ALIMENTO;
        }
    
    public ProductosAlimentarios(Double precioBase, Integer peso){
        
            this.precioBase = precioBase;
            this.pesoBase = peso;
            this.tipoAlimento = TIPO_ALIMENTO; //Es necesario este valor?
        }
    
    public ProductosAlimentarios(Double precioBase, Integer peso, char tipoAlimento){
            
            this.precioBase = precioBase;
            this.pesoBase = peso;
            this.tipoAlimento = tipoAlimento;
        }
    
    public void comprobarTipoAlimento(char tipoAlimento){ // Se cambia void porque necesitamos un valor
    // Condicion validar tipo de alimento N,C        
        
        Boolean respuesta = false;
        if (tipoAlimento == 'N' ||tipoAlimento == 'n') {
                respuesta = true;
            }
        if (tipoAlimento == 'C' ||tipoAlimento == 'c') {
                respuesta = false;
            }     
//                return respuesta;
           
        }
    
    public Double calcularPrecio(){
    // Codigo calcular precio final
    
        Integer adicion = (tipoAlimento == 'N' /*|| tipoAlimento == 'n'*/) ? 40 :  20;
        
        if (pesoBase >= 0 & pesoBase <= 9){ //pesoBase porque es el atributo, peso es el parametro
                adicion += 6;
            }
        
        else if (pesoBase > 9 & pesoBase <= 16){
                adicion += 8;
            }
        
        else if (pesoBase > 16){
                adicion += 20;
            }
        
        Double precioFinal = precioBase + adicion;
        return precioFinal;
    }
    
}

