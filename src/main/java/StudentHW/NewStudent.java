package StudentHW;

public class NewStudent {
    String name;
    int ID;
    double GPA;
    Pro pro;


    public NewStudent(String name, int ID, double GPA, Pro pro) {
        this.name = name;
        this.ID = ID;
        this.GPA = GPA;
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

    public Pro getPro() {
        return pro;
    }

    public void setPro(Pro pro) {
        this.pro = pro;
    }


    public String getString (){
        return "Name: " + name + " ID: " + ID + " GPA: " + GPA + " Pro: " + (pro != null ? pro : "Не указано");
    }

}
