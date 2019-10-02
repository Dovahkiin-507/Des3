function validador(){



document.getElementById('btn_Boton1').addEventListener('click', function () {
            
    var lectura = document.getElementById('txtb_Caja1').value;
    
    var pal = false;
    var bin = true;                   
    var aux = lectura;
    var cifra;
    var inverso = 0;
    
    while (aux > 0){
        cifra = aux % 10;
        console.log("Este es el residuo "+cifra);

        if(cifra != 0 && cifra != 1){

            console.log("No es binario? :c "+cifra);

            bin = false;

        }

        inverso = inverso * 10 + cifra;
        console.log("Este es el intento de inverso "+inverso);
        aux = aux / 10;
        aux = ~~aux;
        console.log("Este es el intento de aux "+aux);
    }

    console.log("Este es: "+inverso);

    if(lectura == inverso){
        pal = true;
    }


    if (bin==true & pal==true){
    alert("El número es palindromo y binario.")
    }

    if (bin==false & pal==true){
    alert("El número es palindromo pero no es binario.")
    }

    if (bin==true & pal==false){
    alert("El número no es palindromo pero es binario.")
    }

    if (bin==false & pal==false){
    alert("El número no es palindromo ni es binario.")
    }


})
}