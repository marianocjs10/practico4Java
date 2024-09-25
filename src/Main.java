import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Seleccione el ejercicio que desea:\n"+
                    "1) Ejercicio 1 - Paises y ciudades.\n"+
                    "2) Ejercicio 2 - Multiplicar filas por columnas de arrays.\n"+
                    "3) Ejercicio 3 - Suma de valores de array.\n"+
                    "4) Ejercicio 4 - Carga de array y suma de columna,fila y digonales.\n"+
                    "5) Ejercicio 5 - Maquina Expendedora.\n"+
                    "0) Salir:");
            opcion = sc.nextInt();
            if (opcion==1){
                Logica.ejercicio1();
            } else if (opcion==2) {
                Logica.ejercicio2();
            } else if (opcion==3){
                Logica.ejercicio3();
            } else if (opcion==4) {
                Logica.ejercicio4();
            } else if (opcion==5){
                Logica.ejercicio5();
            }
        }while (opcion != 0);
    }
}