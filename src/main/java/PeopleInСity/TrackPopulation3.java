package PeopleInСity;

public class TrackPopulation3 {

    public static void main(String[] args) {
        City smackkoverAr = new City();
        smackkoverAr.population = 2232;
        smackkoverAr = doBirth(smackkoverAr);
        System.out.println(smackkoverAr.population);
    }


     static City doBirth (City aCity) {
        City myCity = new City();
        myCity.population = aCity.population + 1;
        return myCity;
     }


}
