public class MonProgramme {

    public static void main(String[] args) {

         // Création d'un objet nommé monObjet\\
         monObjet monObjet = new monObjet();
         o1 o1 = new o1();
         o2 o2 = new o2();

         // appeller la méthode affichageObjet \\
         AfficheObjet();

          //appeller la méthode m()\\
          o1.m();
          
          o2.m().AfficheObjet();
    }


}

