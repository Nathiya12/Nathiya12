package program61To68;

public class Program64 {
	
	public static void main(String[] args) {
		int base = 2;
		int poweraised = 5;
		int result = Powerofnum(base, poweraised);
		System.out.println(+result);
	}

	private static int Powerofnum(int base, int poweraised) {
		// TODO Auto-generated method stub
		if (base != 0) {
			return (int) Math.pow(2, 5);
		} else {
			return 0;
		}
	}

}
