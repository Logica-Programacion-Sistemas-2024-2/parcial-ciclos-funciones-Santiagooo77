
package parcial1g1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        // Implementar la logica de solucion
        int vehiculos = 0;
        int metros = 0;
        int kilometros = 0;
        int gasolinaConsumida = 0;
        float litrosdegasolina = 0; 

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos vehiculos participaron: ");
        vehiculos = sc.nextInt();

        for(int i = 1; i <= vehiculos; i++){
        System.out.println("ingrese cuantos metros recorrieron:" + i);
        metros = sc.nextInt();
        kilometros = metros/1000;
        gasolinaConsumida = calcularConsumoGasolina(kilometros);
        System.out.println("vehiculo " + i + "" + kilometros);

        litrosdegasolina = (kilometros * 55 /750);
        System.out.println("vehiculo"+ i + ""+ kilometros + litrosdegasolina);


    if (metros < 0){
        break;
    }
    
         }
    }
    
         /*  Implemente una funcion llamada calcularConsumoGasolina que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Un float representando los km recorridos
        * Retorna:
            - Un float representando los litros de gasolina consumidos
    */
    //------------------------------------------------------------------
    //Implemente la funcion en este espacio
    public static float calcularConsumoGasolina(float kmRecorrido){
        try {
            return ((kmRecorrido * 55) / 750);
            

        } catch (Exception e) {

        

            
        }
        
    }
    //------------------------------------------------------------------

}
