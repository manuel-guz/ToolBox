const jsonData = `
{
  "squadName": "Super hero squad",
  "homeTown": "Metro City",
  "formed": 2016,
  "secretBase": "Super tower",
  "active": true,
  "members": [
    {
      "name": "Molecule Man",
      "age": 29,
      "secretIdentity": "Dan Jukes",
      "powers": ["Radiation resistance", "Turning tiny", "Radiation blast"]
    },
    {
      "name": "Madame Uppercut",
      "age": 39,
      "secretIdentity": "Jane Wilson",
      "powers": [
        "Million tonne punch",
        "Damage resistance",
        "Superhuman reflexes"
      ]
    },
    {
      "name": "Eternal Flame",
      "age": 1000000,
      "secretIdentity": "Unknown",
      "powers": [
        "Immortality",
        "Heat Immunity",
        "Inferno",
        "Teleportation",
        "Interdimensional travel"
      ]
    }
  ]
}
`;

//Recorrer el JSON e insertar en el listado del html los nombres de los miembros
function recorrerMiembros() {
  const superHeroes = JSON.parse(jsonData);
  const miembros = superHeroes.members;
  const contenedorDeMiembros = document.querySelector("#miembros")
  miembros.forEach(miembro => {
  const li = document.createElement("li")
  li.innerHTML = `
  <h3> ${miembro.name} </h3>
  <p> ${miembro.age}</p>
  <p> ${miembro.secretIdentity}</p>
  <p>  powers </p>
  <ul> 
      <li>${miembro["powers"][0]}</li> 
      <li>${miembro["powers"][1]}</li>
      <li>${miembro["powers"][2]}</li>
      <li>${miembro["powers"][3]}</li>
      <li>${miembro["powers"][4]}</li>
  </ul>
  `
  contenedorDeMiembros.appendChild(li);
  });

};
recorrerMiembros();
