class Vehiculo:
    def __init__(self, placa, conductor):
        self.placa = placa
        self.conductor = conductor

    def mostrar(self):
        print(f"Placa: {self.placa}, Conductor: {self.conductor}")

    def cambiar_conductor(self, nuevo_conductor):
        self.conductor = nuevo_conductor
        print(f"Nuevo conductor asignado: {self.conductor}")

class Auto(Vehiculo):
    def __init__(self, placa, conductor, puertas):
        super().__init__(placa, conductor)
        self.puertas = puertas

class Moto(Vehiculo):
    def __init__(self, placa, conductor, cilindraje):
        super().__init__(placa, conductor)
        self.cilindraje = cilindraje

class Camion(Vehiculo):
    def __init__(self, placa, conductor, capacidad):
        super().__init__(placa, conductor)
        self.capacidad = capacidad
#MAIN
auto = Auto("123ABC", "Luis", 4)
moto = Moto("456XYZ", "Ana", 250)
camion = Camion("789DEF", "Pedro", 5000)

auto.mostrar()
moto.mostrar()
camion.mostrar()

camion.cambiar_conductor("Carlos")
camion.mostrar()
