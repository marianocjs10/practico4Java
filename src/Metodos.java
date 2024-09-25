import java.util.Arrays;
import java.util.Scanner;

public class Metodos {

    public static int pedirNumero(int minimo, int maximo){
        Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un valor mayor o igual a "+minimo+" y menor o igual a "+maximo);
            return sc.nextInt();
    }

    public static int[][] crearArrayMultidimensional(int X){
        Scanner sc = new Scanner(System.in);
        int [][] array = new int[X][X];
        for(int i = 0;i<X;i++){
            for(int j = 0;j<X;j++){
                System.out.println("Ingrese el valor de la celda "+i+","+j+": ");
                array[i][j]= sc.nextInt();
            }
        }
        return array;
    }

    public static void mostrarArrayMultidimensional(int array[][]){
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

}
