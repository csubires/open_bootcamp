
fichero = 'mifichero.txt'

def leer():
	f = open(fichero, 'r')
	datos = f.readlines()
	f.close()

	for i in datos:
		print(i)

def escribir():
	datos = ['Hola', 'esto', 'es', 'una prueba']
	f = open(fichero, 'w')
	for i in datos:
		f.write(i + '\n')
	f.close()

def main():
	escribir()
	leer()

if __name__ == '__main__':
	main()
	
	
