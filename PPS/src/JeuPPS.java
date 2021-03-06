
import java.util.Scanner;

public class JeuPPS {

    public static void main(String[] args){

        ControlleurJeu gameController = new ControlleurJeuPPS();

        Scanner scanner = new Scanner(System.in);
        String userWantsToExit;

        System.out.print(gameController.welcomeMessage());

        do {
            System.out.println(gameController.pleaseEnterOptionMessage());

            int userOptionRaw = scanner.nextInt();

            OptionJeu userOption = OptionJeu.valueOf(userOptionRaw);

            gameController.selectUserChoice(userOption);

            OptionJeu machineChoice = gameController.randomMachineChoice();

            Joueur winner = gameController.calculateResult();

            Score score = gameController.getResults();

            System.out.printf("vous avez jou?: %s & la machine a jou?: %s \n", userOption.name(), machineChoice.name());
            if (Joueur.VOUS.equals(winner)) {
                System.out.println("Vous avez gagner!!");
            }
            if(Joueur.EGALITE.equals(winner)){
                System.out.println("Egalit?!!");
            }
            if(Joueur.MACHINE.equals(winner)){
                System.out.println("Vous avez perdu!!");
            }
            System.out.printf("Vous avez gagnez %d parties Sur  %d  partie\n", score.getGamesWonByUser(), score.totalNumberOfGames());

            System.out.println("Voulez vous Continuer(O=Oui, N=Non)?");
            userWantsToExit = scanner.next();

        }while(userWantsToExit.toUpperCase().equals("O"));


    }
}
