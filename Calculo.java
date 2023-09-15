package GUI;

public class Calculo {
	private double magnitud, resultado;
	private int m1,m2;
	public double getMagnitud() {
		return magnitud;
	}
	public void setMagnitud(double magnitud) {
		this.magnitud = magnitud;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	
public double convertir() {                     
        
		if( m1 ==0 && m2==0 ) {            
		resultado = magnitud * 1.01;                
		}if( m1 ==1 && m2==1 ) {            
			resultado = magnitud * 	3000;                
		}
		if( m1 ==2 && m2==2 ) {            
			resultado = magnitud * 1.01;                
			}
		if( m1 ==3 && m2==3 ) {            
			resultado = magnitud * 6.022;                
			}
		if( m1 ==4 && m2==4 ) {            
			resultado = magnitud * 0.0929;                
			}
		if( m1 ==5 && m2==5 ) {            
			resultado = magnitud * 27.7;                
			}
		
	                                                
	                                                
	                                                
	                                                
	                                                
	                                                
	                                               
	                              
	                                                
	
		return resultado;                                                
	                                                
	
	}
	
}
