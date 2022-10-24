package br.com.caelum.ed.vetores.teste

public class teste {

	public class TesteAdicionaNoFim {
		public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		System.out.println(lista);
		}
	}

	public class TesteAdicionaPorPosicao {
		public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		a3.setNome("Ana");
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(0, a2);
		lista.adiciona(1, a3);
		System.out.println(lista);
		}
	}

	public class TestePegaPorPosicao {
		public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		Aluno aluno1 = lista.pega(0);
		Aluno aluno2 = lista.pega(1);
		System.out.println(aluno1);
		System.out.println(aluno2);
		}
	}
	
	public class TesteRemovePorPosicao {
		public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.remove(0);
		System.out.println(lista);
		}
	}
	
	public class TesteContemAluno {
		public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		System.out.println(lista.contem(a1));
		System.out.println(lista.contem(a2));
		Aluno aluno = new Aluno();
		aluno.setNome("Ana");
		System.out.println(lista.contem(aluno));
		}
	}
	
	public class TesteTamanhoLista {
		public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		System.out.println(lista.tamanho());
		lista.adiciona(a3);
		System.out.println(lista.tamanho());
		}
	}
	
}