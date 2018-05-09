package Lista_2_Estrutura_De_Decisao;
/* Construa um algoritmo que determine quanto ser� gasto para encher o tanque de um carro
(VG), sabendo-se que o pre�o da gasolina � de R$ 1,80 e o pre�o do �lcool � de R$ 1,00. O
usu�rio fornecer� os seguintes dados: Tipo de carro (TC) (G � gasolina ou A � �lcool) e
Capacidade do tanque (CT), em litros. */


public class Exercicio04 {
	private String tipoCarro;
	private Double tamanhoTanque;
	
	public Exercicio04() {
		
	}
	public Exercicio04(String tipoCarro, Double tamanhoTanque) {
		
		setTipoCarro(tipoCarro);
		setTamanhoTanque(tamanhoTanque);
	}
	public String getTipoCarro() {
		return tipoCarro;
	}
	public void setTipoCarro(String tipoCarro) {
		
		if ( tipoCarro.equals("G") || tipoCarro.equals("A") || tipoCarro.equals("a") || tipoCarro.equals("g"))
			this.tipoCarro = tipoCarro;
		else 
			throw new NullPointerException("Digite Ap�nas  Gasolina (G) ou Alcool (A)"); 
	}
	public Double getTamanhoTanque() {
		return tamanhoTanque;
	}
	public void setTamanhoTanque(Double tamanhoTanque) {
		this.tamanhoTanque = tamanhoTanque;
	}
	
	public Double calcularPre�oTanqueDoCarro() {
		if(getTipoCarro().equals("G") || getTipoCarro().equals("g"))
			return getTamanhoTanque() * 4.34;
		return getTamanhoTanque() * 2.89;
	}
}
