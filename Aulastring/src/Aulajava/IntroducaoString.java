package Aulajava;

public class IntroducaoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ol� Isto � uma string do Java";
		String[] palavras = str.split(" ");
		
		int i =  str.indexOf("uma");
		
		if (str.startsWith("Ol�")  || str.endsWith("Mundo") ) {
			System.out.println("Isto � uma string do Java" );
			}
		
		str = str.trim(); 		
		str = str.replace('a', '@'); 		
		str = str.replaceAll("String", "Cadeia de caracteres");
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(palavras); 

	}

}
