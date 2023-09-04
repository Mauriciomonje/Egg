document.getElementById("formulario_clima").addEventListener("submit",function(event) {
    event.preventDefault;
    var seleccion= document.getElementById("opcion").value;
    alert("El clima seleccionado es "+seleccion)
})