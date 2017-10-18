public class Main{
	public static void main(String[] args)
	{
		Fichier F1 = new Fichier("f1",1);
		Fichier F2 = new Fichier("f2",2);
		
		Repertoire R1 = new Repertoire("azerty");
		
		R1.ajouter(F1);
		R1.ajouter(F2);
		
		System.out.println(R1.getTaille());
	}
}