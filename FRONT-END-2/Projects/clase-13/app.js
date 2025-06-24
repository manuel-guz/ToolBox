document.addEventListener('DOMContentLoaded', () => {
    const input = document.querySelector('.input');
    input.addEventListener('blur', () => {
        console.log('Te fuiste');
    })

    input.addEventListener('focus', () => {
        console.log('Entraste');
    })

    input.addEventListener('change', () => {
        console.log('Cambiaste algo');
    })

    const boton = document.querySelector('.boton');

    boton.addEventListener('click', () => {
        location.reload();
    })

    const query =  new URLSearchParams(location.search);
    if(query.has('name')) {
        const search = query.get('name');
        console.log(search);
    }
})