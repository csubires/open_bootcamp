import pickle

class Vehiculo:
	def __init__(self, velocidad, ruedas, puertas):
		self.velocidad = velocidad
		self.ruedas = ruedas
		self.puertas = puertas

	def __str__(self):
		return f'Velocidad: {self.velocidad}, Ruedas: {self.ruedas}, Puertas: {self.puertas}'


def main():

	vehiculo = Vehiculo(240, 4, 5)
	print(vehiculo)
	f = open('vehiculo.dato', 'w+b')
	pickle.dump(vehiculo, f)
	f.close()

	f = open('vehiculo.dato', 'r+b')
	viejo_vehiculo = pickle.load(f)
	print(viejo_vehiculo)
	f.close()

if __name__ == '__main__':
	main()
