# Función para ingresar los valores de una matriz
def completar_matrices(nombre):
    matriz = []

    print(f"\nIngrese los valores de la matriz {nombre}:")

    for fila in range(2):
        nueva_fila = []

        for columna in range(3):
            while True:
                try:
                    valor = int(
                        input(f"{nombre}[{fila}][{columna}]: ")
                    )
                    nueva_fila.append(valor)
                    break
                except ValueError:
                    print("Error: debe ingresar un número entero.")

        matriz.append(nueva_fila)

    return matriz


# Función para sumar dos matrices
def suma_matriz(matriz_a, matriz_b):
    resultado = [[0, 0, 0], [0, 0, 0]]

    for fila in range(2):
        for columna in range(3):
            resultado[fila][columna] = (
                matriz_a[fila][columna]
                + matriz_b[fila][columna]
            )

    return resultado


# Función para restar dos matrices
def resta_matriz(matriz_a, matriz_b):
    resultado = [[0, 0, 0], [0, 0, 0]]

    for fila in range(2):
        for columna in range(3):
            resultado[fila][columna] = (
                matriz_a[fila][columna]
                - matriz_b[fila][columna]
            )

    return resultado


# Función para multiplicar elemento por elemento
def multiplicacion_matriz(matriz_a, matriz_b):
    resultado = [[0, 0, 0], [0, 0, 0]]

    for fila in range(2):
        for columna in range(3):
            resultado[fila][columna] = (
                matriz_a[fila][columna]
                * matriz_b[fila][columna]
            )

    return resultado


# Función para mostrar una matriz
def mostrar_resultado(matriz):
    for fila in matriz:
        print("|", end=" ")

        for valor in fila:
            print(valor, end=" ")

        print("|")


# Función principal
def main():
    matriz_a = completar_matrices("A")
    matriz_b = completar_matrices("B")

    resultado_suma = suma_matriz(matriz_a, matriz_b)
    resultado_resta = resta_matriz(matriz_a, matriz_b)

    resultado_multiplicacion = multiplicacion_matriz(
        matriz_a,
        matriz_b
    )

    print("\nMatriz A:")
    mostrar_resultado(matriz_a)

    print("\nMatriz B:")
    mostrar_resultado(matriz_b)

    print("\nResultado de la suma:")
    mostrar_resultado(resultado_suma)

    print("\nResultado de la resta:")
    mostrar_resultado(resultado_resta)

    print("\nResultado de la multiplicación:")
    mostrar_resultado(resultado_multiplicacion)


# Iniciar el programa
if __name__ == "__main__":
    main()