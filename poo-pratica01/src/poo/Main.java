package poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Professor> professores = new ArrayList<>();
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		
		for(int i = 0; i < 3; i++) {
			Professor p = new Professor();
			Scanner s = new Scanner(System.in);
			
			System.out.println("Professor "+ (i+1) +":");
			
			System.out.println("Nome");
			p.setNome(s.nextLine());
			
			System.out.println("Data de nascimento:");
			p.setDataNasc(LocalDate.ofEpochDay(Long.valueOf(s.nextLine())));
			
			System.out.println("CPF:");
			p.setCpf(Long.valueOf(s.nextLine()));
			
			System.out.println("Siape");
			p.setSiape(Long.valueOf(s.nextLine()));
			
			professores.add(p);
			
		}
		
		for(int i = 0; i < 3; i++) {
			Aluno a = new Aluno();
			Scanner s = new Scanner(System.in);
			
			System.out.println("Aluno "+ (i+1) +":");
			
			System.out.println("Nome");
			a.setNome(s.nextLine());
			
			System.out.println("Data de nascimento:");
			a.setDataNasc(LocalDate.ofEpochDay(Long.valueOf(s.nextLine())));
			
			System.out.println("CPF:");
			a.setCpf(Long.valueOf(s.nextLine()));
			
			System.out.println("Matricula:");
			a.setMatricula(Long.valueOf(s.nextLine()));
			
			alunos.add(a);
		}
	}

}
