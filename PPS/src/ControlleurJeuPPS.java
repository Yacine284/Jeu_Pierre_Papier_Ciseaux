import java.util.Random;

public class ControlleurJeuPPS implements ControlleurJeu {

    private OptionJeu userChoice = OptionJeu.EMPTY;
    private OptionJeu machineChoice = OptionJeu.EMPTY;
    private Score totalScore = new Score();


    @Override
    public String welcomeMessage() {

        return " *************************************************\n"+
        	   "           BienVenue AU          \n"+
               "    JEU PIERRES PAPIERS CISEAUX    \n"+
               "  *************************************************    \n";
    }

    @Override
    public String pleaseEnterOptionMessage(){
        return  "         S'il Vous Plait entrez:         \n"+
                "            1. PIERRE            \n"+
                "            2. PAPIER           \n"+
                "            3. CISEAU         \n"+
                "  ------------------------------------- \n";
    }

    @Override
    public void selectUserChoice(OptionJeu userOption) {
        this.userChoice = userOption;
    }

    @Override
    public OptionJeu randomMachineChoice() {
        int randomNumberBetween1to3 = new Random().nextInt(3)+1;
        OptionJeu machineOption = OptionJeu.valueOf(randomNumberBetween1to3);
        this.machineChoice = machineOption;
        return machineOption;
    }

    @Override
    public Joueur calculateResult() {

        totalScore.incrementTotalNumberGames();

        if(machineChoice.equals(userChoice)){
            return Joueur.EGALITE;
        }
        if(machineChoice.isWinBy(userChoice)){
            totalScore.incrementGamesWonByUser();
            return Joueur.VOUS;
        }
        return Joueur.MACHINE;
    }

    @Override
    public Score getResults() {
        return totalScore;
    }

}
