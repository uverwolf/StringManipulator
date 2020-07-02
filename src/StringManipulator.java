
public class StringManipulator {
	 
	public String eliminarEspacios(String a, String b) {
		String aN= a.trim();	
		String bN= b.trim();
		String union = aN.concat(bN);
		
		return union ;
	}
	
	public Integer indice(String texto,String a) {
		int resultado =  texto.indexOf(a);
		if (resultado>0) {
			return resultado;
		}else {
			return null;
		}
		
	}
	public String concatenarString(String texto1,int num1,int num2,String texto2) {
		String output = texto1.substring(num1,num2).concat(texto2);
		
		
		return output;
	}

}
