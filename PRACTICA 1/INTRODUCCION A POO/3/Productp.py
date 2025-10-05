class Producto:
    def __init__(self, nombre, precio, stock):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def vender(self, cantidad):
        cant_total = self.stock - cantidad
        if cantidad > self.stock:
            print(f"No se puede vender más de {self.stock} {self.nombre}s")
            self.stock -= cant_total
        else:
            self.stock -= cantidad
            print(f"Se vendieron {cantidad} {self.nombre}s")
        print(f"Ya solo quedan {self.stock} {self.nombre}s")

    def reabastecer(self, cantidad):
        self.stock += cantidad
        print(f"Reabastecimos {cantidad} {self.nombre}s")
        print(f"Ahora hay {self.stock} {self.nombre}s")

    def mostrar(self):
        print(f"El producto es: {self.nombre}")
        print(f"Su precio es de: {self.precio} Bs.")
        print(f"Y hay {self.stock} unidades de {self.nombre}")


#MAIN
if __name__ == "__main__":
    uno = Producto("manzana", 5, 20)
    uno.mostrar()
    uno.vender(10)
    uno.reabastecer(20)
