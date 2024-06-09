
class Vehiculo:
	def __init__(self, color, ruedas, puertas):
		self.color = color
		self.ruedas = ruedas
		self.puertas = puertas

	def mostrarVehiculo(self):
		print(f'Color: {self.color}, Ruedas: {self.ruedas}, Puertas: {self.puertas}')


class Coche(Vehiculo):
	def __init__(self, color, ruedas, puertas, velocidad, cilindrada):
		super().__init__(color, ruedas, puertas)
		self.velocidad = velocidad
		self.cilindrada = cilindrada

	def mostrarCoche(self):
		print(f'Velocidad: {self.velocidad}, Cilindrada: {self.cilindrada}')


coche = Coche('Rojo', 4, 5, 140, 1.6)
coche.mostrarVehiculo()
coche.mostrarCoche()
