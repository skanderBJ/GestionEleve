package Eleve;

public class TestEleve {

	public static void main(String[] args) {
		
		Eleve eleve =new Eleve(args[0]) ;
		for (int i=1 ;i<args.length ; i++) {
			eleve.Ajouter(Integer.parseInt(args[i])) ;
			System.out.println(eleve.toString());
			
		}
				

	}

}
