
public class Main {

	public static void main(String[] args) {
		int[] vet = { 8, 9, 3, 5, 1 };  //c1
		int aux = 0;				//c2

		for (int i = 0; i < vet.length; i++) {		//i = 0;	c3	|	i<n;		c4*(n+1)	|	i++;		c5*n
			for (int j = 0; j < (vet.length - 1); j++) {	//j=0;		c6	|	j<(n-1)		c7*n	|	j++		c8*(n-1)
				if (vet[j] > vet[j + 1]) {					//c9*(n-1)^n
					aux = vet[j];							//c10*(n-1)^n
					vet[j] = vet[j + 1];					//c11*(n-1)^n
					vet[j + 1] = aux;						//c12*(n-1)^n
				}
			}
		}
		
		//Custo até aqui: c1 + c2 + c3 + c4*(n+1) + c5*n + c6 + c7*n + c8*(n-1) + c9*(n-1)^n + c10*(n-1)^n + c11*(n-1)^n + c12*(n-1)^n
		//
		System.out.println("Vetor organizado:");
		for (int i = 0; i < 5; i++) {
			System.out.println(" " + vet[i]);
		}

	}

}
