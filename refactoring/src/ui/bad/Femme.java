package ui.bad;

public class Femme extends Humain{

	public Femme(String nom, String prenom, int age) {
		super( nom, prenom,  age);
		
	}
	public static void main(String[] args) {
		Femme f =new Femme("bao","mena",12);
		Homme h=new Homme("victor", "Martial",23 );
	}
	
}
