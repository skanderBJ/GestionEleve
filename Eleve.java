package Eleve;

import java.util.ArrayList;

public class Eleve {

    String nom ;
   ArrayList<Integer > Listenotes = new ArrayList<Integer>() ;
   double moyenne ; 
   
   
   public Eleve (String pnom  ) {
	   this.nom=pnom ;
   }
   public double getmoyenne() {
	   return this.moyenne ; 
   }
   public String getNom () {
	   return this.nom ; 
   }
   public ArrayList<Integer> getListenotes() {
	   return this.Listenotes ;
   }
   public void Ajouter(int note)
   {
	   int nbNotes=this.Listenotes.
			   size() ;
	   if (note<0)
		note =0 ; 
	   else if (note>20)
		   note =20;
	   this.moyenne=(this.moyenne * nbNotes +note )/ (nbNotes+1 )  ;
	   Listenotes.add(note) ; 
   }
   public String toString () {
	   return (this.nom+"("+this.moyenne +")") ;
   }

}
