package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto alunos serao digitados? ");

        int n = scanner.nextInt();
        Aluno[] alunoVect = new Aluno[n];

        for (int i = 0; i < alunoVect.length; i++) {
            scanner.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i + 1);
            String nomeAluno = scanner.nextLine();

            double primeiraNota = scanner.nextDouble();
            double segundaNota = scanner.nextDouble();

            alunoVect[i] = new Aluno(nomeAluno, primeiraNota, segundaNota);
        }

        System.out.println("Alunos aprovados:");

        for (Aluno aluno : alunoVect) {
            if (aluno.mediaNotas(aluno.getPrimeiraNota(), aluno.getSegundaNota()) >= 6) {
                System.out.println(aluno.getName());
            }
        }
    }
}
