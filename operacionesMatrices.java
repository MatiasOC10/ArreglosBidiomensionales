import java.util.Scanner;

public class OperacionesMatrices {

    // Función para ingresar los valores de una matriz
    public static void completarMatrices(
        Scanner entrada,
        int[][] matriz,
        String nombre
    ) {

        System.out.println("\nIngrese los valores de la matriz " + nombre + ":");

        // Recorre las filas y columnas para llenar la matriz
        for (int fila = 0; fila < 2; fila++) {

            for (int columna = 0; columna < 3; columna++) {

                System.out.print(
                    nombre + "[" + fila + "][" + columna + "]: "
                );

                matriz[fila][columna] = entrada.nextInt();
            }
        }
    }


    // Función para realizar la suma de dos matrices
    public static void sumaMatriz(
        int[][] matrizA,
        int[][] matrizB,
        int[][] resultado
    ) {

        // Suma los valores que se encuentran en la misma posición
        for (int fila = 0; fila < 2; fila++) {

            for (int columna = 0; columna < 3; columna++) {

                resultado[fila][columna] =
                    matrizA[fila][columna] + matrizB[fila][columna];
            }
        }
    }


    // Función para realizar la resta de dos matrices
    public static void restaMatriz(
        int[][] matrizA,
        int[][] matrizB,
        int[][] resultado
    ) {

        // Resta los valores que se encuentran en la misma posición
        for (int fila = 0; fila < 2; fila++) {

            for (int columna = 0; columna < 3; columna++) {

                resultado[fila][columna] =
                    matrizA[fila][columna] - matrizB[fila][columna];
            }
        }
    }


    // Función para realizar la multiplicación elemento por elemento
    public static void multiplicacionMatriz(
        int[][] matrizA,
        int[][] matrizB,
        int[][] resultado
    ) {

        // Multiplica los valores que tienen la misma posición en ambas matrices
        for (int fila = 0; fila < 2; fila++) {

            for (int columna = 0; columna < 3; columna++) {

                resultado[fila][columna] =
                    matrizA[fila][columna] * matrizB[fila][columna];
            }
        }
    }


    // Función para mostrar una matriz en pantalla
    public static void mostrarResultado(int[][] matriz) {

        // Recorre la matriz y muestra sus valores
        for (int fila = 0; fila < 2; fila++) {

            System.out.print("| ");

            for (int columna = 0; columna < 3; columna++) {

                System.out.print(matriz[fila][columna] + " ");
            }

            System.out.println("|");
        }
    }


    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Creación de las matrices de tamaño 2 filas por 3 columnas
        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[2][3];

        // Matrices donde se almacenan los resultados de las operaciones
        int[][] resultadoSuma = new int[2][3];
        int[][] resultadoResta = new int[2][3];
        int[][] resultadoMultiplicacion = new int[2][3];


        // Solicita los datos de las matrices al usuario
        completarMatrices(entrada, matrizA, "A");
        completarMatrices(entrada, matrizB, "B");


        // Ejecuta las operaciones entre matrices
        sumaMatriz(matrizA, matrizB, resultadoSuma);
        restaMatriz(matrizA, matrizB, resultadoResta);
        multiplicacionMatriz(matrizA, matrizB, resultadoMultiplicacion);


        // Muestra la matriz original A
        System.out.println("\nMatriz A:");
        mostrarResultado(matrizA);


        // Muestra la matriz original B
        System.out.println("\nMatriz B:");
        mostrarResultado(matrizB);


        // Muestra el resultado de la suma
        System.out.println("\nResultado de la suma:");
        mostrarResultado(resultadoSuma);


        // Muestra el resultado de la resta
        System.out.println("\nResultado de la resta:");
        mostrarResultado(resultadoResta);


        // Muestra el resultado de la multiplicación
        System.out.println("\nResultado de la multiplicación:");
        mostrarResultado(resultadoMultiplicacion);


        entrada.close();
    }
}
