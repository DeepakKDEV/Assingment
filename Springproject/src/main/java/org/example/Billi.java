package org.example;

import org.springframework.stereotype.Component;

//@Component
public class Billi {
   private String color;

    public Billi() {
        this.color="black";
        //System.out.println("cat object create ..........");
    }

//default  print


    public Billi(String color) {
        System.out.println("depend  on method call color :"+color);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }
}
