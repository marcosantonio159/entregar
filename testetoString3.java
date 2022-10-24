public String toString() {

		if (this.totalDeAlunos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i < this.totalDeAlunos - 1;i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}
		
		builder.append(this.alunos[this.totalDeAlunos - 1]);
		builder.append("]");
		
		return builder.toString();
	}
