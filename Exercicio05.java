package Lista_2_Estrutura_De_Decisao;

/*Construa um algoritmo que leia um n�mero inteiro (positivo ou negativo) e apresente o seu
m�dulo (n�mero sem sinal).*/

public class Exercicio05 {
	private Integer numero;

	
	
	public Exercicio05() {
		
	}

	public Exercicio05(Integer numero) {
		
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Integer calcularModulo() {
		if ( getNumero() > 0 )
			return getNumero();
		
		return getNumero()* (-1);
	}
	
}
