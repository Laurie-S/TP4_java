
public class Etudiant {
    private String nom ;
    private String prenom ;
    private int age ;
    private int [] notes ; // Tableau devant contenir toutes les notes
    private int nbMatieres = 3; // Nombre maximum de matières
    private int nbNotes ; // Nombre de notes déjà saisies
    
    public Etudiant ( String nom , String prenom , int age){
        this . nom = nom ;
        this . prenom = prenom ;
        this . age = age ;
        notes = new int [ nbMatieres ];
        nbNotes = 0;
    }
    
  //Exo 2 q1 a l'execution de ajouterNote on appel le gestionnaier d'erreur de erreurNote
    
    public void ajouterNote(int note) throws ErreurNotes{ 
    	if ( (nbNotes >= nbMatieres) || ( note < 0 || note > 20) ) throw new 
    		ErreurNotes(); 
    	notes[nbNotes] = note; 
    	nbNotes++; 
    }
    
    public void afficherNotes (){
        for (int i = 0; i < nbNotes ; i++){
            System .out . print ( notes [i] + "\t");
        }
        System .out . println ();
    }

}
