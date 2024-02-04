import java.io.FileWriter;
import java.io.IOException;

public class LogginWonToy {

    public static void log(String answer) {
        try (FileWriter fw = new FileWriter("logWonToy.txt", true)) {
            fw.write(answer);
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        }
    }

    public static void logDistributToys(int id, String name) {
        try (FileWriter fw = new FileWriter("logDistributToys.txt", true)) {
            fw.write(id + " ");
            fw.write(name +"\n");
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        }
    }
}