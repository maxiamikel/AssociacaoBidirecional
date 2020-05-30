package aula28052020_Collections.familia;

public class Filho {
	private String nome;
	private int cpf;
	private Pai pai;

	public Filho(int cpf, String nome, Pai pai) {
		this.cpf = cpf;
		this.nome = nome;
		this.pai = pai;
		//this.pai.addFilhos(this);
	}

	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public Pai getPai() {
		return pai;
	}

}
