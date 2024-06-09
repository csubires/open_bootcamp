# from django.shortcuts import render

from django.views import generic

from .models import Director, Pelicula

class IndexView(generic.ListView):
    template_name = 'cine/cine.html'
    model = Director

class DirectorView(generic.DetailView):
    template_name = 'cine/undirector.html'
    model = Director

class PeliculaView(generic.DetailView):
    template_name = 'cine/unapelicula.html'
    model = Pelicula