const select = document.querySelector('#razas');
const form = document.querySelector('form');

form.addEventListener('submit', (e) => {
    e.preventDefault();
    const input = document.getElementById('cantidad-perritos');
    const cantPerritos = input.value;
    const raza = select.value;
    const url = `https://dog.ceo/api/breed/${raza}/images/random/${cantPerritos}`;

    fetch(url).then( resp => {
        return resp.json();
    }).then( data => {
        const { message } = data;
        const galeriaImagenes = document.querySelector('.galeria-imagenes');
        message.forEach( imagen => {
            const img = document.createElement('img');
            img.setAttribute('src', imagen);
            galeriaImagenes.appendChild(img);
        });
        const main = document.querySelector('.contenedor');
        main.appendChild(galeriaImagenes);
    })
});


/* HACER UN SELECT, QUE TENGA DE OPCION LAS RAZAS TRAIDAS DE LA API, Y CON ESTO PODER HACER PETICION SEGUN RAZA */ 

fetch('https://dog.ceo/api/breeds/list/all').then( res => { return res.json()})
.then( data => {
    const razas = Object.keys(data.message).slice(0,10)
    razas.forEach( raza => {
        agregarOpcion(raza);
    })
})

const agregarOpcion = (raza) => {
    const opcion = document.createElement('option');
    opcion.textContent = raza;
    opcion.setAttribute('value', raza);
    select.appendChild(opcion);
}

select.addEventListener('change', (e) => {
    console.log(e.target.value);
})

// try {
//     const numero = 5/5;
//     if(numero != Infinity){
//         console.log('El usuario tiene ', numero, 'años');
//     } else {
//         throw "No se puede dividir por 0"
//     }
    
// } catch (error) {
//     console.log(error);
// } finally {
//     console.log('Este codigo corre siempre.')
// }