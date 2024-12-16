// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicStore store = new MusicStore();
        store.initStore(); // Предзаполнение магазина
        store.displayMenu(); // Вызов главного меню
    }
}