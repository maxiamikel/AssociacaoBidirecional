package aula28052020_Collections.familia;

public class AppFamilia {

	public static void main(String[] args) {
		Pai jose = new Pai(012, "José Dessources Lachapelle");

		Filho primeiro = new Filho(124, "Jean Jacques Dessources", jose);
		Filho segundo = new Filho(1220, "Maria Altagracia Dessources", jose);
		Filho terceiro = new Filho(0124, "Juna Jacqueline Dessources", jose);

		jose.addFilhos(primeiro);
		jose.addFilhos(segundo);
		jose.addFilhos(terceiro);

		imprimirNaTela(jose);

	}

	public static void imprimirNaTela(Pai p) {
		System.out.println("Familia");
		System.out.println("Dados do Pai");
		System.out.println("CPF...: " + p.getCpf());
		System.out.println("NOME..: " + p.getNome());
		System.out.println("-------------------------");
		System.out.println("Fihlo (s) ");
		for (int i = 0; i < p.filhos.size(); i += 1) {
			System.out.println(i + 1 + "-");
			System.out.println("CPF: " + p.getFilhos().get(i).getCpf());
			System.out.println("NOME: " + p.getFilhos().get(i).getNome());
			System.out.println("Filho de: " + p.getFilhos().get(i).getPai().getNome());
			System.out.println();
		}
	}

}
