package ejercicios_de_repaso;

import java.util.Scanner;
        
public class Ejercicios_de_Repaso {

public static Scanner vini = new Scanner(System.in);    
public static Scanner rm = new Scanner(System.in); //para strings

    public static void main(String[] args) {
       try{
           int opc = 0;
          do{
              System.out.println("__________________________");
              System.out.println("Bienvenid@ a Ejercicios de Repaso");
              System.out.println("1. Veamos si podemos formar la palabra        2. Numeros primero      3. Ordenar alfabeticamente");
              System.out.println("4. Codificar cadenas      5. Jugando con arreglos     6. Salir");
              opc= vini.nextInt();
              switch(opc){
                  case 1:palabra();break;
                  case 2:
                      System.out.println("Ingrese cadena con numero y letras");
                      String cad = rm.nextLine();
                      System.out.println(numeros(cad));
                      break;
                  case 3:
                      System.out.println("Ingrese cadena");
                      String _cad = rm.nextLine();
                      alfabeto(_cad);
                      break;
                  case 4:
                      System.out.println(codificar());
                      break;
                  case 5:
                      arreglos();
                      break;
                  default: System.out.println("Opcion no valida");break;
              }
          }while(opc != 6); 
       }catch(Exception e){System.out.println("Usted ha ingresado un caracter no valido");} 
    }   
    
public static void palabra(){
    String cad1 = "";
    String cad2 = "";
    String cadmayor = "";
    String cadmenor = "";
    int acum = 0;
    do{
        System.out.println("Ingrese cadenas con tamaño diferentes");
        System.out.println("Ingrese frase");
        cad1 = rm.nextLine();
        System.out.println("Ingrese frase");
        cad2 = rm.nextLine();
        
    }while(cad1.length()== cad2.length());
    
    if(cad1.length()>cad2.length()){cadmayor = cad1; cadmenor = cad2;
    }else{cadmayor = cad2; cadmenor = cad1;}
     
    for (int i = 0; i < cadmenor.length(); i++) {
        char letra = cadmenor.charAt(i);
        for (int j = 0; j < cadmayor.length(); j++) {
           char letra2 = cadmayor.charAt(j);
            if(letra==letra2){ acum+=1;
        }
    }
  }
    if(acum>=cadmenor.length()){System.out.println("Si de puede armar "+cadmenor);
    }else{System.out.println("No se puede armar "+ cadmenor);}

}

public static String numeros(String cad){
    cad = cad.replace(" ","");
    String num= "";
    String car= "";
    for (int i = 0; i < cad.length(); i++) {
        char letra = cad.charAt(i);
        if(letra>=48 && letra<=57){
            num+=letra;
        }else { car+=letra; }   
    }
    String newcad = num+car;
        
return newcad;
}

public static void alfabeto(String cad){
    cad = cad.toLowerCase();
    char[] _cad = cad.toCharArray();
    
    for (int i = 0; i < _cad.length; i++) {
        System.out.println(_cad[i]);
        for (int j = i; j < 10; j++) {
            
        }
    }
}

public static String codificar(){
    
    System.out.println("Ingrese texto a codificar");
    String texto = rm.nextLine();
    texto = texto.toLowerCase().replace("", "-");
    
    System.out.println(texto);
    for (int i = 0; i < texto.length(); i++) {
        char _letra = texto.charAt(i);
        
        if(_letra<= 122 && _letra>=97){   
            int letra = (int) _letra;
            letra-=96;
        }           
        }
    
    
    return texto;
    }

public static void arreglos(){
    int[] array = new int[10];
    for (int i = 0; i < 10; i++) {
        System.out.println("Ingrese numero");
        array[i] = vini.nextInt();
    }
    for (int i = 0; i <= array.length-1; i++) {
        System.out.print(array[i]+"  -  ");
    }
    System.out.println();
   }
}
//Ing diculpe que no pude completar todos los ejercicios :/