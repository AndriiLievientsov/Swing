package SmallTest;

public class ForFood {
    public static void main(String[] args) {
        FoodProduct foodOne = new FoodProduct("Пэрсык", 50.35F, 4, 110, 15);
        FoodProduct foodTwo = new FoodProduct("Мьяско", 812.4F, 44, 580,4);

        foodOne.foodType();
        foodTwo.foodType();

    }
}
