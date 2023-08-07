package HeadFitst.SiteGame;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    public void setLocationCells (int[] locs) {
        locationCells = locs;
    }

    public String checkYourself (String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result  = "Мимо";
        for (int cell : locationCells ) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return  result;

    }

    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randoNum = (int) (Math.random() * 5);
        int[] locations = {randoNum, randoNum+1, randoNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил"));
            isAlive = false;
            System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
        }
    }



}
