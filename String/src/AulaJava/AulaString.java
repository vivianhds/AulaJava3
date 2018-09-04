package AulaJava;

public class AulaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Isto é uma String do Java";
		String xyz = new String ("Isto é uma string do java");
		if ( str == xyz) System.out.println ("Igual");
		else System.out.println("Diferente");

		if (str.equals (xyz) ) {
			//MANEIRA CORRETA DE SE COMPARAR OS CONTEÚDOS DA STRING
		}
	System.out.println( "Tamanho da String: " + str.length() );
	System.out.println("SubString: " + str.substring(0, 10) );
	System.out.println("Caracter na posição 5 : " + str.charAt(5) );
	
	}
	

}

