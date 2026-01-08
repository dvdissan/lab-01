package com.example.petshop;
import java.util.Date;

public class Dog extends Pet implements Pettable{
    public Dog(String name) {
        super(name);
    }
    public Dog(String name, Date birthDate){
        super(name,birthDate);
    }
    // In Cat class
    @Override
    public String speak() {
        return "bark"; // Cats meow
    }

    @Override
    public void pet() {

    }
}
