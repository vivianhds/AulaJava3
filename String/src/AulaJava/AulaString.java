package AulaJava;

public class AulaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Isto � uma String do Java";
		String xyz = new String ("Isto � uma string do java");
		if ( str == xyz) System.out.println ("Igual");
		else System.out.println("Diferente");

		if (str.equals (xyz) ) {
			//MANEIRA CORRETA DE SE COMPARAR OS CONTE�DOS DA STRING
		}
	System.out.println( "Tamanho da String: " + str.length() );
	System.out.println("SubString: " + str.substring(0, 10) );
	System.out.println("Caracter na posi��o 5 : " + str.charAt(5) );
	
	}
	

}

