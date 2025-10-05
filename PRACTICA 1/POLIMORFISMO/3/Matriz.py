class Matriz:
    def __init__(self, matriz=None):
        if matriz is None:
            self.matriz = [[1 if i == j else 0 for j in range(10)] for i in range(10)]
        else:
            self.matriz = matriz

    @classmethod
    def crear_vacia(cls):
        matriz_vacia = [[0 for _ in range(10)] for _ in range(10)]
        return cls(matriz_vacia)

    def sumar(self, otra):
        resultado = [[self.matriz[i][j] + otra.matriz[i][j] for j in range(10)] for i in range(10)]
        return Matriz(resultado)

    def restar(self, otra):
        resultado = [[self.matriz[i][j] - otra.matriz[i][j] for j in range(10)] for i in range(10)]
        return Matriz(resultado)

    def igual(self, otra):
        for i in range(10):
            for j in range(10):
                if self.matriz[i][j] != otra.matriz[i][j]:
                    return False
        return True

    # Mostrar matriz
    def mostrar(self):
        for fila in self.matriz:
            print(fila)

m1 = Matriz()            
m2 = Matriz.crear_vacia()    
m3 = m1.sumar(m2)            

print("Matriz 1:")
m1.mostrar()

print("\nMatriz 2:")
m2.mostrar()

print("\nSuma de matrices:")
m3.mostrar()

print("\n¿m1 igual a m3?:", m1.igual(m3))
