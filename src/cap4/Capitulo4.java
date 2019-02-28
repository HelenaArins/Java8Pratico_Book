package cap4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java8_book.Usuario;

public class Capitulo4 {
	public static void main(String[] args) {
		
		
		Predicate<Usuario> predicado = new Predicate<Usuario>() {
			public boolean test(Usuario u) {
				return u.getPontos()>160;
			}
		};
		
		Usuario user1 = new Usuario("Fulano de Tal", 10, "aiauhsdfuia@isahfa.com");
		Usuario user2 = new Usuario("Ciclano de Tal", 15, "232@isofjdsa.ocm");
		Usuario user3 = new Usuario("Beltrano de AA", 22, "");
		
		List<Usuario>  usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);

//		usuarios.removeIf(predicado);  //--Usando variavel
		usuarios.removeIf(u->u.getPontos()>20);
		usuarios.forEach(u->System.out.println(u));
	}

}
