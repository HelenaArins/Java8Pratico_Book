package java8_book;

import java.util.Arrays;
import java.util.List;

import cap3.ValidaEmail;

public class Cap2 {
	public static void main(String[] args) {
		Usuario user1 = new Usuario("Fulano de Tal", 10, "aiauhsdfuia@isahfa.com");
		Usuario user2 = new Usuario("Ciclano de Tal", 15, "232@isofjdsa.ocm");
		Usuario user3 = new Usuario("Beltrano de AA", 22, "");
		
		List<Usuario>  usuarios = Arrays.asList(user1, user2, user3);
		
		System.out.println("Forma Classica:");
		for(Usuario u: usuarios)
			System.out.println(u.getName());
		
		System.out.println("Lambda:");
		usuarios.forEach(u->System.out.println(u.getName()));
//		-----IGNORE =D
		usuarios.forEach(u->u.tornaModeraro());
		
		usuarios.forEach(u->{
			System.out.println(u.getName() + " é " + u.isModerador());
//			System.out.println("   é  ");
//			System.out.println(u.isModerador());

			}
		);
		usuarios.forEach(new ValidaEmail());
		
		System.out.println("\n\n\n");
		Runnable o = () -> {
			System.out.println("O que sou eu? Que lambda?");
		};
		System.out.println(o);
		System.out.println(o.getClass());
		
		
	}
	
}
