
public class Exec {
    public static void main(String[] args){
        Etudiant etu = new Etudiant("Dupont","Alice",21);
       // etu.ajouterNote(18);
       // etu.ajouterNote(48);
        
        
        try {
        	etu.ajouterNote(12); 
        	etu.ajouterNote(9); 
        	etu.ajouterNote(7); 
        	etu.ajouterNote(19);
        } 
        catch (ErreurNotes e){ 
        	System.out.println(e.recuperMessageErreur()); 
        }
        
        etu.afficherNotes();
        //3. en utilisant ajouterNotes on risque de depasser la taille du tableau/on ne sais pas la taille des nombres. Pour le resoudre on peut faire un vecteur ou tableau dynamique
        //exo 2 q2 appel a erreurNote si une note n'est pas correcte, ici rien ?
    }

}
