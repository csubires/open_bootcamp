
def bisiesto(year):
	esbisiesto = year%4==0 and year%100==0 and year%400==0
	return "Sí" if esbisiesto else "No"

print("¿Es bisiesto 2000? " + bisiesto(2000))
print("¿Es bisiesto 1900? " + bisiesto(1900))
