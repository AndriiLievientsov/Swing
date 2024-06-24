package PlaceToLive;

public class PlaceToLive {
    private String address;
    private int rooms;
    private int size;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

//    public PlaceToLive(String address, int rooms, int size) {
//        this.address = address;
//        this.rooms = rooms;
//        this.size = size;
//    }

    public double rentbill (double size) {
        return size * 5.15;
    }
    public double houseRentbill (double size) {return  size * 74.4;}
    public double newRentBill () {
        return size * 5.15;
    }

    public void  vivodData () {
        System.out.println("--------------");
        System.out.println("Адрес: " + address);
        System.out.println("Количество комнат: " + rooms);
        System.out.println("Количество квадратных метров: " + size);
        System.out.println("Стоимость спальни: " + 10 + "$ за нанометр ");

    }
}
