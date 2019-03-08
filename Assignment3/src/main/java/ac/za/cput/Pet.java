package ac.za.cput;

public class Pet {

    private String name;
    private int age;
    private boolean happy = false;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Pet(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isHappy(){
        return happy;
    }

    public void playWithToy() {
        happy = true;
    }
}
