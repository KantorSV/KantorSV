package homework_1;

public class Human {

    private String gender;
    private int height;
    private int weight;
    private String name;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nHuman" + "\ngender = " + gender + "\nheight = " + height + "\nweight = " + weight + "\nname = " + name;
    }
}
