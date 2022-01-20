package Eleve;

public class TestGroupEleve {

	public static void main(String[] args) {
		
		Eleve eleve  ; 
		GroupeEleve eleves = new GroupeEleve() ; 
		
		eleve = new Eleve("Skander") ;
        eleve.Ajouter(17);
        eleve.Ajouter(15);
        eleves.AjouteEleve(eleve);
        
        eleve= new Eleve("moetz") ; 
        eleve.Ajouter(18);
        eleves.AjouteEleve(eleve);
        eleves.Lister();
        
        eleve = eleves.chercher("Skander") ;
        if (eleve != null )
        	System.out.println("Voila Laurent :  " + eleves.chercher("Laurent"));
        	else System.out.println("Laurent n'est pas dans la liste");
		eleve = eleves.chercher("Marie");
		if (eleve != null) 
			System.out.println("Voila Marie : " +  eleves.chercher("moetez"));
		else System.out.println("Marie n'est pas dans la liste");

	}

}
