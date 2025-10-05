class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print("El animal se desplaza de alguna forma.")

class Leon(Animal):
    def desplazarse(self):
        print(f"{self.nombre} camina majestuosamente por la sabana.")


class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.nombre} nada y se desliza sobre el hielo.")


class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.nombre} salta grandes distancias.")


animales = [
    Leon("Simba", 5),
    Pinguino("Pingo", 3),
    Canguro("Jack", 4)
]

for a in animales:
    a.desplazarse()
