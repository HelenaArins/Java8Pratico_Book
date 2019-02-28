package cap3;

public class Cap3Main {

	public static void main(String[] args) {	
		Validador<String> validadorCEP = valor-> valor.matches("[0-9]{5}-[0-9]{3}");
		System.out.println("Este email é : "+ validadorCEP.valida("03326-032") );	
		
		
		
		
//		System.out.println("Este email é : ");
//		validaEmail email
	}
}
