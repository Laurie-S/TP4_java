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
    
    public void ajouterNote ( int note ) {
        if(note >= 0 && note <= 20){
            notes [ nbNotes ] = note ;
            nbNotes ++;
        }
        else{ System .out . println("note "+note+" non valide\n");}
    }
    
    public void afficherNotes (){
        for (int i = 0; i < nbNotes ; i++){
            System .out . print ( notes [i] + "\t");
        }
        System .out . println ();
    }
}

