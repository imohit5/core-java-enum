
public enum Confirmation {
	Online(1234), Text(2345), Email(3456), Mail(4567);
	
	int id;

	Confirmation(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
