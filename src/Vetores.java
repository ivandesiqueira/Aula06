import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {

		double alunos[] = new double[3];

		double total = 0;

		Scanner leitor = new Scanner(System.in);

		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Digite o consumo do " + (i + 1) + " aluno");
			alunos[i] = leitor.nextDouble();
			total = total + alunos[i];
		}

		for (int i = 0; i < alunos.length; i++) {
			System.out.println("O aluno " + (i + 1) + " consumiu R$" + alunos[i]);
		}

		System.out.println("O total de consumo foi: " + total);

		leitor.close();

	}

}
