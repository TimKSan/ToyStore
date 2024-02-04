//Логгирование выигрышей для дальнейшей передаче в раздел выдачи

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WritePrizeList {
    
    public static void writePrize() {
        Path path = Paths.get("C:/Users/tim67/Desktop/js/GeekB/8.1 Промежуточная к.р/ToyStore/logDistributToys.txt");
        String content = null;
        try {content = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Ошибка чтения");
        }
        System.out.println("Заберите ваш выигрыш:\n" + content);
    }
}
