import java.util.Scanner;

public class OperacionesMatrices {

    /*
     * Función para ingresar los valores de una matriz.
     */
    public static void completarMatrices(
        Scanner entrada,
        int[][] matriz,
        String nombre
    ) {
        System.out.println(
            "\nIngrese los valores de la matriz " + nombre + ":"
        );

        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(
                    nombre + "[" + fila + "][" + columna + "]: "
                );

                matriz[fila][columna] = entrada.nextInt();
            }
        }
    }

    /*
     * Función para sumar dos matrices.
     */
    public static void sumaMatriz(
        int[][] matrizA,
        int[][] matrizB,
        int[][] resultado
    ) {
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                resultado[fila][columna] =
                    matrizA[fila][columna] + matrizB[fila][columna];
            }
        }
    }

    /*
     * Función para restar dos matrices.
     */
    public static void restaMatriz(
        int[][] matrizA,
        int[][] matrizB,
        int[][] resultado
    ) {
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                resultado[fila][columna] =
                    matrizA[fila][columna] - matrizB[fila][columna];
            }
        }
    }

    /*
     * Función para multiplicar elemento por elemento.
     */
    public static void multiplicacionMatriz(
        int[][] matrizA,
        int[][] matrizB,
        int[][] resultado
    ) {
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                resultado[fila][columna] =
                    matrizA[fila][columna] * matrizB[fila][columna];
            }
        }
    }

    /*
     * Función para mostrar una matriz.
     */
    public static void mostrarResultado(int[][] matriz) {
        for (int fila = 0; fila < 2; fila++) {
            System.out.print("| ");

            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }

            System.out.println("|");
        }
    }

    /*
     * Método principal.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[2][3];
        int[][] resultadoSuma = new int[2][3];
        int[][] resultadoResta = new int[2][3];
        int[][] resultadoMultiplicacion = new int[2][3];

        completarMatrices(entrada, matrizA, "A");
        completarMatrices(entrada, matrizB, "B");

        sumaMatriz(matrizA, matrizB, resultadoSuma);
        restaMatriz(matrizA, matrizB, resultadoResta);

        multiplicacionMatriz(
            matrizA,
            matrizB,
            resultadoMultiplicacion
        );

        System.out.println("\nMatriz A:");
        mostrarResultado(matrizA);

        System.out.println("\nMatriz B:");
        mostrarResultado(matrizB);

        System.out.println("\nResultado de la suma:");
        mostrarResultado(resultadoSuma);

        System.out.println("\nResultado de la resta:");
        mostrarResultado(resultadoResta);

        System.out.println("\nResultado de la multiplicación:");
        mostrarResultado(resultadoMultiplicacion);

        entrada.close();
    }
}