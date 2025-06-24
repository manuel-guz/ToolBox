document.addEventListener('DOMContentLoaded', () => {
    /* Seleccionar el input
        Obtener el valor
        con split lo separamos en un array y lo guardamos
    */  
   const peliculasInput = document.querySelector('#peliculas');
   const form = document.querySelector('form');
   let erorres = [];
    /* 
   Nombre completo
    Debe contener al menos dos palabras.
    Cada nombre o apellido debe tener más de 1 letra.
    El campo no puede superar los 150 caracteres.
    El campo es obligatorio.
    No debe contener números.
    */

   const nombreInput = document.querySelector('#nombre');


   const verificarNombre = () => {
    nombre = nombreInput.value;
    if(nombre.trim() == '') {
        erorres.push('El campo nombre es obligatorio');
    }
    else if(nombre.length > 150) {
        erorres.push('El campo tiene como maximo 150 caracteres');
    } else if(/\d/.test(nombre)) {
        erorres.push('El nombre no puede tener numeros')
    } else {
        const nombreCompleto = nombre.split(' ');
        nombreCompleto.forEach(palabra => {
            if(palabra.length <= 1 && erorres.length === 0) {
                erorres.push('Los nombres deben tener al menos 2 caracteres');
            }
        });
    }
    
    
    

   }

   form.addEventListener('submit', (e) => {
        e.preventDefault();
        const peliculas = peliculasInput.value;
        const arrayPeliculas = peliculas.split(',');
        const arrayPeliculasNormalizado = arrayPeliculas.map( (pelicula) => {
            return pelicula.trim().toLowerCase()
        });

        verificarNombre()
        
    })
   
})