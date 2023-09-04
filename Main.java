package Escola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o matéria do aluno: ");
        String materia = scanner.nextLine();
        
        System.out.print("Digite o período do aluno: ");
        String periodo = scanner.nextLine();
        
        System.out.print("Digite a matrícula do aluno: ");
        int matricula = scanner.nextInt();
        
        Aluno aluno = new Aluno(nome, matricula, materia, periodo);

        System.out.println("Detalhes do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Materia: " + aluno.getMateria());
        System.out.println("Periodo: " + aluno.getPeriodo());
        System.out.println("Matrícula: " + aluno.getMatricula());

        scanner.close();
	}

}
