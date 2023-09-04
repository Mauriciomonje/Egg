//Escribir un algoritmo en el cual se consulte al usuario que ingrese ¿cómo está el día de
//hoy? (soleado, nublado, lloviendo). A continuación, mostrar por pantalla un mensaje que
//indique “El día de hoy está ...”, completando el mensaje con el dato que ingresó el usuario.


//var clima = [
//    " Soleado"," Nublado"," Lluvioso"," Nevado"
//];


//var resul = prompt (`Ingrese una opcion`+ clima);


//alert(" La opcion ingresada es "+ resul); 



document.getElementById("climaForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Evitar que el formulario se envíe y la página se recargue
    
    // Obtener el valor seleccionado por el usuario
    var seleccion = document.getElementById("opcionesClima").value;
    
    // Mostrar el valor seleccionado en la consola
   alert("El clima seleccionado es: " + seleccion);
});