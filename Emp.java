package cs.bean;

import org.springframework.stereotype.Component;

@Component("emp")
public class Emp {

    int id;
    String name;
    String city;

    public Emp() {
        id = 101;
        name = "Rutik";
        city = "Pune";
        System.out.println(" ");
    }

    public void disp() {
        System.out.println(id + " " + name + " " + city);
    }
}
