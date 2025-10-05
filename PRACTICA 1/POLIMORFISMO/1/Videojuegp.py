class Videojuego:
    def __init__(self, nombre="", plataforma="", jugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.jugadores = jugadores

    @classmethod
    def crear_con_nombre(cls, nombre):
        return cls(nombre, "Desconocida", 0)
    
    @classmethod
    def crear_completo(cls, nombre, plataforma, jugadores):
        return cls(nombre, plataforma, jugadores)

    def agregarJugadores(self):
        self.jugadores += 1

    def agregarJugadores_con_cantidad(self):
        cantidad = int(input("Ingrese la cantidad de jugadores a agregar: "))
        self.jugadores += cantidad

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Plataforma: {self.plataforma}, Jugadores: {self.jugadores}")


v1 = Videojuego.crear_completo("Minecraft", "PC", 4)
v2 = Videojuego.crear_con_nombre("FIFA 25")

v1.agregarJugadores()
v2.agregarJugadores_con_cantidad()


v1.mostrar()
v2.mostrar()
