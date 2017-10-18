import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Repertoire extends Composant
{
     public List l = new LinkedList();
    
    public Repertoire(String nom)
    {
        this.setNom(nom);
       
    }
    
    public boolean contient(Composant c) 
    {
        ListIterator<Composant> listIterator = l.listIterator();
        Composant tmp;
        
        while(listIterator.hasNext()) {
            tmp = listIterator.next();
            
            if(tmp.equals(c)){
                return true;
            }
            else if(tmp instanceof Repertoire) {
                 if(((Repertoire) tmp).contient(c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean ajouter(Composant c)
    {
        if(this.contient(c)) {
            return false;
        }
        else if((c instanceof Repertoire) && (((Repertoire) c).contient(this))) {
            return false;
        }
        else {
            return l.add(c);
        }
    }
    
    public boolean retirer(Composant c)
    {
        return l.remove(c);
    }
    
    public int getTaille()
    {
        ListIterator<Composant> listIterator = l.listIterator();
        int somme = 0;
        while(listIterator.hasNext()) {
            somme += listIterator.next().getTaille(); 
        }
        return somme;
    }
}