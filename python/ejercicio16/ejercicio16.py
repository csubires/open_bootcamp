import sqlite3

cnx = sqlite3.connect('midb.db')
cursor = cnx.cursor()


cursor.execute('INSERT INTO Alumnos (id, nombre, apellidos) VALUES (1, "PACO", "PEREZ PEREZ")')
cursor.execute('INSERT INTO Alumnos (id, nombre, apellidos) VALUES (2, "MARIA", "MARTIN MARTIN")')
cursor.execute('INSERT INTO Alumnos (id, nombre, apellidos) VALUES (3, "LUCIA", "FERNANDEZ FERNANDEZ")')
cursor.execute('INSERT INTO Alumnos (id, nombre, apellidos) VALUES (4, "SERGIO", "ALVAREZ ALVAREZ")')
cursor.execute('INSERT INTO Alumnos (id, nombre, apellidos) VALUES (5, "FRANCICO", "PEREZ FERNANDEZ")')
cursor.execute('INSERT INTO Alumnos (id, nombre, apellidos) VALUES (6, "ANTONIO", "ALVAREZ PEREZ")')
cursor.execute('INSERT INTO Alumnos (id, nombre, apellidos) VALUES (7, "SARA", "PEREZ MARTIN")')
cursor.execute('INSERT INTO Alumnos (id, nombre, apellidos) VALUES (8, "SILVIA", "MARTIN PEREZ")')

# cnx.commit()

cursor.execute('SELECT * FROM Alumnos WHERE nombre="MARIA" AND apellidos="MARTIN MARTIN"')
row = cursor.fetchone()
print(f'Alumno encontrado: {row}')

cursor.close()
cnx.close()
