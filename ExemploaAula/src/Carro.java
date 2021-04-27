import javax.swing.JOptionPane;

public class Carro {
	
	
	//atributos e metodos : são membros 
	//this serve para acessar membros da própria classe. (tributos e metodos)
	
	public String marca;
	public int ano;
	private int marcha = 0;
	public boolean ligado;
	public int velocidade;
	public boolean freio = true; 
	
	                                                 //Métodos
	
	public void ligar() {
		 if(this.ligado == false) {
			    this.ligado = true;
				JOptionPane.showMessageDialog(null, "Carro ligado ");
			    //System.out.println("Carro ligado");
		 }else {
			 System.out.println("Carro ja esta ligado");
		 }
		 }
	//----------------------------------------------------------
	public void desligar() {
		if(this.ligado == true) {
			this.ligado = false;
			JOptionPane.showMessageDialog(null, "Carro desligado ");
			//System.out.println("Carro Desligado");
		}else {
			System.out.println("Carro ja esta desligado ");
		}
	   }
	//-------------------------------------------------------
	public void acelerar(int velocidade) {
		if(this.ligado==true) {
			if(this.freio == false) {
				if(marcha == 0) {
					JOptionPane.showMessageDialog(null, "Carro esta em ponto morto ");
				}else if(marcha == 1) {
					if (velocidade <30) {
					this.velocidade = velocidade;
					System.out.println("O caro esta há : "+this.velocidade + " km/hr");
					}
				}
				else if(marcha == 2) {
					if (velocidade <50) {
					this.velocidade = velocidade;
					System.out.println("O caro esta há : "+this.velocidade + " km/hr");
					}
				}
				else if(marcha == 3) {
					if (velocidade <80) {
					this.velocidade = velocidade;
					System.out.println("O caro esta há : "+this.velocidade + " km/hr");
					}
				 }
				
			  }
			
		   }
			
		}
   //----------------------------------------------------
		
		public void trocarMarcha() {
		     this.marcha = this.marcha +1;
			//System.out.println("Marcha trocada");
	     }
		}
