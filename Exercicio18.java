package Lista_2_Estrutura_De_Decisao;
/*Construa um algoritmo que leia o ano de nascimento de uma pessoa (AN) e mostre a sua
idade e, tamb�m verifique e mostre se essa pessoa j� tem idade para votar (16 anos ou
mais) e se j� pode conseguir a sua carteira de habilita��o (18 anos ou mais).*/
public class Exercicio18 {
	private int anoNascimento;

	public Exercicio18(int anoNascimento) {
		setAnoNascimento(anoNascimento);
	}

	public Exercicio18() {
		super();
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
}
