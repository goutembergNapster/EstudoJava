package br.com.java.curso_em_video;

public class Conta {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		
		System.out.println("--------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		
		System.out.println("----------------------------");
	}
	
// Metodo construtor 
	
	public Conta() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
// Criacao dos metodos especiais
	
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int conta) {
		this.numConta = conta;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo (String t) {
		this.tipo = t;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setDono(String d) {
		this.dono = d;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double s) {
		this.saldo = s;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean state) {
		this.status = state;
	}
	
	
// Criacao dos metodos
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		}else if (t == "CP"){
			this.setSaldo(150);
		}
		System.out.println("Sua conta foi aberta");
	}
    public void fecharConta() {
    	if (this.getSaldo() > 0) {
    		System.out.println("Conta nao pode ser fechada pois ha valores nela");
    	}else if (this.getSaldo() < 0) {
    		System.out.println("Conta nao pode ser fechada pois ha debito nela");
    	}else {
    		this.setStatus(false);
    		System.out.println("Conta Fechada com sucesso!");
    	}
    	    
    }
    public void depositar(float v) {
	   if (this.getStatus()) {
		   this.setSaldo(this.getSaldo() + v);
		   System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
		   
	   }else {
		   System.out.println("Conta fechada, deposito nao permitido");
	   }
    }
    public void sacar(float v) {
	   if (this.getStatus()) {
		   if (this.getSaldo() >= v) {
			   this.setSaldo(this.getSaldo() - v);
			System.out.println("Saque Realizado na conta de " + this.getDono());
		   }else {
			   System.out.println("Saldo insuficiente para saque");
		   }
	   }else {
		   System.out.println("Impossivel de sacar, conta fechada");
	   }
    }
    public void pagarMensal() {
	   int v = 0;
	   if (this.getTipo() == "CC") {
		   v = 12;
	   } else if (this.getTipo() == "CP") {
		   v = 20;
	   }
	   if (this.getStatus()) {
		   this.setSaldo(this.getSaldo() - v);
		   System.out.println("Mensalidade paga com sucesso por " + this.getDono());
	   }else {
		   System.out.println("Conta Fechada, Impossivel pagar mensalidade");
	   }
     }
}
