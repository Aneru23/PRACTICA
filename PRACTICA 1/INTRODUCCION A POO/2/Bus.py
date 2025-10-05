class Bus:
    def __init__(self, capacidad):
        self.pasajeros = 0
        self.capacidad = capacidad
        self.pasajes = 0.0

    def subir_pasajero(self, x):
        asientos_disponibles = self.capacidad - self.pasajeros
        if x > asientos_disponibles:
            print(f"No hay asientos disponibles. Solo hay {asientos_disponibles}")
            self.pasajeros += asientos_disponibles
        else:
            self.pasajeros += x
            print(f"Se subieron {x} pasajeros")
        print(f"Ahora hay {self.pasajeros} pasajeros en el bus")

    def cobrar_pasaje(self):
        costo_por_pasajero = 1.5
        cobro_total = self.pasajeros * costo_por_pasajero
        self.pasajes += cobro_total
        print(f"Se cobraron {cobro_total} Bs en pasajes")
        return cobro_total

    def asientos_disponibles(self):
        disponibles = self.capacidad - self.pasajeros
        print(f"Los asientos disponibles son {disponibles}")
        return disponibles

#MAIN
if __name__ == "__main__":
    puma = Bus(30)
    puma.asientos_disponibles()
    puma.subir_pasajero(10)
    puma.cobrar_pasaje()
    puma.asientos_disponibles()
    puma.subir_pasajero(50)
    puma.cobrar_pasaje()
    puma.asientos_disponibles()
