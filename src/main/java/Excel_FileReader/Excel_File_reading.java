package Excel_FileReader;

public class Excel_File_reading {

	public static void main(String[] args) {
System.out.println(System.getProperty("user.dir"));		
String path = System.getProperty("user.dir") +"\\src\\main\\java\\Excel_FileReader\\Testdata.xlsx";
Xls_Reader xls= new Xls_Reader(path);

		int rows= xls.getRowCount("Tarlesh");
		System.out.println(rows);
		
		int cols= xls.getColumnCount("Tarlesh");
		System.out .println(cols);
		
		String data= xls.getCellData("Tarlesh", "Username", 2);
		System.out.println(data);
		
		String paswd= xls.getCellData("Tarlesh", "Password", 2);
		System.out.println(paswd);
		
		String data1 =xls.getCellData("Tarlesh", "Username", 3);
		System.out.println(data1);
		
		String data2 =xls.getCellData("Tarlesh", "Password", 3);
		System.out.println(data2);
		
	}

}
