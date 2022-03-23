package program50To60;

public class Program55 {

	public static void main(String[] args) {
		int num = 337, ans = 0, tempNum = num, rem;
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		while (tempNum != 0) {

			rem = tempNum % 10;
			ans += Math.pow(rem, 3);

			tempNum = tempNum / 10;
		}
		if (prime && (num == ans)) {
			System.out.println("The Given Number is Prime Number and also an Amstrong Number");
		} else if (prime) {
			System.out.println("The Given Number is Prime Number but not an Amstrong Number");
		} else if (num == ans) {
			System.out.println("The Given Number is an Amstrong Number but not an Prime Number");
		} else {
			System.out.println("The Given Number is neither Prime Number nor Amstrong Number");
		}
	}
}
