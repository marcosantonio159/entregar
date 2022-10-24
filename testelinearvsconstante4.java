import br.com.caelum.ed.Aluno;

    public class TesteLinearVSConstante {
       
        private Aluno[] aluno = new Aluno[100000];
        
        private int totalDeAlunos = 0;

        public void adiciona(Aluno aluno){
            this.garantaEspaco();
            this.alunos[this.totalDeAlunos] = aluno;
            this.totalDeAlunos++;
        }
        
        public static void main(String[] args) {
         Vetor vetor = new Vetor();        
        long inicio = System.currentTimeMillis();        
        for (int i = 1; i < 100000; i++) {        	
        Aluno aluno = new Aluno();
        vetor.adiciona(aluno);
        }
        
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;       
        System.out.println("Tempo em segundos = " + tempo); 
    }
}
	// primeira maneira consumo de tempo linear
//		for (int i = 0; i < this.alunos.length; i++) {
//			if (this.alunos[i] == null) {
//				this.alunos[i] = aluno;
//				break;
//			}
//		}
    	    
    	
    	