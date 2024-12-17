package DifPakcage;

public class Main {
    public static void main(String[] args) {
        // Создание артистов
        Artist artist1 = new Artist("Queen");
        Artist artist2 = new Artist("Beethoven");

        // Создание песен
        Song song1 = new Song("Bohemian Rhapsody", Genre.ROCK);
        Song song2 = new Song("We Will Rock You", Genre.ROCK);
        Song song3 = new Song("Symphony No. 9", Genre.CLASSICAL);
        Song song4 = new Song("Für Elise", Genre.CLASSICAL);

        // Создание альбомов
        Album album1 = new Album("Greatest Hits");
        album1.addSong(song1);
        album1.addSong(song2);

        Album album2 = new Album("Classical Masterpieces");
        album2.addSong(song3);
        album2.addSong(song4);

        // Добавление элементов к артистам
        artist1.addItem(song1);
        artist1.addItem(album1);
        artist2.addItem(song3);
        artist2.addItem(album2);

        // Создание плейлиста
        Playlist playlist = new Playlist();
        playlist.addItem(song1);
        playlist.addItem(song3);
        playlist.addItem(album1);

        // Вывод информации
        System.out.println("Информация об артистах:");
        System.out.println(artist1);
        System.out.println(artist2);

        System.out.println("\nСодержимое плейлиста:");
        System.out.println(playlist);
    }
}
/*
* Каждому классу Нет соответствуют имя (String) и исполнитель (эк­
земпляр класса Art ist). Каждому экземпляру класса Art ist соот­
ветствуют имя (String) и массив ArrayList, содержащий элементы.
Классы Song и Album являются производными от класса Item. Каж­
дому экземпляру класса Song соответствует жанр (значение из
перечисления Genre). Значениями Genre будут ROCK, РОР, BLUES
и CLAS SICAL. Каждый экземпляр класса Album включает массив
ArrayList, содержащий песни.
И наконец, класс Playl ist включает массив ArrayList, содержа­
щий элементы.
Создайте вышеописанные классы. В отдельном классе создайте эк­
земпляры каждого класса и отобразите сведения, относящиеся к
этим экземплярам, на экране.
* */