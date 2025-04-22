/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorapro2;
import java.util.Scanner;

public class CalculadoraPro2 {

   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //Mensaje de bienvenida
        System.out.println("Bienvenido a la calculadora++ ");
        
        //Introducir valores numericos
        double numero1, numero2, resultadoSuma, resultadoResta, resultadoMultiplicacion, resultadoDivision, resultadoResto;
        
        System.out.println("Introduce un numero: ");
        numero1 = teclado.nextDouble();
        System.out.println("Introduce otro numero: ");
        numero2 = teclado.nextDouble();
        
        //crear operaciones
        resultadoSuma = (numero1 + numero2);
        resultadoResta = (numero1 - numero2);
        resultadoMultiplicacion = (numero1 * numero2);
        resultadoDivision = (numero1 / numero2);
        resultadoResto = (numero1 % numero2);
        
        //crear opciones
        System.out.println("Pulsa 1 para Sumar");
        System.out.println("Pulsa 2 para Restar");
        System.out.println("Pulsa 3 para Multiplicar");
        System.out.println("Pulsa 4 para Dividir");
        System.out.println("Pulse 5 para el Resto");
        System.out.println("Pulse 6 para introducir Nuevos valores numericos");
        System.out.println("Pulse 7 para Salir");
        
        //crear booleano para que se repita el menu si es numero introducido hace que sea true
        boolean opciones = true;
        int menu;
        menu = teclado.nextInt();
        
        while (opciones) {
            switch (menu) {
                case 1: 
                    System.out.println("El resultado de la suma es: " + resultadoSuma);
                    break;
                case 2: 
                    System.out.println("El resultado de la resta es: " + resultadoResta);
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);
                    break;
                case 4:
                    System.out.println("El resultado de la division es: " + resultadoDivision);
                    break;
                case 5:
                    System.out.println("El resultado del resto es: " + resultadoResto);
                    break;
                case 6:
                    System.out.println("Introducir el primer valor: ");
                    numero1 = teclado.nextDouble();
                    System.out.println("Introduce el segundo valor: ");
                    numero2 = teclado.nextDouble();
                    break;
                case 7:
                    opciones = false;
                    break;
                default: 
                    System.out.println("Opcion no valida, intentelo de nuevo ");
                    break;
                 
                
            }//fin switch
            //Mostrar las opciones por pantalla de nuevo
            if (opciones) {
                System.out.println("Pulsa 1 para Sumar");
                System.out.println("Pulsa 2 para Restar");
                System.out.println("Pulsa 3 para Multiplicar");
                System.out.println("Pulsa 4 para Dividir");
                System.out.println("Pulse 5 para el Resto");
                System.out.println("Pulse 6 para introducir Nuevos valores numericos");
                System.out.println("Pulse 7 para Salir"); 
                
            }//cierre if
            
                
            
            menu = teclado.nextInt();
        }//fin while
        
        System.out.println("ADIOS"); 
        
    }//cierre main
    
}//fin clase