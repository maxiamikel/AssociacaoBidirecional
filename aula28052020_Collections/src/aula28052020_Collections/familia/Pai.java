package aula28052020_Collections.familia;

import java.util.ArrayList;

public class Pai {
	private String nome;
	private int cpf;
	ArrayList<Filho> filhos = new ArrayList<>();

	public Pai(int cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		this.filhos = filhos;
	}

	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public ArrayList<Filho> getFilhos() {
		return filhos;
	}

	public void addFilhos(Filho f) {
		this.filhos.add(f);
	}

	public int contarFilhos() {
		int quantidade = 0;
		for (int i = 0; i < this.filhos.size(); i += 1) {
			quantidade += 1;
		}
		return quantidade;
	}

}
