var lista = ["tomate", "pimiento", "arroz", "pan", "huevos"]
lista.push("Aceite de Girasol")
lista.pop()

var peliculas = [
    {
        titulo: "Señor de los anillos",
        director: "Peter Jackson",
        fecha: new Date(2001, 3, 30),
    },
    {
        titulo: "El rey escorpión",
        director: "Chuck Russell",
        fecha: new Date(2005, 7, 10),
    },
    {
        titulo: "Piratas del Caribe",
        director: "Gore Verbinski",
        fecha: new Date(2010, 5, 20),
    },
]

var anterior = peliculas.filter((valor) => valor.fecha > new Date(2010, 1, 1))
var directores = peliculas.map((valor) => valor.director)
var titulos = peliculas.map((valor) => valor.titulo)
var direlos = directores.concat(titulos)
var direlos2 = [...directores, ...titulos]
