import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        toyStore.addToy(new Toy(1, "Конструктор", 2, 20.0));
        toyStore.addToy(new Toy(2, "Робот", 2, 20.0));
        toyStore.addToy(new Toy(3, "Кукла", 6, 60.0));

        for (int i = 0; i < 10; i++) {
            Toy prizeToy = toyStore.drawToy();
            if (prizeToy != null) {
                toyStore.savePrizeToyToFile(prizeToy);
                System.out.println(MessageFormat.format("игрушка {0} : {1}", i , prizeToy.getName()));
            } else {
                System.out.println("Больше нет игрушек");
            }
        }
    }
}