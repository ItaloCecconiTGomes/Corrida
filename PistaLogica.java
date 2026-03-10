package atv;

public class PistaLogica {
	private String carro1;
	private int velocidadeCarro1;
	private int distanciaCarro1;
	private String posicaoCarro1;
	private String carro2;
	private int velocidadeCarro2;
	private int distanciaCarro2;
	private String posicaoCarro2;
	
	public PistaLogica() {
		this.setVelocidadeCarro1(0);
		this.setVelocidadeCarro2(0);
		this.setDistanciaCarro1(0);
		this.setDistanciaCarro2(0);
		this.setCarro1("#");
		this.setCarro2("#");
		this.setPosicaoCarro1("");
		this.setPosicaoCarro2("");
	}
	public void demonstracao() {
		System.out.println("-----------------------------------------------------------------|");
		System.out.println("#                                                                |");
		System.out.println("#                                                                |");  
		System.out.println("-----------------------------------------------------------------|");
	} 
	public void aleatorio() {
		do {
			velocidadeCarro1 = (int)(Math.random() * 3) + 1;
			this.setDistanciaCarro1(this.getDistanciaCarro1() + this.getVelocidadeCarro1());
			if(this.getVelocidadeCarro1() == 1) {	
				this.setPosicaoCarro1(this.getPosicaoCarro1() + " ");
			}else if(this.getVelocidadeCarro1() == 2) {
				this.setPosicaoCarro1(this.getPosicaoCarro1() + "  ");
			}else {
				this.setPosicaoCarro1(this.getPosicaoCarro1() + "   ");
			}
			velocidadeCarro2 = (int)(Math.random() * 3) + 1;
			this.setDistanciaCarro2(this.getDistanciaCarro2() + this.getVelocidadeCarro2());
			if(this.getVelocidadeCarro2() == 1) {
				this.setPosicaoCarro2(this.getPosicaoCarro2() + " ");
			}else if(this.getVelocidadeCarro2() == 2) {
				this.setPosicaoCarro2(this.getPosicaoCarro2() + "  ");
			}else {
				this.setPosicaoCarro2(this.getPosicaoCarro2() + "   ");
			}
			System.out.println("-----------------------------------------------------------------|");
			System.out.println(this.getPosicaoCarro1()+this.getCarro1()+"                         ");
			System.out.println(this.getPosicaoCarro2()+this.getCarro2()+"                         ");  
			System.out.println("-----------------------------------------------------------------|");
		}while(this.getDistanciaCarro1() < 65 && this.getDistanciaCarro2() < 65);
		System.out.println("Distancia percorrida pelo carro 1: "+this.getDistanciaCarro1());
		System.out.println("Distancia percorrida pelo carro 2: "+this.getDistanciaCarro2());
		
		if(this.getDistanciaCarro1() > this.getDistanciaCarro2()) {
			System.out.println("O carro 1 venceu! ");
		}else if(this.getDistanciaCarro2() > this.getDistanciaCarro1()) {
			System.out.println("O carro 2 venceu! ");
		}else {
			System.out.println("Empate! ");
		}
	}
	
	public String getCarro1() {
		return carro1;
	}
	public void setCarro1(String carro1) {
		this.carro1 = carro1;
	}
	public int getVelocidadeCarro1() {
		return velocidadeCarro1;
	}
	public void setVelocidadeCarro1(int velocidadeCarro1) {
		this.velocidadeCarro1 = velocidadeCarro1;
	}
	public int getDistanciaCarro1() {
		return distanciaCarro1;
	}
	public void setDistanciaCarro1(int distanciaCarro1) {
		this.distanciaCarro1 = distanciaCarro1;
	}
	public String getPosicaoCarro1() {
		return posicaoCarro1;
	}
	public void setPosicaoCarro1(String posicaoCarro1) {
		this.posicaoCarro1 = posicaoCarro1;
	}
	public String getCarro2() {
		return carro2;
	}
	public void setCarro2(String carro2) {
		this.carro2 = carro2;
	}
	public int getVelocidadeCarro2() {
		return velocidadeCarro2;
	}
	public void setVelocidadeCarro2(int velocidadeCarro2) {
		this.velocidadeCarro2 = velocidadeCarro2;
	}
	public int getDistanciaCarro2() {
		return distanciaCarro2;
	}
	public void setDistanciaCarro2(int distanciaCarro2) {
		this.distanciaCarro2 = distanciaCarro2;
	}
	public String getPosicaoCarro2() {
		return posicaoCarro2;
	}
	public void setPosicaoCarro2(String posicaoCarro2) {
		this.posicaoCarro2 = posicaoCarro2;
	}
}
