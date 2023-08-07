package HeadFitst.SiteGame;

public class SimpleDotComeTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

//        int numOfGuesses = 0;
//        GameHelper helper = new GameHelper();
//        SimpleDotCom theDotCom = new SimpleDotCom();
//        int randoNum = (int) (Math.random() * 5);
//        int[] locations = {randoNum, randoNum+1, randoNum+2};
//        theDotCom.setLocationCells(locations);
//        boolean isAlive = true;
//        while (isAlive == true) {
//            String guess = helper.getUserInput("Введите число");
//            String result = theDotCom.checkYourself(guess);
//            numOfGuesses++;
//            if (result.equals("Потопил"));
//            isAlive = false;
//            System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
//        }

    }
}
