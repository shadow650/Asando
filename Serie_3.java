package serie_3;
import java.util.Scanner;
public class Serie_3 {
    public static void main(String[] args) {
        int CA1, CA2, CA3, CA4, NO1, NO2, NO3, NO4, AUX1=0;
        Scanner sc = new Scanner( System.in );
        System.out.println("Ingrese el primer número de carnet: ");
        CA1 = sc.nextInt();
        System.out.println("Ingrese el segundo número de carnet: ");
        CA2 = sc.nextInt();
        System.out.println("Ingrese el tercer número de carnet: ");
        CA3 = sc.nextInt();
        System.out.println("Ingrese el cuarto número de carnet: ");
        CA4 = sc.nextInt();
        System.out.println("Ingrese la primera nota: ");
        NO1 = sc.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        NO2 = sc.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        NO3 = sc.nextInt();
        System.out.println("Ingrese la cuarta nota: ");
        NO4 = sc.nextInt();
        for (int i=0; i<=3;i++){
            for (int j=0; j<=3; j++){
                if (NO1<NO2){
                    AUX1=NO1;
                    NO1=NO2;
                    NO2=AUX1;
                    
                    AUX1=CA1;
                    CA1=CA2;
                    CA2=AUX1;
                }
                if (NO2<NO3){
                    AUX1=NO2;
                    NO2=NO3;
                    NO3=AUX1;
                    
                    AUX1=CA2;
                    CA2=CA3;
                    CA3=AUX1;
                }
                if (NO3<NO4){
                    AUX1=NO3;
                    NO3=NO4;
                    NO4=AUX1;
                    
                    AUX1=CA3;
                    CA3=CA4;
                    CA4=AUX1;
                }
            }
        }
        
        System.out.println("Las notas de mayor a menor son: \nCarnet 1: "+CA1+"\nNota: "+NO1+"\n\nCarnet 2: "+CA2+"\nNota: "+NO2+"\n\nCarnet 3: "+CA3+"\nNota: "+NO3+"\n\nCarnet 4: "+CA4+"\nNota: "+NO4);
    }
    
}