
public class StringManipulatorTest {
	public static void main(String[] args) {
		//Trim()
		System.out.println("Trim\n");
		StringManipulator texto1 = new StringManipulator();		
		String resultado=  texto1.eliminarEspacios("  Holaaa  ", " Compadrito");		
		System.out.println(resultado);
		System.out.println("--------------\n");
		
		//IndexOfNull
		System.out.println("IndexOfNull");
		StringManipulator texto2 = new StringManipulator();
		String letter = "n";
		Integer a = texto2.indice("Coding",letter);
		Integer b = texto2.indice("Hola mundo",letter);
		Integer c = texto2.indice("saludar",letter);		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("--------------\n");
		
		//IndexOfNull con dos String
		System.out.println("indexOfNull 2");
		StringManipulator texto3 = new StringManipulator();
		String palabra="Hola";
		String subPalabra="la";
		String noSubPalabra= "mundo"; 
		
		Integer an= texto3.indice(palabra, subPalabra);
		Integer bn= texto3.indice(palabra, noSubPalabra);
		System.out.println(an);
		System.out.println(bn);
		System.out.println("--------------");
		
		//concatSubString
		System.out.println("concatSubString\n");
		StringManipulator texto4= new StringManipulator();
		String palabra2= texto4.concatenarString("Hola", 1, 2, "mundo");
		System.out.println(palabra2);
	}
}
