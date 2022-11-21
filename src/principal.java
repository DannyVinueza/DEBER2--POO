import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        boolean pausa = false;

        while(!pausa){
            System.out.println("****** MENU ******");
            System.out.println("1. Ingresar 5 vehiculos");
            System.out.println("2. Mostrar vehiculos");
            System.out.println("3. Salir");
            System.out.print("Opcion?: ");
            op = sc.nextInt();
            switch(op){
                case 1:{
                    System.out.println("1. Ingresar 5 vehiculos");
                }break;
                case 2:{
                    System.out.println("2. Mostrar vehiculos");
                }break;
                case 3:{
                    System.out.println("Saliendo...");
                    pausa = true;
                }break;
            }
        }
    }
}
