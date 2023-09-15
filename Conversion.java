package GUI;

import javax.swing.JTextField;

public class Conversion {
	
         
	private double cantidad, resultado;
	private int divisa1, divisa2;

	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public int getDivisa1() {
		return divisa1;
	}
	public void setDivisa1(int divisa1) {
		this.divisa1 = divisa1;
	}
	public int getDivisa2() {
		return divisa2;
	}
	public void setDivisa2(int divisa2) {
		this.divisa2 = divisa2;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	//Constructor
	public Conversion() {
		
	}
	
	 //Operaciones
	
	public double convertir() {

		if(divisa1 ==0 && divisa2== 0) {
		resultado = cantidad * 0.26;
	   }if  (divisa1 ==0 && divisa2== 1) {
                 resultado = cantidad * 4.58; 
	   } if (divisa1 ==0 && divisa2== 2) {    
	              resultado = cantidad * 0.24; 
	   }  if (divisa1 ==0 && divisa2== 3) {    
	               resultado = cantidad * 355.8;
	   } if (divisa1 ==0 && divisa2== 4) {     
	              resultado = cantidad * 39.8;
	   } if (divisa1 ==0 && divisa2== 5) {     
	              resultado = cantidad * 1.92; 
	   } if(divisa1 ==1 && divisa2== 1) { 
	     resultado = cantidad * 17.104;     
	   } if (divisa1 ==2 && divisa2== 2) {    
	              resultado = cantidad * 0.054;
	   }  if (divisa1 ==3 && divisa2== 3) {     
	               resultado = cantidad * 1412.100;
	   }  if (divisa1 ==4 && divisa2== 4) {    
	               resultado = cantidad * 0.1;
	   } if (divisa1 ==5 && divisa2== 5) {    
	              resultado = cantidad * 0.049;
	   }
	   
	   
	                                        
	   
	   
	   
	   
	   return resultado; 

	} 
	
}
