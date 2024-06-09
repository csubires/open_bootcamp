function dameNum(num) {
    let cuenta = 1
    let resultado = [1, 1]

    for (let index = 0; index < num-2; index++) {
        cuenta = resultado.at(-1) + resultado.at(-2)
        resultado.push(cuenta)
    }
    return resultado
}

console.log(dameNum(6))