document.addEventListener('DOMContentLoaded', () => {
    console.log('HOLA');
    const promesa = new Promise ((resolve, reject) => {
        let usuario = {
            estadoCuenta: 'inactiva',
            nombre: 'Facundo Scardillo',
            fondos: 6,
        }
    
        setTimeout(() => {
            if(usuario.fondos > 5) {
                resolve({
                    mensaje:'ok',
                    status: 200,
                    cuenta: usuario,
                })
            } else {
                reject({
                    mensaje: 'error',
                    status:404,
                })
            }
            
        }, 2500);
    })
    
    promesa
    .then( respuesta => {
        console.log(respuesta);
        console.log('SALIÓ BIEN');
    }).catch(err => {
        console.log('SALIO CON ERROR');
        console.log(err);
    })
    console.log('Esto es otra parte del codigo');
})

/* 
QUE SE TENGA QUE TOCAR UN BOTON QUE YA ESTÁ EN EL HTML, Y LUEGO
ANALIZAR SI LA CUENTA ESTÁ ACTIVA, SI LO ESTÁ, DEVOLVER CÓDIGO 200 Y MOSTRAR LA INFORMACIÓN DE LA CUENTA
SI ESTE TIENE MENOS DE 5 PESOS, MOSTRAR EL SALDO EN ROJO, SI TIENE MÁS, MOSTRARLO EN VERDE 
*/