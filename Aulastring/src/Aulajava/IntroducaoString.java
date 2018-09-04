package Aulajava;

public class IntroducaoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Olá Isto é uma string do Java";
		String[] palavras = str.split(" ");
		
		int i =  str.indexOf("uma");
		
		if (str.startsWith("Olá")  || str.endsWith("Mundo") ) {
			System.out.println("Isto é uma string do Java" );
			}
		
		str = str.trim(); 		
		str = str.replace('a', '@'); 		
		str = str.replaceAll("String", "Cadeia de caracteres");
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(palavras); 

	}

}
