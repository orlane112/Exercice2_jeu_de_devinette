import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        // Création du lecteur pour l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Génération d'un nombre entre 1 et 100
        int nombreSecret = (int) (Math.random() * 100) + 1;

        int essaisRestants = 10;
        boolean aGagne = false;
        System.out.println("Bienvenue ! Devine le nombre entre 1 et 100.");

        //On utilise une boucle while qui tourne tant qu'on n'a pas gagné et qu'il reste des essais
        while (essaisRestants > 0 && !aGagne) {
            System.out.print("Il te reste " + essaisRestants + " essais. Ton choix : ");
            int proposition = scanner.nextInt();
            essaisRestants--; // On utilise un essai

            if (proposition == nombreSecret) {
                aGagne = true;
            } else if (proposition < nombreSecret) {
                System.out.println("C'est PLUS !");
            } else {
                System.out.println("C'est MOINS !");
            }
        }

    }
