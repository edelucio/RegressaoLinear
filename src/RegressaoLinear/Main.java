package RegressaoLinear;


public class Main {
	
	
	public static void main(String [] args){
		
		RegressaoLinear modelolinear = new RegressaoLinear();
		
		double [] x = {6,7,8,9,10};
		double [] y = {150,200,300,500,1000};
				
		modelolinear.calculo(x, y);
		System.out.println(modelolinear.predicao(15));
				
	}

}

