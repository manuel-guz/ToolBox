/*
REQUERIMIENTOS
- utilizar el formulario para captar el texto ingresado

- implmentar el evento "submit", utilizarlo para guardar el comentario en un array

- cada vez que se agrega un nuevo comentario renderizarlo en una etiqueta "p"(sacar del html los hardcodeados y hacerlo dinamico)

- constantemente guardar la informacion en localStorage, si se recarga la pagina deberian mantenerse los comentarios
*/

/*  SELECTORS   */

const formulario = document.forms[0];
const inputComentarios = document.querySelector("#comentario");
const cajaComentarios = document.querySelector(".comentarios");

const deleteCommentsButton = document.querySelector("#deleteComents");




/*  LISTENERS  */

formulario.addEventListener("submit", function (evento) {
    
    evento.preventDefault();
    
    guardarComentario(inputComentarios.value);
    
    console.log(listadoComentarios);
    
    renderizarComentarios(listadoComentarios);
    
    formulario.reset();
});




deleteCommentsButton.addEventListener('click', function () {
    
    deleteComments();
});







let listadoComentarios = [];

//check if thers something in storage
let prerenderStorage = JSON.parse(localStorage.getItem("comments"));
if (prerenderStorage != null) {
    listadoComentarios = prerenderStorage;
    renderizarComentarios(listadoComentarios);
}






/*-------------------Functions--------------------------*/

function guardarComentario(comentario) {

    listadoComentarios.push(comentario);
    localStorage.setItem('comments', JSON.stringify(listadoComentarios));
}






function renderizarComentarios(listado) {
    cajaComentarios.innerHTML = "";

    listado.forEach((item) => {
    // cajaComentarios.innerHTML = `${item}`;   ---> HTML template option

    const texto = document.createTextNode(item);
    const parrafo = document.createElement("p");
    parrafo.appendChild(texto);
    cajaComentarios.appendChild(parrafo);
    });
}






function setLocalStorage(comments) {
    localStorage.setItem("comments", `${comments}`);
}



function getLocalStorage() { 
    return localStorage.getItem('comments');
};


function deleteComments() {
    
    localStorage.clear('comments');

    listadoComentarios = [];

    
    renderizarComentarios(listadoComentarios);

}