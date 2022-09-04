import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Insira a questao que voce deseja ver: ");
		int n = scan.nextInt();

		if (n == 1) {
			System.out.println("Questao 1:");
			int i = 0;
			for (; i < 100;) {
				System.out.println(i + " - ");
			}
		}
		if (n == 2) {
			System.out.println("Questao 2:");
			int i = 1;
			for (; i <= 100; i++) {
				System.out.println(i + " - ");
			}
		}
		if (n == 3) {
			System.out.println("Questao 3:");
			int i = 100;
			for (; i > 0; i--) {
				System.out.println(i + " - ");
			}
		}
		if (n == 4) {
			System.out.println("Questao 4:");
			int i = 0;
			for (; i <= 100; i += 2) {
				System.out.println(i + " - ");
			}
		}
		if (n == 5) {
			System.out.println("Questao 5:");
			int i = 0;
			for (; i <= 99; i++) {
				System.out.println(i + " - ");
			}
		}
		if (n == 6) {
			System.out.println("Questao 6:");
			int i = 0;
			int j = 33;
			for (; i < 100; i++) {
				System.out.println(i + " - " + j-- + "\n");

			}
		}
		if (n == 7) {
			System.out.println("Questao 7:");
			int i = 0;
			int j = 0;
			for (; i <= 100; i++, j += 3) {
				System.out.println(i + " - " + j + "\n");
			}
		}
		if (n == 8) {
			System.out.println("Questao 8:");
			int i = 0;
			int j = 100;
			for (; j >= 51; j--) {
				System.out.println(i++ + " - " + j + "\n");

			}
		}
		if (n == 9) {
			System.out.println("Questao 9:");
			int i = 0;
			int j = 33;
			for (; i <= 26; i += 2, j += 3) {
				System.out.print(i + " - " + j + "\n");
			}
		}
		if (n == 10) {
			System.out.println("Questao 10:");
			Scanner input = new Scanner(System.in);
			System.out.println("Informe o teto dos pares da direita: ");
			int x = input.nextInt();
			int i = 0;
			int j = 0;
			for (; i <= (x + 1); i++) {
				for (j = 0; j <= x; j++) {
					System.out.print(i + " - " + j + "\n");
				}
			}
		}
		if (n == 11) {
			System.out.println("Questao 11:");
			for (int i = 0; i <= 3; i++) {

				for (int j = 0, x = 0; j < 2; j++) {

					if (x == 2) {
						System.out.print(i + " - " + x + "\n");
						break;
					} else if (j == 0) {
						System.out.print(i + " - " + j + "\n");
					} else if (j == 1) {
						System.out.print(i + " - " + j + "\n");
						x++;
						j = j - 2;
					}
				}
			}
		}
		if (n == 12) {
			System.out.println("Selecione o numero referente ao item que voce deseja exibir da questao 12:");
			System.out.println("1=A\n2=B\n3=C\n4=D\n5=E");
			Scanner input = new Scanner(System.in);
			int item = scan.nextInt();
			if (item == 1) {
				System.out.println("Informe o valor das dimensoes: ");
				Scanner dimensao = new Scanner(System.in);
				int d = dimensao.nextInt();
				for (int i = 0; i <= d; i++) {
					for (int j = 0; j < i; j++) {
						System.out.print(" * ");
					}
					System.out.print("\n");

				}
			}
			if (item == 2) {
				System.out.println("Informe o valor das dimensoes: ");
				Scanner dimensao = new Scanner(System.in);
				int d = dimensao.nextInt();
				for (int i = 0; i <= d - 1; i++) {
					for (int j = 0; j <= d - 1; j++) {
						if (j == i) {
							System.out.print(" # ");
						} else if (j + i == d - 1) {
							System.out.print(" # ");
						} else {
							System.out.print(" * ");
						}
					}
					System.out.print("\n");
				}
			}
			if (item == 3) {
				System.out.println("Informe o valor das dimensoes: ");
				Scanner dimensao = new Scanner(System.in);
				int d = dimensao.nextInt();
				for (int i = 0; i < d; i++) {
					for (int j = 0; j < d; j++) {
						if (i % 2 == 0) {
							System.out.print(" # ");
						} else {
							System.out.print(" * ");
						}
					}
					System.out.print("\n");
				}
			}
			if (item == 4) {
				System.out.println("Informe o valor das dimensoes: ");
				Scanner dimensao = new Scanner(System.in);
				int d = dimensao.nextInt();
				for (int i = 0; i < d; i++) {
					for (int j = 0; j < d; j++) {
						if (i == 0 || j == 0 || i == d - 1 || j == d - 1) {
							System.out.print(" # ");
						} else {
							System.out.print(" * ");
						}
					}
					System.out.print("\n");
				}
			}
			if (item == 5) {
				System.out.println("Informe o valor das dimensoes: ");
				Scanner dimensao = new Scanner(System.in);
				int d = dimensao.nextInt();
				for (int i = 1; i <= d; i++) {
					for (int j = 1; j <= d; j++) {
						if (i <= d / 2) {
							System.out.print(" * ");
						} else if (i > d / 2) {
							if (j % 2 != 0) {
								System.out.print(" # ");
							} else {
								System.out.print(" $ ");
							}
						}
					}
					System.out.println("\n");
				}
			}
		}
	}
}
