package HeadFitst.SiteGame;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    public void setLocationCells (int[] locs) {
        locationCells = locs;
    }

    public String checkYourself (String stringGess) {
        int guess = Integer.parseInt(stringGess);
        String result  = "Мимо-1";
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

}
