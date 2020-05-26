
public class Exec {
    public static void main(String[] args){
        Etudiant etu = new Etudiant("Dupont","Alice",21);
        etu.ajouterNote(18);
        etu.ajouterNote(48);
        
        etu.afficherNotes();
        //3. en utilisant ajouterNotes on risque de depasser la taille du tableau/on ne sais pas la taille des nombres. Pour le resoudre on peut faire un vecteur ou tableau dynamique
        
    }
}
