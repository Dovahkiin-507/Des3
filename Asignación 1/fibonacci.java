/**
 * fibonacci
 */
public class fibonacci {

    public static void main(String[] args) {
        
        long a=0, b=1, c=0, d=0, numeros = 0;
		
		while (numeros <= 50){
			
				c = a + b;
					
					
				if (c%2!=0){
						
						System.out.println(numeros+". Impar: "+c);
						
						d=d+c;
						numeros++;
						
				}
					
				a = b;
				b = c;

		}

		
		System.out.println("El resultado es: "+d);

    }
}