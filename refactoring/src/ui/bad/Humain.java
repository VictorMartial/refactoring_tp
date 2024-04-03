package ui.bad;

public class Humain {
	private String nom ;
	private String prenom;
	private int age;
	
	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void details() {
		System.out.print("details "+ nom + " " +prenom + " " +age);
	}
	@Override
	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	public void ami(Humain humm) {System.out.print(this.nom + " " +this.prenom+ "est amis avec "+humm.nom +" "+humm.prenom );}
}
