//1- Agregar a la tarjeta, el atributo "class" con el valor "card"
let tarjeta = document.getElementById('tarjeta');
tarjeta.classList.add('card');


//2- Agregar a la imagen, el atributo "src" con el valor "https://www.youtube.com/img/desktop/yt_1200.png"
let imgSource = document.querySelector('img');
    imgSource.setAttribute('src','https://www.youtube.com/img/desktop/yt_1200.png');

//3- Quitarle al titulo la clase que le está dando un formato feo

let noTitle = document.querySelector('div h1');
noTitle.removeAttribute("class");

//4- Chequear si el link a youtube posee o no el atributo href

let hrefCheck = document.getElementById("link_youtube");
if (hrefCheck.hasAttribute('href')) {
    console.log('has href attribute! ');
} else {
    console.log('doesnt has href attribute');
}


//5- Obtener el href del link a wikipedia y mostrarlo por consola

let hrefPicker = document.getElementById("link_wikipedia");
console.log(hrefPicker.getAttribute('href'));


let formButton = document.querySelector('form');

formButton.addEventListener('submit', (e) => {

    e.preventDefault();

});