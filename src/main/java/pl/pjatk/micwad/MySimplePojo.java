package pl.pjatk.micwad;

public class MySimplePojo {

    private String name;

    public MySimplePojo(String name) {
        this.name = name;
        System.out.println("i'm working");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printOutMe() {
        System.out.println("value from MySimplePojo: " + name);
    }

    @Override
    public String toString() {
        return "MySimplePojo{" +
                "name='" + name + '\'' +
                '}';
    }
}
