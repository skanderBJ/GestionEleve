package Eleve;

import java.util.ArrayList;

public class GroupeEleve {

	private ArrayList<Eleve> ListeEleves = new ArrayList<Eleve>();

	public int nombre() {
		return this.ListeEleves.size();
	}

	public ArrayList<Eleve> getListeEleve() {
		return this.ListeEleves;
	}

	public void AjouteEleve(Eleve eleve) {

		ListeEleves.add(eleve);
	}

	public Eleve chercher(String nom) {
		for (Eleve eleve : ListeEleves)
			if (eleve.getNom().equals(nom))
				return eleve;
		return null;

	}
	public void Lister() {
		System.out.println("la Liste eleves : ");
		for (Eleve eleve : ListeEleves)
			System.out.println(eleve);
	}

}
