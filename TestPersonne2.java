package Atelier1java;

public class TestPersonne2 {
    
        public static void main(String[] args) { 
        Personne p1=new Personne("Marie",20);
        Personne p2=new Etudiant("Machin",26,"20202134");
        Personne p3=new Enseignant("Toto",34,2000,192);
        Etudiant p4=new Etudiant("Jean", 21,"20203433");
        Enseignant p5= new Enseignant("Pierre",54,3000,250);
        p4=(Etudiant) p2;
        //p5=(Enseignant) p1;//p1 est une instance de Personne (Enseignant!=)
        ((Etudiant) p2).setNumEtu("20205784");
        p4.setNumEtu("20205785");
        //((Etudiant) p3).setNumEtu("20205786");//p3 est une instance de Enseignant
    
}
}
