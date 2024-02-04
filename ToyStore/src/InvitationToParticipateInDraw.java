//Приглашение принять участие в розыгрыше 

import java.util.Scanner;

public class InvitationToParticipateInDraw {
    static int countWin = 0;
    public void invitation() {
        int selectedOption = 0;
        int participantMoney = 25;

        Scanner in = new Scanner(System.in);
        System.out.println("\nВас приветствует магазин игрушек!");

        while (selectedOption != 9) {
            int responseToOffer = 0;
            System.out.println("\nСтоиость участия в розыгрыше - 5$. Играем?\n1. Да\n2. Нет");
            responseToOffer = in.nextInt();
            if (responseToOffer == 1) {
                if (participantMoney > 4) {
                    System.out.println("\nОтлично, играем! Выберите желаемый приз, разыгрываем:");
                    participantMoney -= 5;
                } else {
                    System.out.println("\nК сожалению у вас недостаточно денег!");
                    break;
                }
            } else {
                if (countWin > 0) WritePrizeList.writePrize(); 
                
                System.out.println("\nВсего хорошего!");
                break;
                
            }

            System.out.println("1. Велосипед\n2. Машинка\n3. Брелок\n9. Для выхода");
            selectedOption = in.nextInt();
            if (selectedOption == 1) {
                СalculatingСhance cСhance = new СalculatingСhance();
                System.out.println(cСhance.calcWonChance(selectedOption));
            } else if (selectedOption == 2) {
                СalculatingСhance cСhance = new СalculatingСhance();
                System.out.println(cСhance.calcWonChance(selectedOption));
            } else if (selectedOption == 3) {
                СalculatingСhance cСhance = new СalculatingСhance();
                System.out.println(cСhance.calcWonChance(selectedOption));
            }
        }
        in.close();
    }

}
