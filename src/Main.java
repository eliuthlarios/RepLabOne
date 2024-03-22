import java.util.Scanner;


public class Main {
    public static float operaciones(float Num1, float Num2,int opc){
        if(opc==1){
            return Num1+Num2;
        }else if(opc==2){
           return Num1-Num2;
        }else if(opc==3){
            return Num1*Num2;
        }else if(opc==4){
            if(Num2!=0){return Num1/Num2;}
            else{System.out.println("Operacion Invalida. ");return 0;}
        }else{
            return 0;
        }

    }
    public static void bucles(){
        Scanner Entrada = new Scanner(System.in);
        float Num1,Num2; int OpcionOperacion;

        do {
            System.out.println("Calculadora Uca");
            System.out.println("1.Sumar 2.Restar 3.Multiplicar 4.Dividir 5.Salir");
            System.out.println("Ingrese Opcion: ");
            OpcionOperacion= Entrada.nextInt();


            if(OpcionOperacion!=5){
                System.out.println("Ingrese el primer numero a operar");
                Num1= Entrada.nextFloat();
                System.out.println("Ingrese el segundo numero a operar");
                Num2= Entrada.nextFloat();
                if(OpcionOperacion==4 && Num2==0){System.out.println("operacion invalida");}else{
            System.out.println("El resultado es: "+operaciones(Num1,Num2,OpcionOperacion));}}

        }while(OpcionOperacion !=5);
    }
    public static void main(String[] args) {
        bucles();

    }
}