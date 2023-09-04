//Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio
//de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que
//para calcular el área y el perímetro se utilizan las siguientes fórmulas:
//area = PI * radio2
//perimetro = 2 * PI * radio

document.getElementById("areaperimetro").addEventListener("submit", function (event) {
    event.preventDefault(); // Evitar que el formulario se envíe y la página se recargue

    // Obtener el valor seleccionado por el usuario
    var seleccion = document.getElementById("operacion").value;
    

    var numero = document.getElementById("numero").value;

    if (seleccion == "perimetro") {

        var forradio = (2 * Math.PI * numero);
        alert("El resultado seleccionado es: " + forradio);
        
    }else
    {
        var area =(Math.PI * Math.pow(numero,2));
        alert("El resultado seleccionado es: " + area);
    }

    // Mostrar el valor seleccionado en la consola
    

});