import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //todo создайте класс Wine. Протестируйте его работу в этом методе.
        Wine wine = new Wine("Портвейн", "Каждый день",
                "Россия", LocalDate.of(2000, 2, 12), "Норм штырит");

        Wine wine2 = new Wine("Каберне", "Бухарест",
                "Россия", LocalDate.of(1986, 7, 18), "Отшибает память");

        wine.agingWine(LocalDate.now());
        wine2.agingWine(LocalDate.now());
    }
}