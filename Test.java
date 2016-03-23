
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]'
		MutInteger mi = new MutInteger(9,0,10);
		for (int i = 0; i < 1000; i++) {
			mi.mutate();
			System.out.println(mi);
		}
		
	}

}
