package NewSale;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class FoodMain {
    public static void main(String[] args) {
        ArrayList<FoodRecipe> foodRecipes = new ArrayList<>();
        fillTheList(foodRecipes);

        // Вычисляем среднее время приготовления для рецептов с "капустой"
        double middleTime = foodRecipes.stream()
                .filter(foodRecipe -> foodRecipe.getMain().equalsIgnoreCase("Капуста"))  // Фильтруем по ингредиенту "капуста"
                .mapToDouble(FoodRecipe::getTime)                                        // Преобразуем в DoubleStream
                .average()                                                               // Вычисляем среднее значение
                .orElse(0.0);                                                            // Если список пуст, возвращаем 0.0


        // Создаем формат для округления до двух знаков после запятой
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Среднее время приготовления для рецептов с капустой: " + df.format(middleTime) + " минут");
    }

    // Метод для заполнения списка рецептов
    static void fillTheList(ArrayList<FoodRecipe> foodRecipes) {
        foodRecipes.add(new FoodRecipe("Масло", "Томат", "Мясо", "Сметана", 89.03));
        foodRecipes.add(new FoodRecipe("Масло", "Томат", "Капуста", "Сметана", 80.12));
        foodRecipes.add(new FoodRecipe("Масло", "Томат", "Капуста", "Сметана", 45.01));
        foodRecipes.add(new FoodRecipe("Масло", "Томат", "Мясо", "Сметана", 30.22));
        foodRecipes.add(new FoodRecipe("Масло", "Томат", "Мясо", "Сметана", 17.45));
        foodRecipes.add(new FoodRecipe("Масло", "Томат", "Капуста", "Сметана", 19.11));
    }
}
