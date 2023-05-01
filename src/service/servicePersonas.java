/*
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
 */
package service;

import entidades.Personas;
import java.util.Scanner;

public class servicePersonas {

    Scanner leer = new Scanner(System.in);

    public Personas AltaPersonas;

    {

        Personas x = new Personas();

        System.out.println(" Ingres el nombre del alumno");
        x.setNombre(leer.next());
        System.out.println(" Ingresa la edad ");
        x.setEdad(leer.nextInt());
        System.out.println(" Ingrse la altura del alumno en metros");
        x.setAltura(leer.nextDouble());
        System.out.println("Ingrese el peso en kg ");
        x.setPeso(leer.nextDouble());
        System.out.println(" ingres el sexo ( H,M,O )");
        x.setSexo((char) leer.nextInt());
        char Sexo = 0;
        while (Sexo != 'H' && Sexo != 'M' && Sexo != 'O') {
           System.out.println(" Ingrese una respuesta correcta");
            x.setSexo((char) leer.nextInt());
        }

    }

    public int IMC;

    {

   double altura = 0, peso = 0, imc = 0;

        Scanner leer = new Scanner(System.in);

        IMC = (int) (peso / (altura * altura));

        if (imc < 20) {

            System.out.println(" persona fuera de peso");

        } else if (imc >= 20 && imc <= 25) {
            System.out.println(" tu peso es normal");

        } else {
            System.out.println(" estas excedido de peso");
                
                
        }

    }
}
