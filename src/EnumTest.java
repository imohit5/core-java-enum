
public class EnumTest {

	public static void main(String[] args) {
		
		Confirmation conf = Confirmation.Email;
		System.out.println(conf);
		
		
		Confirmation[] values = Confirmation.values();
		for (Confirmation confirmation : values) {
			System.out.println(confirmation);
			System.out.println(confirmation.ordinal());
			System.out.println(confirmation.getId());
		}
		
	}

}
