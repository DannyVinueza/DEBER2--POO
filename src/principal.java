import java.util.Scanner;
import javax.swing.JOptionPane;
public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        boolean pausa = false;
        vehiculos arregloVehiculos[] = new vehiculos[5];

        while(!pausa){
            System.out.println("\n-------------------------------------------------------------");
            System.out.println("\t\t****** MENU ******");
            System.out.println("\t1. Ingresar 5 vehiculos");
            System.out.println("\t2. Mostrar vehiculos");
            System.out.println("\t3. Salir");
            System.out.print("\tOpcion?: ");
            op = sc.nextInt();
            switch(op){
                case 1:{
                    System.out.println("1. Ingresar 5 vehiculos");
                    sc.nextLine();
                    for (int i = 0; i < arregloVehiculos.length; i++){
                        arregloVehiculos[i] = new vehiculos();
                        String inMarca = " ", inModelo = " ", inColor = " ", inTipo = " ";
                        int intAnio = 0;
                        System.out.println("\n\n-------------------------------------------------------------");

                        System.out.print("Ingrese la marca del vehiculo " + (i + 1) + ": ");
                        inMarca = sc.nextLine();
                        arregloVehiculos[i].setMarca(inMarca);

                        System.out.print("Ingrese el modelo del vehiculo " + (i + 1) + ": ");
                        //sc.nextLine();
                        inModelo = sc.nextLine();
                        arregloVehiculos[i].setModelo(inModelo);

                        System.out.print("Ingrese el anio del vehiculo " + (i + 1) + ": ");
                        intAnio = sc.nextInt();
                        arregloVehiculos[i].setAnio(intAnio);

                        System.out.print("Ingrese el color del vehiculo " + (i + 1) + ": ");
                        sc.nextLine();
                        inColor = sc.nextLine();
                        arregloVehiculos[i].setColor(inColor);

                        System.out.print("Ingrese la categoria de vehiculo " + (i + 1) + ": ");
                        //sc.nextLine();
                        inTipo = sc.nextLine();
                        arregloVehiculos[i].setTipo(inTipo);
                    }
                }break;
                case 2:{
                    System.out.println("2. Mostrar vehiculos");
                    for (int j = 0; j < arregloVehiculos.length;j++){
                        System.out.println("\n\n-------------------------------------------------------------");
                        System.out.println("La marca del vehiculo " + ( j + 1) + " es: " + arregloVehiculos[j].getMarca());
                        System.out.println("El modelo del vehiculo " + ( j + 1) + " es: " + arregloVehiculos[j].getModelo());
                        System.out.println("El anio del vehiculo " + ( j + 1) + " es: " + arregloVehiculos[j].getAnio());
                        System.out.println("El color del vehiculo " + ( j + 1) + " es: " + arregloVehiculos[j].getColor());
                        System.out.println("Categoria del vehiculo " + ( j + 1) + " es: " + arregloVehiculos[j].getTipo());
                    }
                }break;
                case 3:{
                    System.out.println("Saliendo...");
                    pausa = true;
                }break;
            }
        }
    }
}
