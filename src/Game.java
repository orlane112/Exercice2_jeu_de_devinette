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
}
