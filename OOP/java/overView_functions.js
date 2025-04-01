///-----------------------FUNCTIONS-------------


//expressed function (its runned when the interpreter get to it)

let sumar = function (numberA,numberB){
            return numberA + numberB;
};

console.log(sumar(3,5));




// declared function (its loaded before the program start running)

function restar(numberC,numberD){
        return numberC-numberD;
};

console.log(restar(10,5));


//Local scope-> variables declared inside the functions, global scope is the variable crerated outside the function

let message= "hellow"; // global scope

function sayHi(params) {
        let message = "bye"; // local scope
        return message;
}

console.log(message);
console.log(sayHi()); //local scope is predominant front global ones, thats why the message returned is by and not hellow


//Arrow functions

let half = number => number / 2;

console.log(half(4));

let div = (numbA,numbB)=> numbA/numbB;
console.log(div(20,4));

