/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiones;

//@author andre

public class Inversiones {
//Entradas - Atributos
    double vTiempo;
    double Vmonto;
    int vInteres;
//Metodos
    
    public static String validarInversion(int vTiempo, double vMonto, double vInteres){
        //Interes simple....
            double iSimple = vMonto*vInteres*vTiempo;
        //interes compuesto....
            double iCompuesto = vMonto * (Math.pow((1 + vInteres), vTiempo) - 1);
        //Respuesta
            var respuesta =  iCompuesto - iSimple;
            
            if (respuesta > 0) {
                return String.format("La diferencia en el total de intereses generados para el " +
                           "proyecto, si escogemos entre evaluarlo a una tasa de interés " +
                           "Compuesto y evaluarlo a una tasa de interés Simple, asciende " +
                           "a la cifra de: $%s",respuesta);
                //%.2f",respuesta para dos cifras decimales
            } 
            else {
                return "Faltan datos para calcular la diferencia en el total de intereses " +
                            "generados para el proyecto.";
            }

}

    public static void main(String[] args) {
        // Imprimir resultado
        System.out.println(validarInversion(12,2000000,0.05));
        
        
        
    }
    
}
