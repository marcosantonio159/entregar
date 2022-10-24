package br.com.caelum.ed.vetores;

import br.com.caelum.ed;


public void adiciona(int posicao, Aluno aluno) {
    if (!this.posicaoValida(posicao)) {
    throw new IllegalArgumentException("Posicao inválida");
    }
        for (int i = this.totalDeAlunos - 1; i >= posicao; i--) {
        this.alunos[i + 1] = this.alunos[i];
        }
    this.alunos[posicao] = aluno;
    this.totalDeAlunos++;
}
private boolean posicaoValida(int posicao) {
return posicao >= 0 && posicao <= this.totalDeAlunos;
}
