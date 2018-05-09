package Lista_2_Estrutura_De_Decisao;
/* Construa um algoritmo que tendo como dados de entrada o pre�o de um produto (PR) e
seu c�digo de origem (CO), apresente o pre�o e a sua proced�ncia, de acordo com a tabela
abaixo: */
public class Exercicio17 {
	private Double precoProduto;
	private int codigoProduto;
	
	public Exercicio17(Double precoProduto, int codigoProduto) {
		
		setPrecoProduto(precoProduto);
		setCodigoProduto(codigoProduto);
	}
	
	public Exercicio17() {
		super();
	}
	
	public Double getPrecoProduto() {
		return precoProduto;
	}
	
	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	public int getCodigoProduto() {
		return codigoProduto;
	}
	
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	
}
