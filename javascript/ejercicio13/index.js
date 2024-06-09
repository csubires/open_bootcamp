import { suma, multiplica } from "./controller.js"
import chalk from "chalk"

console.log(chalk.blue('Hello world!'));
console.log(suma(1, 2))
console.log(multiplica(4, 5))
console.log(chalk.green(multiplica(suma(1, 2), suma(4, 5))))
