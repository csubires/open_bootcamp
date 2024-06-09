import time

hora_actual = time.localtime()[3]

if hora_actual >= 19:
	print('Son más de las 7, es hora de volver a casa')
else:
	restante = 19 - hora_actual
	print(f'Quedan {restante} horas de trabajo')
