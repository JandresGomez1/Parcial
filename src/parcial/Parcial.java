package parcial;

public class Parcial {
    public static void main(String[] args) {
  
       int valorUno = 8;
       int valorDos = 3;
       int total = 0; 
       int resultado = 0;
       for(int i = 0; i <= valorUno; ){  
        
           total = (i += valorDos);
           
           resultado = ( resultado + 1);
        }
      
      int resultante = (valorUno - total);
        if(resultante == 0){
            System.out.println("La division es exacta");
        
            }else{System.out.println("La divesion es inexacta");
        }
       
        System.out.println("EL resultado de la division es: " + resultado);
        System.out.println("el resultante es: " + resultante);
    }
        
}
    

