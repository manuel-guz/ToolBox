const prompt = require("prompt-sync")({ sigint: true });


let edad = 19 

if (edad < 0) {
    console.log("Error, edad inválida. Por favor ingrese un número válido.");
    
}else{

if(edad < 18) {
console.log("No puede pasar al bar.")
} else if (edad < 21){
console.log("Puede pasar al bar, pero no puede tomar alcohol.")
} 

else if(edad == 21){
console.log("felicitaciones por haber llegado a la mayoría de edad");
}

else if( edad % 2 == 1 ){
    console.log("¿Sabias que tu edad es impar?");
    }
else {
    console.log("Puede pasar al bar y tomar alcohol.")
    }
} 

let vehiculos= prompt("Ingrese vehiculo");
let litrosConsumidos= prompt("litros recorridos");

totalAPagar(vehiculos, litrosConsumidos);

function totalAPagar(vehiculos, litrosConsumidos){
    let total;
    if (litrosConsumidos<=25 && litrosConsumidos>=0) {
        if (vehiculos == "coche") {
            total = ((litrosConsumidos* 86)+50);
        }
        else if (vehiculos == "moto") {
            total = ((litrosConsumidos* 70)+50);
        }
        else if(vehiculos == "autobús"){
            total = ((litrosConsumidos* 55)+50);
        }
    };

    if (litrosConsumidos>25)  {
        if (vehiculos == "coche") {
            total = ((litrosConsumidos* 86)+25);
        }
        else if (vehiculos == "moto") {
            total = ((litrosConsumidos* 70)+25);
        }
        else if (vehiculos == "autobús") {
            total = ((litrosConsumidos* 55)+25);
        }
    };
    console.log("debe pagar " + total + " pesos");
};
