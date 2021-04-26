    import java.util.ArrayList;

    public class Ecurie {
        //attributs
        private ChevalPers[] chevaux;
        private ArrayList<ChevalPers>pre;

        // constuctor

        public Ecurie(int tailleEcurie){


            chevaux = new ChevalPers[tailleEcurie];
            pre = new ArrayList<>();
        }




        //Methodes

        public void afficher()// mettre une boucle for pour pacourir le tableau chevaux
        {
            for (int i = 0; i < chevaux.length; i++) {
                System.out.println("Numb Box :"+ i);
                if (chevaux[i] != null) {
                    chevaux[i].afficher();
                }
                else{
                    System.out.println("Le box est vide");
                }
            }
        }

        public void ajouterUnCheval( int indice, ChevalPers cheval){// ajoute un cheval dans la box
            if(this.chevaux.length-1 <indice || indice < 0) {
                System.out.println("Ce box n'existe pas");
            }
            else if (this.chevaux[indice] != null) {
                System.out.println("Ce box est déja occupé ");
            }
            else {
                this.chevaux[indice] = cheval;
                System.out.println("Le cheval est bien rentré dans le box");
            }
        }

        public void retirerCheval(int indice){
            if(chevaux.length-1 < indice || indice < 0) {
                System.out.println("Ce box n'existe pas.");
            }
            else if(chevaux[indice] != null) {
                chevaux[indice] = null;
                System.out.println("le cheval a ete retirer ");
            }
            else {
                System.out.println(" le box est deja vide");
            }
        }

        public void mettreAuPre(ChevalPers cheval){
            if (pre.contains(cheval)){
                System.out.println("ce cheval est déja au pré");

            }else{
                int indice = numBox(cheval);
                if (indice != -1) {
                    retirerCheval(indice);
                }
                pre.add(cheval);
                System.out.println("Ce cheval " + cheval.getPrenom() + " est sorti au  pré.");
            }
        }


        private int numBox(ChevalPers cheval){
            for (int i = 0; i < chevaux.length; i++){
                if (chevaux[i] == cheval){
                    return i;
                }
            }

        return -1;


        }
    }



