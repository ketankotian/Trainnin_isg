
public class Nov_1_1 {
	public static void main(String[] args) {

		// ip
		int num = 19;

		// process
		boolean isPrime = true, isTp = true;
		int ld, rev = 0;
		System.out.println("number : " + num);
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				isPrime = false;
		}
		while (num != 0) {
			ld = num % 10;
			rev = ld + rev * 10;
			num = num / 10;
		}
		System.out.println("reverse : " + rev);

		for (int i = 2; i < rev; i++) {
			if (rev % i == 0)
				isTp = false;
		}
		if (isPrime && isTp) {
			System.out.println("TP");
		} else
			System.out.println("NTP");

	}

}
