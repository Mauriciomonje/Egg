var verificar= document.getElementById("chequear")
verificar.onclick = function (){
    var textarea=document.getElementById("textarea")
    var edad = document.getElementById("edad").value;
    console.log(edad)
    if(edad>17){
        textarea.innerHTML="Usted es mayor de edad"
    }else{
        textarea.innerHTML="Usted es menor de edad"
    }
}

