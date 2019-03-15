class Conta{
	private String titular;
	int numero;
	String agencia;
	double saldo;
	String dataDeAbertura;
	private static int contador;
	private int identificador = contador+1;

	public setidentificador(int somar){
	identificador++;
	return somar+identificador;
	}	

	int getidentificador(){
	return Conta.identificador;
	}

    Conta(){
	Conta.contador++;
    }

    Conta(String titular){
    this.titular = titular;
    }

    public String getTitular(){
    return this.titular;
    }

    public void setTitular(String titular){
    this.titular = titular;
    }

	void saca(double valor){
	    this.saldo-=valor;
	}

	void deposita(double valor){
    	this.saldo +=valor;
	}
	
	double calculaRendimento(){
	    return saldo*0.1;
	}

	String recuperaDadosParaImpressao(){
		String dados = "Titular= " +this.titular;
		dados += "\nNumero= " +this.numero;
		dados += "\nAgencia= " +this.agencia;
		return dados;
	}
}
