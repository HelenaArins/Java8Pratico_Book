package cap3;

import java.util.function.Consumer;

import java8_book.Usuario;

public class ValidaEmail implements Validador<String>, Consumer<Usuario> {

	@Override
	public boolean valida(String email) {
		return email.matches("\\w+@+\\w+\\.+\\w");		
	}

	@Override
	public void accept(Usuario usuario) {
		System.out.format("O email de %s é %s \n", usuario.getName(), valida(usuario.getEmail()));		
	}
}
