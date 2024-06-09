
class Persona {
    nombre
    apellido
    constructor(nombre, apellido) {
        this.nombre = nombre
        this.apellido = apellido
    }
}

let nombre = "Cristóbal"
let apellido = "Perez"

const yo = new Persona(nombre, apellido)

localStorage.setItem("yo", JSON.stringify(yo))
sessionStorage.setItem("yo", JSON.stringify(yo))
const fecha = new Date()
document.cookie = `nombre=${yo.nombre}; expires=${new Date(fecha.getTime() + 2 * 60000)}`
document.cookie = `apellido=${yo.apellido}; expires=${new Date(fecha.getTime() + 2 * 60000)}`