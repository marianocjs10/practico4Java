import java.util.Arrays;
import java.util.Scanner;

public class Logica {

    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        String [][] paises = new String[4][4];
        for (int i=0; i < paises.length; i++){
            System.out.println("Ingrese un pais");
            paises[i][0] = sc.nextLine();
            for(int j=1; j<paises[i].length; j++) {
                System.out.println("Ingrese una ciudad");
                paises[i][j] = sc.nextLine();
            }
        }
        for (int i=0; i < paises.length; i++) {
            System.out.print("Pais: "+paises[i][0]+" Ciudades: ");
            for (int j = 1; j < paises[i].length; j++) {
                System.out.print(paises[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer Numero:");
        int x = sc.nextInt();
        System.out.println("Ingrese el segundo Numero:");
        int y = sc.nextInt();

        int [][] array1 = new int [x][y];
        for (int i=0; i < x; i++){
            for(int j=0; j < y; j++){
                System.out.println("Ingrese el numero en la posicion "+i+","+j+": ");
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array 1:");
        for(int i=0; i < x; i++){
            for(int j=0; j < y; j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }


        int [][] array2 = new int [y][x];
        for (int i=0; i < y; i++){
            for(int j=0; j < x; j++){
                System.out.println("Ingrese el numero en la posicion "+i+","+j+": ");
                array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array 2: ");
        for(int i=0; i < y; i++){
            for(int j=0; j < x; j++){
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }


        int [][] array3 = new int [x][y];
        for (int i=0; i < x; i++){
            for(int j=0; j < y; j++){
                array3[i][j] = array1[i][j] * array2[j][i];
            }
        }
        System.out.println("Array 3 (Array 1 * Array2):");
        for(int i=0; i < x; i++){
            for(int j=0; j < y; j++){
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void ejercicio3(){
        //Pide un numero para dimensionar el array.
        int X; int minimo=3; int maximo=10;
        do {
            X = Metodos.pedirNumero(minimo, maximo);
        }while (X<3 || X>10);

        //Se asignan los valores del array.
        int [][] array = Metodos.crearArrayMultidimensional(X);

        //Se muestra el array.
        System.out.println("Array ingresado: ");
        Metodos.mostrarArrayMultidimensional(array);

        //se suman las columnas en un nuevo array unidimensional
        int []suma=new int [X];
        for(int i = 0;i<X;i++){
            for(int j = 0;j<X;j++){
                suma[i] += array[j][i];
            }
        }
        //Se muestra el array unidimensional y se suman los valores en una variable.
        int sumaTotal = 0;
        System.out.println("Array suma de columnas: ");
        for(int i=0;i<X;i++) {
            System.out.print(suma[i]+" ");
            sumaTotal += suma[i];
        }
        System.out.println();
        //Se muestra la suma total.
        System.out.println("Suma total: "+ sumaTotal);
    }

    public static void ejercicio4(){
        Scanner sc=new Scanner(System.in);
        int X; int minimo=4; int maximo=10; int opcion;
        do {
            X = Metodos.pedirNumero(minimo, maximo);
        }while (X<4 || X>10);
        int [][] matriz = {};
        do{
            System.out.println("1) Rellenar TODA la matriz de números\n" +
                    "2) Suma de una fila\n" +
                    "3) Suma de una columna\n" +
                    "4) Sumar la diagonal principal\n" +
                    "5) Sumar la diagonal inversa \n" +
                    "6) La media de todos los valores de la matriz\n"+
                    "0) Salir");
            opcion = sc.nextInt();
            if(opcion==1){
                matriz= Metodos.crearArrayMultidimensional(X);
                System.out.println("Matriz ingresada: ");
                Metodos.mostrarArrayMultidimensional(matriz);
            } else if(opcion==2 && matriz.length!=0 && matriz[0].length!=0){
                int fila=0;
                while(fila>=0) {
                    System.out.println("Elija que fila desea sumar:");
                    fila=sc.nextInt();
                    if (fila < X) {
                        int sumaFila=0;
                        for (int i = 0; i<X; i++){
                            sumaFila += matriz[fila][i];
                        }
                        System.out.println("La suma de la fila"+fila+" es: "+sumaFila);
                        break;
                    } else {
                        System.out.println("El numero de la fila es incorrecto.");
                    }
                }

            } else if(opcion==3 && matriz.length!=0 && matriz[0].length!=0){
                int columna=0;
                while(columna>=0) {
                    System.out.print("Elija que columna desea sumar:");
                    columna = sc.nextInt();
                    if (columna < X) {
                        int sumaColumna = 0;
                        for (int i = 0; i < X; i++) {
                            sumaColumna += matriz[i][columna];
                        }
                        System.out.println("La suma de la columna " + columna + " es: " + sumaColumna);
                        break;
                    } else {
                        System.out.println("El numero de la columna es incorrecto.");
                    }
                }

            } else if(opcion==4 && matriz.length!=0 && matriz[0].length!=0){
                int sumaDiagonalPrincipal = 0;
                for(int i=0; i<X; i++){
                    sumaDiagonalPrincipal+=matriz[i][i];
                }
                System.out.println("La suma de la diagonal principal es: "+sumaDiagonalPrincipal);

            } else if(opcion==5 && matriz.length!=0 && matriz[0].length!=0){
                int sumaDiagonalInversa=0;
                for(int i=0; i<X; i++){
                    sumaDiagonalInversa+=matriz[i][(X-1)-i];
                }
                System.out.println("La suma de la diagonal inversa es: "+sumaDiagonalInversa);

            } else if(opcion==6 && matriz.length!=0 && matriz[0].length!=0){
                double media=0; double sumaTotal=0;
                for(int i=0; i<X; i++){
                    for(int j=0; j<X; j++){
                        sumaTotal+=matriz[i][j];
                    }
                }
                media=sumaTotal/(X*X);
                System.out.println("La media de la matriz es: "+media);

            } else if (opcion<0 || opcion>6) {
                System.out.println("Error. Ingrese una opcion valida:");
            } else {
                if(opcion!=0){
                System.out.println("Debe rellenar la matriz.");
                }
            }
        }while(opcion!=0);
    }

    public static void ejercicio5(){
        Scanner sc=new Scanner(System.in);
        String [][] maquinaExp = {
                {"kikat","32","10"},
                {"Chicles","2","50"},
                {"Caramelos de Menta","2","50"},
                {"Huevos kinder","25","10"},
                {"Cheetos","30","10"},
                {"Twix","26","10"},
                {"M&M'S","35","10"},
                {"Papas Lays","40","20"},
                {"Milkybar","30","10"},
                {"Alfajor Tofi","20","15"},
                {"Lata Coca","50","20"},
                {"Chitos","45","10"}
        };
        int opcion; int totalCompras=0;
        do {
            System.out.println("Ingrese la opcion que desea:\n"+
                    "1) Pedir Golosina\n"+
                    "2) Mostrar Golosina\n"+
                    "3) Rellenar Golosina\n"+
                    "4) Apagar Maquina"
                    );
            opcion=sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el numero de la golosina deseada (del 1 al 12):");
                        int golosina = sc.nextInt();
                        if(golosina<=12 && golosina>=1) {
                            golosina = golosina - 1;
                            if (!maquinaExp[golosina][2].equals("0")) {
                                System.out.println("Opcion elejida: " + maquinaExp[golosina][0]);
                                int stock = Integer.parseInt(maquinaExp[golosina][2]) - 1;
                                maquinaExp[golosina][2] = String.valueOf(stock);
                                totalCompras += Integer.parseInt(maquinaExp[golosina][1]);
                            } else {
                                System.out.println("Sin Stock. Elija otra golosina");
                            }
                        }else {
                            System.out.println("Opcion no valida.");
                        }
                        break;
                    case 2:
                        for(int i = 0;i<maquinaExp.length;i++){
                            for(int j = 0;j<maquinaExp[0].length;j++){
                                System.out.print(maquinaExp[i][j]+" ");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        sc.nextLine();
                        System.out.println("Ingrese la contraseña:");
                        String contrasenia = sc.nextLine();
                        if(contrasenia.equals("AdminXYZ")){
                            System.out.println("Ingrese el numero de la golosina a recargar:");
                            int golosinaARecargar = sc.nextInt();
                            golosinaARecargar=golosinaARecargar-1;
                            System.out.println("Indique la cantidad que va a recargar:");
                            int cantidadGolosina=sc.nextInt();
                            int stock = Integer.parseInt(maquinaExp[golosinaARecargar][2]) + cantidadGolosina;
                            maquinaExp[golosinaARecargar][2]= String.valueOf(stock);
                        } else {
                            System.out.println("Contraseña incorrecta.");
                        }
                        break;
                    case 4:
                        System.out.println("El total de la compra es: $"+totalCompras+"\n"+"Fin de la compra.");
                        opcion=4;
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }

        }while(opcion!=4);
    }
}
