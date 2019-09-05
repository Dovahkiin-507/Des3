import java.util.Scanner;

public class palindromo {

    public static void main(String[] args) {
        
        Scanner texto = new Scanner(System.in);
		
		String palabra = "";
		String inversa = "";
		
		System.out.println("Ingrese una palabra");
		palabra = texto.nextLine();
		texto.close();
		
		
		for(int i = palabra.length() - 1; i >= 0; i--)
        {
            inversa = inversa + palabra.charAt(i);
        }
		
		System.out.println("Palabra invertida: "+ inversa);
		
		
		if (palabra.equals(inversa)){
			
			System.out.println("Esta palabra es un palindromo.");
			
		}
		
		else{
			
			System.out.println("Esta palabra no es un palindromo.");
			
		}


    }
}