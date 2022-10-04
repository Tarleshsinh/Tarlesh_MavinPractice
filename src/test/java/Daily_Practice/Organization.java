package Daily_Practice;





public class Organization extends Employee  {

	 int department = 10;
	 String name;
	 static int c;
	 public Employee employee;
	
	public static void main (String args[]) {
	
	 	
		int a [] [] = new int [3][3];
		
		a[0][0] = 10;
		a[0][1]= 20;
		a[0][2]= 30;
		
		a[1][0]= 40;
		a[1][1]= 50;
		a[1][2]=60;
		
		a[2][0]= 100;
		a[2][1]= 200;
		a [2][2]=300;
		
		
		for (int i=0;i<=3; i++) {
			for (int j = 0; j<=2; j++)
			{System.out.println(a[i][j] + "  ");}		
				
			{System.out.println();}
		
			
		}	
	}
	
}
