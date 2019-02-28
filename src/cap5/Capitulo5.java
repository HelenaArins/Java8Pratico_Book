package cap5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8_book.Usuario;

public class Capitulo5 {
	
	public static void main(String[] args) {
		Usuario user1 = new Usuario("Fulano de Tal", 10, "aiauhsdfuia@isahfa.com");
		Usuario user2 = new Usuario("Ciclano de Tal", 15, "232@isofjdsa.ocm");
		Usuario user3 = new Usuario("Beltrano de AA", 22, "");
		
		List<Usuario>  usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		
		//Pela Maneira Antiga:
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			public int compare(Usuario u1, Usuario u2) {
				return u1.getName().compareTo(u2.getName());
			}
		};
		Collections.sort(usuarios, comparator);
		
		//Pelo Java 8:
		usuarios.sort( (u1, u2)-> u1.getName().compareTo(u2.getName()));
		
		usuarios.sort(Comparator.comparing(u -> u.getName()));
	}
	
}
