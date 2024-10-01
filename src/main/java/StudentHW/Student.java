package StudentHW;

public class Student {
    String name;
    int ID;
    double GPA;
    Pro pro;
    double x = 0;

    double[] num = {59.36, 2.22, 125.1, 44.7, 555.5};

    public Student(String name) {
        this.name = name;
    }

    public Student(int ID) {
        this.ID = ID;
    }

    public Student(double GPA) {
        this.GPA = GPA;
    }

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public Student(String name, int ID, double GPA) {
        this.name = name;
        this.ID = ID;
        this.GPA = GPA;
    }

    public Student(double GPA, int ID) {
        this.GPA = GPA;
        this.ID = ID;
    }

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }


    public void printName () {
        System.out.println("Имя крутого студента: " + name);
        System.out.println("-----------");
        System.out.println("Профессия: " + getPro());

    }

    public void  printNameId () {
        System.out.println(" Имя крутого студента: " + name + ", Id студента: " + ID);
        System.out.println("-----------");
        System.out.println("Профессия: " + getPro());

    }

    public void printGPA () {
        System.out.println(" Средний бал этого чудика: " + GPA);
        System.out.println("-----------");
        System.out.println("Профессия: " + getPro());

    }

    public void  printAll () {
        for (double value : num) {
            x += value;
        }

        System.out.println(" Имя этого Гигача: " + name +
                ", Айдишник крутыша: " + ID +
                ", Баллы: " + GPA);
        System.out.println("-----------");
        System.out.println("Профессия: " + getPro());
        System.out.println("Средний бал балыч: " + x);
    }

    public Pro getPro() {
        return pro;
    }

    public void setPro(Pro pro) {
        this.pro = pro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }




}
