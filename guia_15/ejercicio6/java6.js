var calcular=document.getElementById("verificar")
calcular.onclick= function(){
    var numero=document.getElementById("numero").value
    var mostrar=document.getElementById("mostrar")
    if(numero==0){
        mostrar.innerHTML=" EL NUMERO NO ES PAR NI IMPAR"
    }else{
        if(numero%2==0&&numero!=0){
            mostrar.innerHTML=" ES PAR "
        }else{
            mostrar.innerHTML=" ES IMPAR "
        }

    }
}