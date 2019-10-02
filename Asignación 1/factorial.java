import java.util.Scanner;

public class factorial{

    public static void main(String[] args) {
        
        Scanner texto = new Scanner(System.in);
        
        String text;
        int numa = 0;
        int numb = 0;
        int fact = 0;
        int num = 0;
        int suma = 0;
    		
		System.out.println("Ingrese un número");
		text = texto.nextLine();
        texto.close();

        num = Integer.parseInt(text);
        
        fact = num * (num-1);

        numa = num-1;

        while (numa > 1){

            numb = numa-1;

            fact = fact * numb;
            numa = numb;

        }

        System.out.println("Factorial del número: "+fact);
        
        
        String number = String.valueOf(fact);
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            suma = suma + j;
        }

        System.out.println("La suma de los caracteres del factorial es: "+suma);

    }

}