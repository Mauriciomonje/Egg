var boton=document.getElementById("ingresa")
var max=null
var min=9999
var prom=0
var contador=null

boton.onclick=function(){
    var num=document.getElementById("ingreso").value
    if(num!=0){
        contador++
        prom+=parseInt(num)
        if(max<num){
            max=num
        }
        if(min>num){
            min=num
        }
    }else{
        prom/=contador
        var maximo=document.getElementById("maximo")
        maximo.innerHTML="MAXIMO: "+max
        var minimo = document.getElementById("minimo")
        minimo.innerHTML="MINIMO: "+min
        var promedio=document.getElementById("promedio")
        promedio.innerHTML="PROMEDIO: "+prom
    }
}
