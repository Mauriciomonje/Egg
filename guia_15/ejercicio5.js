var calcular=document.getElementById("calcular")
calcular.onclick=function(){
    var seleccion=document.getElementById("seleccion").value
    var n1=document.getElementById("n1").value
    var n2=document.getElementById("n2").value
    var salida=document.getElementById("salida")
    var resultado=null
    n1=parseInt(n1)
    n2=parseInt(n2)
    switch (seleccion) {
        case "s":
            resultado=n1+n2;
            salida.innerHTML=resultado;
            break;
        case "r":
            resultado=n1-n2;
            salida.innerHTML=resultado;
            break;
        case "m":
            resultado=n1*n2;
            salida.innerHTML=resultado;
            break;
        case "d":
            resultado=n1/n2;
            salida.innerHTML=resultado;
            break;
    
        default:
            break;
    }

}