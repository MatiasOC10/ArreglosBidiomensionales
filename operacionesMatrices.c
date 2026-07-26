#include <stdio.h>

// Función para completar los valores de una matriz
void completarMatrices(int matriz[2][3], char nombre) {

    int fila, columna;

    printf("\nIngrese los valores de la matriz %c:\n", nombre);

    // Recorre las filas y columnas de la matriz
    for(fila = 0; fila < 2; fila++) {

        for(columna = 0; columna < 3; columna++) {

            printf("%c[%d][%d]: ", nombre, fila, columna);
            scanf("%d", &matriz[fila][columna]);

        }
    }
}


// Función para realizar la suma de matrices
void sumaMatriz(int matrizA[2][3], int matrizB[2][3], int resultado[2][3]) {

    int fila, columna;

    // Suma cada posición de ambas matrices
    for(fila = 0; fila < 2; fila++) {

        for(columna = 0; columna < 3; columna++) {

            resultado[fila][columna] =
            matrizA[fila][columna] + matrizB[fila][columna];

        }
    }
}


// Función para realizar la resta de matrices
void restaMatriz(int matrizA[2][3], int matrizB[2][3], int resultado[2][3]) {

    int fila, columna;

    // Resta cada posición de ambas matrices
    for(fila = 0; fila < 2; fila++) {

        for(columna = 0; columna < 3; columna++) {

            resultado[fila][columna] =
            matrizA[fila][columna] - matrizB[fila][columna];

        }
    }
}


// Función para multiplicar matrices elemento por elemento
void multiplicacionMatriz(int matrizA[2][3], int matrizB[2][3], int resultado[2][3]) {

    int fila, columna;

    // Multiplica los valores que ocupan la misma posición
    for(fila = 0; fila < 2; fila++) {

        for(columna = 0; columna < 3; columna++) {

            resultado[fila][columna] =
            matrizA[fila][columna] * matrizB[fila][columna];

        }
    }
}


// Función para mostrar una matriz en pantalla
void mostrarResultado(int matriz[2][3]) {

    int fila, columna;

    // Recorre la matriz para imprimir sus valores
    for(fila = 0; fila < 2; fila++) {

        printf("| ");

        for(columna = 0; columna < 3; columna++) {

            printf("%d ", matriz[fila][columna]);

        }

        printf("|\n");
    }
}


// Función principal del programa
int main() {

    // Declaración de matrices de 2 filas y 3 columnas
    int matrizA[2][3];
    int matrizB[2][3];

    // Matrices donde se guardarán los resultados
    int suma[2][3];
    int resta[2][3];
    int multiplicacion[2][3];


    // Ingreso de datos
    completarMatrices(matrizA, 'A');
    completarMatrices(matrizB, 'B');


    // Operaciones entre matrices
    sumaMatriz(matrizA, matrizB, suma);
    restaMatriz(matrizA, matrizB, resta);
    multiplicacionMatriz(matrizA, matrizB, multiplicacion);


    // Mostrar resultados
    printf("\nMatriz A:\n");
    mostrarResultado(matrizA);

    printf("\nMatriz B:\n");
    mostrarResultado(matrizB);

    printf("\nResultado de la suma:\n");
    mostrarResultado(suma);

    printf("\nResultado de la resta:\n");
    mostrarResultado(resta);

    printf("\nResultado de la multiplicacion:\n");
    mostrarResultado(multiplicacion);


    return 0;
}
