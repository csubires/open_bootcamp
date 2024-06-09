
class Estudiante {

    constructor(nombre) {
        this.nombre = nombre
        this.asignaturas = ["Javascript", "HTML", "CSS"]
    }

    obtenDato() {
        return {nombre: this.nombre, asignaturas:this.asignaturas}
    }
}

const estudiante = new Estudiante("Pepe")
console.log(estudiante.obtenDato)