package banco;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
	private int nrRegistro;
	private LocalDate dataContratacao;
	
	public int getNrRegistro() {
		return nrRegistro;
	}
	public void setNrRegistro(int nrRegistro) {
		this.nrRegistro = nrRegistro;
	}
	public LocalDate getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	public void pedirDemisao() {
		System.out.println("DEMITIDO!!");
	}
	
	public void serContratado() {
		System.out.println("CONTRATADO!!");
	}
}
