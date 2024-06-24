package PlaceToLive;

public class DisplayThePlaces extends ApartmentWithFees {
    public static void main(String[] args) {
        Apartment apartment = new Apartment();
        apartment.setMonthlyRent(15);

        House house = new House();
        house.setMonthlyRent(27);
        house.setYearRent(154);

        ApartmentWithFees apartmentWithFees = new ApartmentWithFees();
        apartmentWithFees.setAddress("Калмыкова 15");
        apartmentWithFees.setRooms(12);

        System.out.println("Общая стоимость квадратного метра Дома: " + house.rentbill(44));
        System.out.println("Сколько стоит в месяц Дом пожить: " + house.getMonthlyRent());
        System.out.println("Сколько стоит в год Дом пожить: " + house.getYearRent() + "\n");

        System.out.println("Общая стоимость квадратного метра Апартаментов: " + apartment.houseRentbill(311));
        System.out.println("Сколько стоит в месяц Апартаменты пожить: " + apartment.getMonthlyRent() + "\n");

        System.out.println("Еще одна Хатка: и в ней комнта " + apartmentWithFees.getRooms());


        System.out.println("--------------");
        System.out.println("Квартальная плата в Доме: " + apartmentWithFees.houseRentbill(7.5));
        System.out.println("Квартальная плата в Апартаменты: " + apartmentWithFees.houseRentbill(44.5));

    }


}
