    public class Main {
        public static void main(String[] args) {
             ChevalPers spirit = new ChevalPers(12,90,100,"Spirit","noir",true);
            spirit.afficher();

            ChevalPers john = new ChevalPers(10,2,100,"John","Brun",false);
           john.afficher();

            ChevalPers carole = new ChevalPers(4,40,100,"Carole","blanc",true);
            carole.afficher();
    //        ChevalPers[] chevalPers = new ChevalPers[2];
    //        for (int i = 0; i < ChevalPers.length; i++) {
    //            chevalPers[i].afficher();
           //}

            //ajouter dans le tableau

            Ecurie speed = new Ecurie(4);
              speed.ajouterUnCheval(0,carole);
              speed.ajouterUnCheval(1,john);
              speed.ajouterUnCheval(3,spirit);
              //affiche cheval rajouter au pré
              speed.mettreAuPre(carole);
              // affiche cheval dans les box
              speed.afficher();




            }
        }

