from operaciones import sumar, restar, multiplicar, dividir

def main():
	suma = sumar(2, 2)
	print(f'Suma (2+2): {suma}')

	resta = restar(suma, 2)
	print(f'Resta (suma-2): {resta}')

	multiplicacion = multiplicar(2, 2)
	print(f'Multiplicación (resta*2): {multiplicacion}')

	division = dividir(multiplicacion, 2)
	print(f'División (multiplicacion/2): {division}')


if __name__ == '__main__':
	main()
