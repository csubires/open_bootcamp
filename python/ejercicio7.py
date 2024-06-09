class Alumno:

	def __init__(self, nombre, nota):
		self.nombre = nombre
		self.nota = nota

	def imprimir(self):
		print(f'Nombre: {self.nombre}, Nota: {self.nota}')

	def aprobado(self):
		print(f'{"Está aprobado" if self.nota>=5 else "No está aprobado"}')

alumno = Alumno('Pepito Perez', 4.9)
alumno.imprimir()
alumno.aprobado()

alumno2 = Alumno('María Martín', 9.9)
alumno2.imprimir()
alumno2.aprobado()
