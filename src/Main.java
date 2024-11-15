import entity.Child;
import entity.Parent;

public class Main {
    public static void main(String[] args) {
        Parent noNameChild = new Child();
        Parent ivanChild = new Child("Ivan");
    }
}