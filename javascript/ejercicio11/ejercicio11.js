function verdad() {
    return true
}

async function funcionAsincrona() {
    console.log("Hola soy una promesa")

}

setTimeout(() => {funcionAsincrona()}, 5000)


function* generarID() {
    let i = 1
    while (true) {
        yield i * 2
        i++
    }
}

const numpar = generarID()
numpar.next().value


