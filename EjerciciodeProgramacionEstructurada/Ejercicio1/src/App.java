/*Crear un programa para determinar la admisión de personas a una
disco. El programa le pedirá al usuario su edad y su género. Si el
usuario es menor de 18 años, no podrá entrar. Si la edad es mayor o
igual a 18 años y es mujer, podrá entrar al local, pero no podrá
consumir bebidas alcohólicas a menos que sea mayor de 20 años.
Si la edad es mayor o igual a 18 años y es hombre, se le deberá
revisar si porta armas, si porta armas, no podrá entrar al local; en
caso contrario, podrá entrar al local, pero no podrá consumir bebidas
alcohólicas a menos que sea mayor de 20 años*/

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner lector = new Scanner(System.in);

        // declaramos las variables 
       int edad;
       char genero;
       char armas;



        //pedimos los datos de entrada

        System.out.println("Si porta armas no podra entrar al local s/n :");
        armas =lector.next().charAt(0);

       System.out.println("Ingrese su edad: ");
       edad = lector.nextInt();
       
       System.out.println("Ingrese su genero: f/m");
       genero = lector.next().charAt(0);

       if (edad < 18){

       
       System.out.println("No podra entrar al local: ");
        
          // si la edad es mayor de 18
        } else if (edad >= 18){
        System.out.println("Podra entrar al local: ");

        switch (edad) {
        //si se cumple la condicion y es mujer podra entrar
        case 'F' -> {
        System.out.println(" Podra entrar al local: ");
         
        }
    }
       }else if (edad >=18){

       
       System.out.println("Si es mayor de 18 podra entrar: ");
       }
    
        
       switch (edad) {

        case 'M' -> {
        System.out.println(" Podra entrar al local: ");
         break;
       

    }
    }
}
}




           
    
