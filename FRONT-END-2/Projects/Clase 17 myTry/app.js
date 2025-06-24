/* Same procces but going from the response object ---.text()---> a string version of the response object to ---JSON.parse()---> the JSON version of that text string, this hole process is don with just .json just when  we apply it to an object, mostly the fetch response one:

fetch(url).then(res => res.text().then(ress => console.log(JSON.parse(ress))));
let serverJSONResponse = fetch(url).then((ress) =>
    ress.json().then((jress) => console.log(jress))
);
*/

let url = "https://dog.ceo/api/breeds/image/random";
let formBtn = document.querySelector(".btn");
let galeriaImg = document.querySelector("img");
let galeriaImg2 = document.querySelector("div");


formBtn.addEventListener("click", () => {
  render();
});


function render() {
    fetch(url)
        .then(function (response) {
          console.log(response)
        return response.json();
      })
      .then((res) => galeriaImg.setAttribute("src", res.message));

}



/*------------------_CLASE 18_-----------------------*/

let url2 = "https://jsonplaceholder.typicode.com/photos";

fetch(url2).then(response => response.json())
    
    
    .then(json => {


        const listado = document.createElement('ul');
        
        document.body.appendChild(listado);
        
        const nodoUl = document.querySelector('ul');
        for (let i = 0; i < 10; i++) {
            
            console.log(json[1].title)

            nodoUl.innerHTML += `<li> ${json[i].title} </li>`;
        }
        
    });




/*----------------------  POST  -----------------------*/


const url3 = 'https://jsonplaceholder.typicode.com/posts';
    



let data = {
  title: "foo",
  body: "bar",
  userId: 1,
};

let payload = JSON.stringify(data);

let postConfig = {
    
    method: "POST",
    body: payload,
    headers: {
        "Content-type": "application/json; charset=UTF-8",
    },
};



fetch(url3, postConfig)
  .then((response) => response.json())
  .then((json) => console.log(json));
