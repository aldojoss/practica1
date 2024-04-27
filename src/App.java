import java.util.Scanner;
import java.util.InputMismatchException;


public class App {

    Scanner leer = new Scanner(System.in);
        int num1, num2,num3, mayor1,mayor2,menor;   
          
    public static void main(String[] args) {
       App ap=new App();
       ap.mostrar();
        
    }
//pedirle los datos al usuario , aqui van los try catch y aqui mismo llamo a los otros dos
public void mostrar(){ //aqui mismo llamo a los otros dos metodos
        
//metodo try catch

    
      //hacer que los 3 numeros sean diferentes
      
do {
        try {
        System.out.println("ingrese 3 numeros enteros diferentes");
        System.out.println("ingrese num 1");
        num1=leer.nextInt();
        System.out.println("ingrese num 2");
        num2=leer.nextInt();  
        System.out.println("ingrese num 3");
        num3=leer.nextInt();
 
        if (num1==num2||num2==num3||num1==num3) {
 System.out.println("Los 3 numeros tiene que ser diferentes!!!!");
        }
         
   
} catch (Exception e) {
    System.out.println("valor no valido");
    leer.nextLine();     //hacer que se repita el bucle si ingresa datos no validos como letras y asi
}

} while (num1==num2||num2==num3||num1==num3);   // ahora que ya los num son dif calcular:

//calcular al primer mayor
if (num1>num2&&num1>num3) {
    
    mayor1=num1;
}else if (num2>num1&&num2>num3) {

    mayor1=num2;
}else{
    mayor1=num3;
}
//calcular menor

if (num1<num2&&num1<num3) {
    
    menor=num1;
}else if (num2<num1&&num2<num3) {

    menor=num2;
}else{
    menor=num3;
}

//calcular el segundo mayor o segundo menor
if (num1<mayor1&&num1>menor) {
    
    mayor2=num1;
}else if (num2<mayor1&&num2>menor) {
mayor2=num2;

}else{

    mayor2=num3;
}

//mostrar la suma y resta y el mayor de los 3
App ap=new App();
        

      System.out.println("la suma de menores es: "+ap.sumademenores(mayor2,menor));  
      System.out.println("y la resta de mayores es: "+ap.restademayores(mayor1, mayor2));
     System.out.println(" El numero mayor de los 3 digitos ingresados es: "+mayor1);    

       }

        

public static int restademayores(int uno, int dos){
                                                             //primer metodo para restar los mayore
    return uno-dos;

}

public static int sumademenores(int uno, int dos){         //metodo para sumar los menores

    return uno+dos;
}



}



