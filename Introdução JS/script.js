var element = document.getElementById("aula")
element.style.color = "blue"

var element = document.getElementById("aula");
var defaultColor = element.style.color; // Armazena a cor padrão inicial
var alternateColor = "red"; // Define a cor alternativa

var button = document.getElementById("button");
button.addEventListener("click", function() {
    if (element.style.color === alternateColor) {
        element.style.color = defaultColor; // Retorna à cor padrão
    } else {
        element.style.color = alternateColor; // Troca para a cor alternativa
    }
});