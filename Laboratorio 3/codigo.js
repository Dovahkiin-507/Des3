(function(){
    const App = {
        htmlElements:{
            form: document.querySelector('.frm_formulario1'),
            input: document.querySelector('.txtb_Caja1'),
        },

        init: function(){
            App.bindEvents();
        },

        bindEvents: function(){
            App.htmlElements.form.addEventListener('submit', App.events.onFormSubmit)
        },

        events: {
            onFormSubmit: function(e){
                e.preventDefault();

                const lectura = App.htmlElements.input.value;
                        
                var pal = false;
                var bin = true;                   
                var aux = lectura;
                var cifra;
                var inverso = 0;
                    
                while (aux > 0){
                    cifra = aux % 10;

                    if(cifra != 0 && cifra != 1){
                        bin = false;
                    }

                    inverso = inverso * 10 + cifra;
                    aux = aux / 10;
                    aux = ~~aux;

                }

                if(lectura == inverso){
                    pal = true;
                }

                if (bin==true & pal==true){
                    alert("El número es palindromo y binario.");
                }

                if (bin==false & pal==true){
                    alert("El número es palindromo pero no es binario.");
                }

                if (bin==true & pal==false){
                    alert("El número no es palindromo pero es binario.");
                }

                if (bin==false & pal==false){
                    alert("El número no es palindromo ni es binario.");
                }
                
            }

        }
    };
    App.init();
})();