import java.util.Scanner;

public class MirrorGrid {//1703E
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		while (t-- > 0) {
			int n = scanner.nextInt();

			char[][] mat = new char[n][n];

			for (int i = 0; i < n; i++) {
				String row = scanner.next();
				for (int j = 0; j < n; j++) {
					mat[i][j] = row.charAt(j);
				}
			}

			int ans = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int c0 = 0, c1 = 0;

					if (mat[i][j] == '0') c0++;
					else c1++;

					if (mat[j][n - i - 1] == '0') c0++;
					else c1++;

					if (mat[n - i - 1][n - j - 1] == '0') c0++;
					else c1++;

					if (mat[n - j - 1][i] == '0') c0++;
					else c1++;

					if (c0 == 0 || c1 == 0) continue;

					if (c0 >= c1) {
						ans += c1;
						mat[i][j] = '0';
						mat[j][n - i - 1] = '0';
						mat[n - i - 1][n - j - 1] = '0';
						mat[n - j - 1][i] = '0';
					} else {
						ans += c0;
						mat[i][j] = '1';
						mat[j][n - i - 1] = '1';
						mat[n - i - 1][n - j - 1] = '1';
						mat[n - j - 1][i] = '1';
					}
				}
			}

			System.out.println(ans);
		}
		scanner.close();
	}
}