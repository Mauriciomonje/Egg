var calcular = document.getElementById("calcular")
    calcular.onclick= function (){
        
        console.log("el listener funciona")
        var radio= document.getElementById("radio").value;
    
        console.log(radio)
        var area=(Math.PI * Math.pow(radio,2))
        var perimetro=(2*Math.PI*radio)
       // alert('AREA: ${area} \nPERIMETRO: ${perimetro})')
        var textarea=document.getElementById("area")
        var textperimetro=document.getElementById("perimetro")
        textarea.innerHTML="AREA: "+area;
        textperimetro.innerHTML="PERIMETRO: "+perimetro;
    };
