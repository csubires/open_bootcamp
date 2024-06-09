from django.contrib import admin


from .models import Pelicula, Director

class PeliculaInLine(admin.StackedInline):
    model = Pelicula
    extra = 1 

class DirectorAdmin(admin.ModelAdmin):
    fieldsets = [
        (None, {'fields': ('nombre', 'apellidos', 'pais', 'edad')}),
    ]
    inlines = [PeliculaInLine]


admin.site.register(Director, DirectorAdmin)
