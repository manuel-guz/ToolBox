// const string = 'Hola como están';
// let posicion = 0

// for(i = 0 ; i < string.length ; i ++){
//     if(string[i] === ' '){
//         posicion =  i;
//         break;
//     }
// }

// console.log(string.slice(posicion));

// const input = document.getElementById("nombre");
// input.addEventListener('keyup', (e) => {
//     if(e.target.value.length < 10) {
//         input.classList.add('error')
//     } else {
//         input.classList.remove('error')
//     }
// });

// const array = [1,2,3,4,5];

// const arrayModificado = array.map( numero => {
//     return numero + 10;
// });

// const array = ['hola', 'como estas', 'chau'];
// const arrayModificado = array.map( frase => {
//     return `<p>Texto en el parrafo: ${frase}</p>`
// } ).join('');

// const div = document.querySelector('.contenedor')

// div.innerHTML = arrayModificado;

// const array = [20, 50, 15, 180, 5, 100];
// console.log(array.filter( numero => numero > 10));
// let campos = []
// const nombre = document.getElementById("nombre");
// const password = document.getElementById("password");
// const tel = document.getElementById("tel");
// const form = document.querySelector('form');

// diccionarioCampos = {
//     'campo nombre' :nombre ,
//     'campo password': password,
//     'campo tel': tel,
// }

// form.addEventListener('submit', (e) => {
//     e.preventDefault();
//     campos = [nombre, password, tel];
//     const camposVacios = campos.filter(campo => campo.value === '')
//     camposVacios.forEach(campo => {
//         console.log(`El campo ${campo.getAttribute('id')} está vacio`);
//     });
// })
