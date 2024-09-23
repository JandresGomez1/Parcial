package parcial;
import java.util.Scanner;

public class Parcial {
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       
       System.out.println("Digite el dividiendo");
       int valorUno = in.nextInt();
       
       System.out.println("Digite el divisor");
       int valorDos = in.nextInt();
       int resultado = 0;
       int i;
       
       for(i = valorDos; i <= valorUno;i=i+valorDos ){  
           resultado = ( resultado + 1);
        }
        i = (i-valorDos);
      int residuo = (valorUno - i);
        if(residuo == 0){
            System.out.println("La division es exacta");
        
            }else{System.out.println("La division es inexacta");
        }
       
        System.out.println("EL resultado de la division es: " + resultado);
        System.out.println("El residuo es: " + residuo);
    }
        
}
    

