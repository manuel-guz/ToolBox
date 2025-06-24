// Aquí realizamos un la consulta de la promesa, esperando su respuesta asíncrona
const boton = document.getElementById('random')

boton.addEventListener('click', () => {
    fetch('https://randomuser.me/api/')
        .then(response => {
            return response.json()
        })
        .then(data => {
            //manipulamos la respuesta
            renderizarDatosUsuario(data.results[0])
        });
})


function renderizarDatosUsuario(datos) {
    /* -------------------------------- CONSIGNA 1 -------------------------------- */
    // Aquí deben desarrollar una función que muestre en pantalla:
    // la foto, el nombre completo del usuario y su email.
    // Esto debe estar basado en la info que nos llega desde la API e insertarse en el HTML.
    const div = document.querySelector('.tarjeta')
    div.innerHTML = ''
    const nombreCompleto = datos.name.first + " " + datos.name.last
    const email = datos.email
    const foto = datos.picture.medium

    const h3 = document.createElement('h3')
    h3.textContent = nombreCompleto

    const parrafo = document.createElement('p')
    parrafo.textContent = email

    const img = document.createElement('img')
    img.setAttribute('src', `${foto}`)

    div.appendChild(h3)
    div.appendChild(parrafo)
    div.appendChild(img)
}


/* --------------------------- CONSIGNA 2 (extra) --------------------------- */
// Aqui pueden ir por el punto extra de utilizar el boton que se encuentra comentado en el HTML
// Pueden descomentar el código del index.html y usar ese boton para ejecutar un nuevo pedido a la API, sin necesidad de recargar la página.
// Es criterio del equipo QUÉ bloque del código debe contenerse dentro de una función para poder ser ejecutada cada vez que se escuche un click.