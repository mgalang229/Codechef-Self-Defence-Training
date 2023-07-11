import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int counter = 0;
			for (int i = 0; i < n; i++) {
				int x = fs.nextInt();
				if (10 <= x && x <= 60) {
					counter++;
				}
			}
			System.out.println(counter);
		}
		fs.close();
	}
}
