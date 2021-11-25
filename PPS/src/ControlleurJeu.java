public interface ControlleurJeu {

    String welcomeMessage();

    String pleaseEnterOptionMessage();

    void selectUserChoice(OptionJeu userOption);

    OptionJeu randomMachineChoice();

    Joueur calculateResult();

    Score getResults();

}