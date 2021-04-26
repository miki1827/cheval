    import java.sql.SQLOutput;

    public class ChevalPers {

        private int age;
        private int ptsVie;
        private int ptsVieMax;
        private String prenom;
        private boolean femelle;
        private String couleur;

       public ChevalPers(){
            age = 0;
            ptsVie = 100;
            ptsVieMax = 100;
            prenom = "jumanji";
            femelle = true;
            couleur = "brun";
    }

        public ChevalPers(int age, int ptsVie, int ptsVieMax , String prenom, String couleur, boolean femelle ){

        this.age = age;
        this.ptsVie = ptsVie;
        this.ptsVieMax = ptsVieMax ;
        this.prenom = prenom;
        this.femelle = femelle;
        this.couleur = couleur;

        }
        //Methodes
        public void afficher(){
            System.out.println(prenom + "");
            System.out.println("Age:"+ age);
            System.out.println("Couleur:" + couleur);
            System.out.println("Points de vie : "+ ptsVie);
            System.out.println("Points de vie max " + ptsVieMax);
            if ( femelle ){
                System.out.println("Femelle");
            }
            else {
                System.out.println("Male");
            }

        }

        public  int getAge(){
         return age;
        }

        public void setAge(int age){
        if (age < 0){
            System.out.println("!!age < 0 ");
        }
         else{
             this.age = age ;
         }
    }

        public String getPrenom() {
            return prenom;
        }
    }
