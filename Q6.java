public class Q6 {
    public static void main(String[] args) 
  {
        if (args.length != 1) 
        {
            System.out.println("Mettre un nombre d'étoile");
            return;
        }

        try {
            int nombreEtoiles = Integer.parseInt(args[0]);

            if (nombreEtoiles < 0) {
                System.out.println("Veuillez entrer un nombre positif.");
                return;
            }
            //oulalala jai changer wowowo
            for (int i = 1; i <= nombreEtoiles; i++) 
            {
                for (int j = i; j > 0; j--)
                  {
                    System.out.print("x");
                }
                System.out.println(); 
            }
        } catch (NumberFormatException e) {
            System.out.println("Veuillez entrer un nombre entier valide.");
        }
    }
}
