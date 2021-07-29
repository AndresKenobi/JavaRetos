/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


public class PrecioTotal {
    
    // Atributos
    
    private Double tProductosAlimentarios;
    private Double tBebidas;
    private Double tRefrigerados;
    private ProductosAlimentarios[] listaProductosAlimentarios; //
       
    // Constructores
    
    public PrecioTotal(){
            
//            this.tProductosAlimentarios = 0.0;
//            this.tBebidas = 0.0;
//            this.tRefrigerados = 0.0;
            this.listaProductosAlimentarios = new ProductosAlimentarios[0];
        }
    public PrecioTotal(ProductosAlimentarios listaProductosAlimentarios[]){
            this.tProductosAlimentarios = 0.0;
            this.tBebidas = 0.0;
            this.tRefrigerados = 0.0;
            this.listaProductosAlimentarios = listaProductosAlimentarios;
        }
    // Metodo mostrar Total
    
    public void mostrarTotal(){
    // Codigo calculo de total    
        
    
            for(var tipo : listaProductosAlimentarios) {
            
                Double valor = tipo.calcularPrecio();
                
                tProductosAlimentarios += valor; //agrega todos los elementos de la lista

                if(tipo instanceof Bebidas) {
                    tBebidas += valor;           //agrega todos los elementos tipo bebida     
                    } 
                
                else if (tipo instanceof Refrigerados) {
                    tRefrigerados += valor;                    //agrega todos los elementos tipo refrigerados 
                    }
            
                }        
                      
        
            System.out.println("El precio total de los Productos Alimentarios es de " + tProductosAlimentarios);
            System.out.println("La suma del precio de las Bebidas es de " + tBebidas);
            System.out.println("La suma del precio de los Refrigerados es de " + tRefrigerados);
        }
    
}
