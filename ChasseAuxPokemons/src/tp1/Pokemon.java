package tp1;

public class Pokemon {
	private String nom;
	private String type; 
	private int niveau;
	private Boolean diurne = true;
	private String nomDonne;//renomer le pokemon
	private Joueur monJoueur;
	
	//Constructeur
	public Pokemon(String monNom,String montype,int monNiveau, Boolean typeDiurne){
		this.nom = monNom;
		this.type = montype;
		this.niveau = monNiveau;
		this.diurne = typeDiurne;
		this.nomDonne=null;
		this.monJoueur=null;
	}
	
	//Constructeur Pokemon une fois Capture
	public Pokemon(String monNom,String montype,int monNiveau, Boolean typeDiurne, String monNomDonne, Joueur monJoueur ){

		this.nom = monNom;
		this.type = montype;
		this.niveau = monNiveau;
		this.diurne = typeDiurne;
		this.nomDonne = monNomDonne;
		this.monJoueur = monJoueur;
	}
	//Getters and setters
		public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public int getNiveau() {
	        return niveau;
	    }

	    public void setNiveau(int niveau) {
	        this.niveau = niveau;
	    }

	    public Boolean getDiurne() {
	        return diurne;
	    }

	    public void setDiurne(Boolean diurne) {
	        this.diurne = diurne;
	    }

	    public String getNomDonne() {
	        return nomDonne;
	    }

	    public void setNomDonne(String nomDonne) {
	        this.nomDonne = nomDonne;
	    }

	    public String getMonJoueur() {
	        return monJoueur;
	    }

	    public void setMonJoueur(String monJoueur) {
	        this.monJoueur = monJoueur;
	    }

	//Methode toString
	public String toString(){
		/*String etat;
		if(diurne){
			etat = "diurne";
		}
		else{
			etat = "nocturne";
		}*/
		//Si le pokemon a un maitre et si nomDonee n est pas mis a null
		//Si le pokemon a un maitre mais nomDonee est mis a null
		//Si le pokemon n a pas de maitre
		if (this.nomDonne==null && this.monJoueur==null)
			return(this.nom + " est un pokemon de type " + this.type + " et de niveau " + this.niveau + "Ce pokemon n\' pas encore de maitre ");
		if (this.nomDonne != null && this.monJoueur != null)
			return(this.nomDonne+"est un pokemon de genre"+this.nom + "  du type " + this.type + " qui a de niveau " + this.niveau + " Ce pokemon appartient a "+ this.monJoueur);
		//
		return("Voici un Pokemon du genre " + this.nom + "du type "+ this.type + " qui a le niveau " + this.niveau + "Ce Pokemon appartient a " +  this.monJoueur);
	}
	
	//methode dire bonjour
	public void direBonjour(String periode){
		if (periode.equals("jour"))
			if(this.diurne){
				System.out.println(this.nom + " dit bonjour !");
			}
			else{
				System.out.println("zzZZ !");
			}
		else{
			if(!this.diurne){
				System.out.println(this.nom + " dit bonjour !");
			}
			else{
				System.out.println("zzZZ !");
			}		
		}
	}
	
}