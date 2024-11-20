public class Q5 {
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

            for (int i = 1; i <= nombreEtoiles; i++) 
            {
                for (int j = 0; j < i; j++)
                  {
                    System.out.print("*");
                }
                System.out.println(); 
            }
        } catch (NumberFormatException e) {
            System.out.println("Veuillez entrer un nombre entier valide.");
        }
    }
}
