public enum OptionJeu {
    PIERRE(1,2), PAPIER(2,3), CISEAUX(3,1),EMPTY(-1,-1);
    
    private int id;
    private int winBy;

    OptionJeu(int id, int winBy){

        this.id = id;
        this.winBy = winBy;
    }

    public static OptionJeu valueOf(int userEnteredOption){
        for(OptionJeu option: OptionJeu.values()){
            if(userEnteredOption ==option.id){
                return option;
            }
        }
        return EMPTY;
    }

    public boolean isWinBy(OptionJeu option){
        return this.winBy == option.id;
    }
}