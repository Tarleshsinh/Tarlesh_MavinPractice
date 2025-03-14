package Infy_Tryout_increment_Decrement_operators;

enum SizeofPizza {
	SMALL, MEDIUM, LARGE;
}
public class _Enum_With_Switch_Statement {
	public void chckoffer(SizeofPizza p) {
		switch (p) {
		case SMALL:
			System.out.println("10% offer applied");
			break;
		case MEDIUM:
			System.out.println("15% offer applied");
			break;
		case LARGE:
			System.out.println("20% offer applied");
			break;
		}
	}
		
	public static void main(String[] args) {
		
		_Enum_With_Switch_Statement obj = new _Enum_With_Switch_Statement();
		obj.chckoffer(SizeofPizza.LARGE);
		obj.chckoffer(SizeofPizza.SMALL);

	}

}
