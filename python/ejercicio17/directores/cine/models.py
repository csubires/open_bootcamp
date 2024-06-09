from django.db import models

class Director(models.Model):
    nombre = models.CharField(max_length=25)
    apellidos = models.CharField(max_length=50)
    pais = models.CharField(max_length=25)
    edad = models.PositiveIntegerField()

    def __str__(self):
        return self.nombre + " " + self.apellidos + " " + self.pais  + " " + str(self.edad)

class Pelicula(models.Model):
    director = models.ForeignKey('Director', on_delete=models.CASCADE)
    titulo = models.CharField(max_length=25)
    anyo = models.PositiveIntegerField()
    descripcion = models.TextField()

    def __str__(self):
        return self.titulo + " " + str(self.anyo) + " " + self.descripcion 