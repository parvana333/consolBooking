package controller;

public class Passengers {
    String name;
    String sirname;

    public Passengers(String name, String sirname) {
        this.name = name;
        this.sirname = sirname;
    }


    @Override
    public String toString() {
        return "Passengers{" +
                "name='" + name + '\'' +
                ", sirname='" + sirname + '\'' +
                '}';
    }
}
