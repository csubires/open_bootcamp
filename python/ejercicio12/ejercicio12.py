
paises = input('Introduce países (separados por coma): ')

paises = set(paises.split(','))

paises = sorted(paises)

print(', '.join(paises))
