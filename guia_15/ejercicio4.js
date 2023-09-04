var boton=document.getElementById("boton")
boton.onclick = function(){
    var caracter=document.getElementById("caracter").value
    var textarea=document.getElementById("textarea")
    caracter=caracter.toUpperCase()
    if(caracter=="S"||caracter=="N"){
        textarea.innerHTML="CORRECTO"
    }else{
        textarea.innerHTML="INCORRECTO"
    }
}