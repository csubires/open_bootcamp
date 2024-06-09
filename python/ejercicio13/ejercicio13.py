from functools import reduce

lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

def filtrar(lista):
	print(f'Original: {lista}')
	filtrado = list(filter(lambda x: x%2==0, lista))
	print(f'Filtrado: {filtrado}')
	reducir = reduce(lambda x, y: x+y, filtrado)
	print(f'Sumado: {reducir}')

filtrar(lista)
