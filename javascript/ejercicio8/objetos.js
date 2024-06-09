

const obj = {
    nombre: "Cristóbal",
    apellido: "Subires",
    edad: 34,
    altura: 186,
    eresDesarrollador: true
}

var edad = obj.edad;
var lista = {...obj}

var amigos = [
    obj,
    {
        nombre: "Nadie",
        apellido: "Yokese",
        edad: 43,
        altura: 176,
        eresDesarrollador: true
    }, {
        nombre: "Yono",
        apellido: "Jajajaj",
        edad: 24,
        altura: 146,
        eresDesarrollador: false
    }];

console.log(amigos);

amigos.sort((a, b) => b.edad - a.edad);

console.log(amigos);