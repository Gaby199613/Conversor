package GUI;

import javax.swing.JTextField;

public class Control_Temperatura {
	private double temperatura, resultado;
	private int c1,c2;
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}  
	
	public int getC1() {
		return c1;
	}
	public void setC1(int c1) {
		this.c1 = c1;
	}
	public int getC2() {
		return c2;
	}
	public void setC2(int c2) {
		this.c2 = c2;
	}
	public double convertir() {                     
        
		if( c1 ==0 && c2==0 ) {            
		resultado = temperatura * -17.78;                
		}
		if( c1 ==1 && c2==1 ) {            
			resultado = temperatura * -457.87;                
		}
		if( c1 ==2 && c2==2 ) {            
			resultado = temperatura * 5.56;                
		} 
		if( c1 ==3 && c2==3 ) {            
			resultado = temperatura * 493.47 ;                
		}  
	                                                
	                                                
	                                                
	                                                
	                                                
	                                                
	                                               
	                              
	                                                
	
		return resultado;                                                
	                                                
	
	}
	                                   
}
