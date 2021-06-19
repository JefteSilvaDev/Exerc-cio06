

public class DadosPessoais  { 
		
		private String nome;
		private int data_nasc;
		private double altura;
		
		public String getNome() {
			return nome;        
			}
		public void setNome(String nome){
			this.nome = nome;
			}
		public int getData_nasc(){
			return data_nasc;
				}        
		public void setData_nasc(int data_nasc){
			this.data_nasc = data_nasc;
			}        
		public double getAltura(){
			return altura;
			} 
       public void setAltura(double altura){
    	   this.altura = altura;
    	   }          
		
	public static void main(String[] args){
		DadosPessoais pessoa1 = new DadosPessoais ();
		pessoa1.setNome("Jefte");
		pessoa1.setData_nasc(1988);
		pessoa1.setAltura(1.72);
		System.out.println( pessoa1.getNome() );
		System.out.println( pessoa1.getData_nasc()  );
		System.out.println( pessoa1.getAltura()  );
		System.out.println("a idade da pessoa é " + (2021-1993)  );
	}	
} 
