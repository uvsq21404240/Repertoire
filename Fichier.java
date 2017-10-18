public class Fichier extends Composant
{
    private int taille;

    public Fichier(String nom, int taille){
        this.setNom(nom);
        if (taille > 0)
			this.taille = taille;
		else
			this.taille = 0;
    }

    public int getTaille(){
        return taille;
    }
}