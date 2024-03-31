import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Добро пожаловать в магазин игрушек");

        ArrayList<Toys> toys1 = new ArrayList<>(List.of(
                new Toys(1, "Кукла", 3),
                new Toys(2, "Мяч", 5),
                new Toys(3, "Пирамидка", 10)));
        ArrayList<Toys> toys2 = new ArrayList<>(List.of(
                new Toys(4, "Робот", 4),
                new Toys(5, "Машинка", 2),
                new Toys(6, "Мозаика", 8)));
        ArrayList<Toys> toys3 = new ArrayList<>(List.of(
                new Toys(7, "Конструктор", 7),
                new Toys(8, "Неваляшка", 6),
                new Toys(9, "Кегли", 2)));
   
        ToyStoreGame toyStore = new ToyStoreGame();
        toyStore.put(toys1);
        toyStore.put(toys2);
        toyStore.put(toys3);

        System.out.println(toyStore.getToy());
        System.out.println(toyStore.getToy());
        System.out.println(toyStore.getToy());

    }


}
