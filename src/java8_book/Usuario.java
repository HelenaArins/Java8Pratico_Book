package java8_book;

public class Usuario {

	private String name;
	private int pontos;
	private boolean moderador;
	private String email;
	
	public Usuario(String name, int pontos, String email) {
		this.name = name;
		this.pontos = pontos;
		this.moderador = false;
		this.email = email;
	}
	
	
	
	
	public void setEmail(String email) {
		this.email = email;
	}




	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public int getPontos() {
		return pontos;
	}


	public boolean isModerador() {
		return moderador;
	}

	public void tornaModeraro() {
		this.moderador = true;
	}
	
	

}
