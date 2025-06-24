/*
REQUERIMIENTOS
- utilizar el formulario para captar el texto ingresado

- implmentar el evento "submit", utilizarlo para guardar el comentario en un array

- cada vez que se agrega un nuevo comentario renderizarlo en una etiqueta "p"(sacar del html los hardcodeados y hacerlo dinamico)

- constantemente guardar la informacion en localStorage, si se recarga la pagina deberian mantenerse los comentarios
*/

document.addEventListener('DOMContentLoaded', () => {
    const form = document.querySelector('.form_comentario');
    const input = document.querySelector('#comentario');
    const div = document.querySelector('.comentarios')

    /* FUNCIONES */
    const renderizarArray = (comentarios) => {
        comentarios.forEach( comentario => {
            renderizarComentario(comentario);
        });
    }

    const agregarComentario = (comentario) => {
        arrayComentarios.push(comentario);
    }

    const renderizarComentario = (comentario) => {
        const parrafo = document.createElement('p');
        parrafo.classList.add('comentario')
        parrafo.textContent = comentario.texto;
        div.appendChild(parrafo);
        parrafo.textContent += ` ------------ ${comentario.fecha}`
    }

    const cargarDatos = () => {
        const array = JSON.parse(localStorage.getItem('comentarios'));
        if(array) {
            console.log(array);
            return array;
        }
        return [];
    }

    const guardarDatos = () => {
        localStorage.setItem('comentarios', JSON.stringify(arrayComentarios))
    }

    let arrayComentarios = cargarDatos();

    renderizarArray(arrayComentarios);

    form.addEventListener('submit', (e) => {
        e.preventDefault()
        comentario = {
            texto: input.value,
            fecha: new Date()
        }
        agregarComentario(comentario);
        renderizarComentario(comentario);
        guardarDatos();
        input.value = '';
    });

    // BOTON BORRAR COMENTARIOS Y LOCAL STORAGE

    const botonBorrar = document.getElementById('borrar')
    console.log(div);

    botonBorrar.addEventListener('click', () => {
        borrarComentarios()
    })

    const borrarComentarios = () => {
        const parrafos = document.querySelectorAll('.comentario')
        parrafos.forEach(parrafo => {
            div.removeChild(parrafo)
        })
        localStorage.clear()
    }
    
    // /* SET INTERVAL */
    // let i = 0;
    // setInterval(() => {
    //     i++;
    //     console.log('UN SEGUNDO: ', i);
    // }, 1000);
});

// const comentarios = document.querySelector('.comentarios');
// comentarios.innerHTML = '<h1>ESTO ES UN ERROR</h1>'
// setTimeout(() => {
//     comentarios.innerHTML = ''
// }, 0);



// const cargarDatos = () => {
//     const array = JSON.parse(localStorage.getItem('comentarios'));
//     if(array) return array;
//     return [];
// }