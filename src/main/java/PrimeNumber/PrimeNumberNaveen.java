package PrimeNumber;

public class PrimeNumberNaveen {
	
	
	
	public static boolean primenumber(int num) {
		if(num<1) {
			return false;
		}
		for (int i=2; i<num; i++) {
			if(num % i==0 ) {
				return false;
			}
		}
		return true;
	}
	
	public  void getprimenumbers(int num) {
		for (int i=2; i<=num; i++) {
			if (primenumber(i)) 
				System.out.println(i + "This is a prime Number ");
			
		}
	}

	public static void main(String[] args) {
	
		//getprimenumbers(100);
		System.out.println(primenumber(3));
		//System.out.println(primenumber(12));
			
		}
		
		
	}

