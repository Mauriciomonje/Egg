var boton=document.getElementById("boton")
boton.onclick=()=>{
    var palabra=document.getElementById("frase").value
    var letra=""
    console.log(palabra)
    var nueva_palabra=""
    for (let i = palabra.length; i >= 0; i--) {
        letra=palabra.substring(i,i+1)
        nueva_palabra+=letra
    }
    var muestra=document.getElementById("mostrar")
    muestra.innerHTML="Palabra al Revez: "+nueva_palabra
}