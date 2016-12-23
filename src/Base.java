
public class Base extends Super {
	
	/*public void add(){
		System.out.println("Base\'s add");
	}*/
	public static void main(String[] args) {
		Base base = new Base();
		base.add();
		Super supers = new Base();
		supers.add();
	}

}
