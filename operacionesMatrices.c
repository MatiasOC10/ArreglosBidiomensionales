#include <stdio.h>

/* Función para ingresar los valores de una matriz */
void completarMatrices(int matriz[2][3], char nombre) {
    int fila;
    int columna;

    printf("\nIngrese los valores de la matriz %c:\n", nombre);

    for (fila = 0; fila < 2; fila++) {
        for (columna = 0; columna < 3; columna++) {
            printf("%c[%d][%d]: ", nombre, fila, columna);
            scanf("%d", &matriz[fila][columna]);
        }
    }
}

/* Función para sumar dos matrices */
void sumaMatriz(
    int matrizA[2][3],
    int matrizB[2][3],
    int resultado[2][3]
) {
    int fila;
    int columna;

    for (fila = 0; fila < 2; fila++) {
        for (columna = 0; columna < 3; columna++) {
            resultado[fila][columna] =
                matrizA[fila][columna] + matrizB[fila][columna];
        }
    }
}

/* Función para restar dos matrices */
void restaMatriz(
    int matrizA[2][3],
    int matrizB[2][3],
    int resultado[2][3]
) {
    int fila;
    int columna;

    for (fila = 0; fila < 2; fila++) {
        for (columna = 0; columna < 3; columna++) {
            resultado[fila][columna] =
                matrizA[fila][columna] - matrizB[fila][columna];
        }
    }
}

/* Función para multiplicar elemento por elemento */
void multiplicacionMatriz(
    int matrizA[2][3],
    int matrizB[2][3],
    int resultado[2][3]
) {
    int fila;
    int columna;

    for (fila = 0; fila < 2; fila++) {
        for (columna = 0; columna < 3; columna++) {
            resultado[fila][columna] =
                matrizA[fila][columna] * matrizB[fila][columna];
        }
    }
}

/* Función para mostrar una matriz */
void mostrarResultado(int matriz[2][3]) {
    int fila;
    int columna;

    for (fila = 0; fila < 2; fila++) {
        printf("| ");

        for (columna = 0; columna < 3; columna++) {
            printf("%d ", matriz[fila][columna]);
        }

        printf("|\n");
    }
}

/* Función principal */
int main() {
    int matrizA[2][3];
    int matrizB[2][3];
    int resultadoSuma[2][3];
    int resultadoResta[2][3];
    int resultadoMultiplicacion[2][3];

    completarMatrices(matrizA, 'A');
    completarMatrices(matrizB, 'B');

    sumaMatriz(matrizA, matrizB, resultadoSuma);
    restaMatriz(matrizA, matrizB, resultadoResta);
    multiplicacionMatriz(
        matrizA,
        matrizB,
        resultadoMultiplicacion
    );

    printf("\nMatriz A:\n");
    mostrarResultado(matrizA);

    printf("\nMatriz B:\n");
    mostrarResultado(matrizB);

    printf("\nResultado de la suma:\n");
    mostrarResultado(resultadoSuma);

    printf("\nResultado de la resta:\n");
    mostrarResultado(resultadoResta);

    printf("\nResultado de la multiplicacion:\n");
    mostrarResultado(resultadoMultiplicacion);

    return 0;
}