var boton=document.getElementById("boton")
boton.onclick=()=>{
    var palabra=document.getElementById("palabra").value
    var letra=""
    console.log(palabra)
    var nueva_palabra=""
    for (let i = 0; i < palabra.length; i++) {
        letra=palabra.substring(i,i+1)
        nueva_palabra+=" "+letra
    }
    var muestra=document.getElementById("mostrar")
    muestra.innerHTML="Nueva palabra: "+nueva_palabra
}