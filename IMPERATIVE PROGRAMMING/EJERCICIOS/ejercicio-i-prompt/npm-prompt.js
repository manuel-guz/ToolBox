const prompt = require("prompt-sync")({ sigint: true });

let nombre = prompt("ingrese su nombre");

console.log("bienvenido " + nombre);



//--------SCOPE let-var test----------

let variable1 = 3

console.log(variable1);


if (true) {
    //var variable1= 4                                        ---> this will change the value of the external gloval variable1 value which means that it will generate an error because its has been declared before.

    let variable1= 4
    console.log(variable1);
}


console.log(variable1 + "hola");


const variable2= 3;

variable2=4;