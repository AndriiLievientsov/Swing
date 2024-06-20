package PlaceToLive;

public class DisplayThePlaces {
    public static void main(String[] args) {
        Apartment apartment = new Apartment();
        House house = new House();

        apartment.setMonthlyRent(15);

        house.setMonthlyRent(27);
        house.setYearRent(154);

        System.out.println("Общая стоимость квадратного метра Дома: " + house.rentbill(44));
        System.out.println("Сколько стоит в месяц Дом пожить: " + house.getMonthlyRent());
        System.out.println("Сколько стоит в год Дом пожить: " + house.getYearRent() + "\n");

        System.out.println("Общая стоимость квадратного метра Апартаментов: " + apartment.houseRentbill(311));
        System.out.println("Сколько стоит в месяц Апартаменты пожить: " + apartment.getMonthlyRent());



    }
}
