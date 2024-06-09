var i = 1;
var total = 1;

while (true) {
    total = total * i
    i++;

    if (i > 10) {
        break;
    }
}

console.log("Factorial de 10 = " + total);
