package RegressaoLinear;

public class RegressaoLinear {

// Declaração das variáveis
	int i;
 	double Soma_Ano = 0;
	double ano = 0;
	double anosalario = 0;
	double Soma_Ano_Salario = 0;
	double slope;
	double intercept;
	
// Função de Cálculo Regressão Linear		
	public void calculo(double [] x, double [] y){
				
		for( i = 0; i<x.length; i++ ){
			
			Soma_Ano += Math.pow((x[i] - mediaAno(x)), 2);
			
		}
		
		ano = Soma_Ano/(i-1);
				
		for( i = 0 ; i<x.length; i++ ){
			
			Soma_Ano_Salario +=( (y[i]-mediaSalario(y)) * (x[i]-mediaAno(x)));
				
		}
		
		anosalario = Soma_Ano_Salario/(i-1);	
		
		slope = anosalario/ano;
		
		intercept = mediaSalario(y) - (slope*mediaAno(x));
				
	}
			
// Função Média Ano
	public double mediaAno(double [] x){
		
		double soma = 0;
		double media_Ano = 0;
		int i;
		
		for( i =0 ; i<x.length ;i++ ){
			
			soma += x[i];					
		}
		
		media_Ano = soma/(i);
		
		return media_Ano;
	}
	
//Função Média Salário
	public double  mediaSalario(double [] y) {
			
		double soma = 0;
		double media_Salario = 0;
		int i;
		
		for( i =0 ; i<y.length; i++ ){
			
			soma += y[i];					
		}
	
		media_Salario = soma/(i);
		
		return media_Salario;
		
	}

	public double getslope() {
		return slope;
	}

	public double getintercept() {
		return intercept;
	}

// Função Predição
	public double predicao(double x){
		double y  = 0;
		
		y = (getslope()*x)  + getintercept();
		
		return y;
	}

}
		 

