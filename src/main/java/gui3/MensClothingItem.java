package gui3;

import NewTask.Player;

import javax.swing.*;
import java.awt.*;

public class MensClothingItem  {
    private String shirt;
    private String pant;
    private String jacket;
    private String coat;
    private String tie;
    private String shoe;

    public MensClothingItem(String shirt, String pant, String jacket, String coat, String tie, String shoe) {
        this.shirt = shirt;
        this.pant = pant;
        this.jacket = jacket;
        this.coat = coat;
        this.tie = tie;
        this.shoe = shoe;
    }

    public String getShirt() {
        return shirt;
    }

    public String getPant() {
        return pant;
    }

    public String getJacket() {
        return jacket;
    }

    public String getCoat() {
        return coat;
    }

    public String getTie() {
        return tie;
    }

    public String getShoe() {
        return shoe;
    }

}
