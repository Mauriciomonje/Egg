var boton = document.getElementById("boton")
var arreglo=[]
var boton1=document.getElementById("cantidad")
var cantidad=null
var i=null
boton1.addEventListener('click',()=>{
    cantidad=document.getElementById("ingreso").value
    
})
//listener con funcion flecha  ('click',()=>{ 

//})
boton.addEventListener('click',function (){
    var num=document.getElementById("numeros").value
    if (cantidad>i) {
        arreglo.push(num)
        var mostrar=document.getElementById("mostrar")
        mostrar.innerHTML=arreglo
        i++;
    }
})

