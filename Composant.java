/**
 * Classe mère donc va heriter un repertoire et un fichier, ne peut etre instaciée
 */
public abstract class Composant
{
    private String nom;
    
    abstract int getTaille();
    
    public String getNom(){ 
		return nom;
	}
    
    public void setNom(String nom){ 
		this.nom = nom; 
	}
    
}