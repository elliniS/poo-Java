package banco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
		ArrayList<Cliente> listaCliente = new ArrayList<>();
		Funcionario f1 = new Funcionario();
		
		f1.setNome("ell");
		f1.setEmail("juhufguio@fmkmkk.com");
		f1.setDataNasc(LocalDate.of(1892, 9, 6));
		f1.setDataContratacao(LocalDate.of(2003, 3, 11));
		f1.setNrRegistro(1111);
		
		listaFuncionario.add(f1);
		f1.serContratado();
		
		Funcionario f2 = new Funcionario();
		
		f2.setNome("vic");
		f2.setDataNasc(LocalDate.of(1892, 9, 6));
		f2.setEmail("uirehuer@yuyet.br");
		f2.setDataContratacao(LocalDate.of(2003, 3, 11));
		f2.setNrRegistro(222);
		
		listaFuncionario.add(f2);
		f2.serContratado();
		
		Cliente c1 = new Cliente();
		
		c1.setNome("joa");
		c1.setEmail("joa@erytg.it");
		c1.setNrConta(191919);
		c1.depositar(22.2);
		c1.depositar(11);
		c1.sacar(3);
		
		listaCliente.add(c1);
		
		Cliente c2 = new Cliente();
		
		c2.setNome("luiz");
		c2.setEmail("j43aser@eSDF.it");
		c2.setNrConta(1838);
		c2.depositar(54.5);
		c2.depositar(11);
		c2.sacar(3);
		
		listaCliente.add(c2);
		
		System.out.println("Funcionarios:");
		
		for(Funcionario funcinario : listaFuncionario) {
			System.out.println(funcinario.getNome() + " " + funcinario.getNrRegistro());
			
		}
		
		System.out.println("Clientes:");
		
		for(Cliente cliente : listaCliente) {
			System.out.println(cliente.getNome() + " " + cliente.getNrConta() + " " + cliente.mostarSaldo());
		}
		
		
		
		
		
		
	}

}

// LocallDate: year-month-day