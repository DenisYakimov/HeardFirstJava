
import java.io.IOException;
import java.util.ArrayList;

public class DutComBust {
    private GameHelper helper = new GameHelper();       // объявляем и инициализируем переменные класса
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom> ();
    private int numOfGuesses = 0;

    private void setUpGame() {       // создать сайты и присвоить им адреса
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Ваша цель - потопить три \"сайта\" ");  //выводим краткие инструкции для пользователя
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocatoinCells(newLocation);
        }
    }

    private void startPlaying() throws IOException {
        while(!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if(result.equals("Потопил")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все \" сайты \" ушли ко дну! Ваши акции теперьничего не стоят.");
        if(numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего" + numOfGuesses + "попыток.");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули.");
        }   else {
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + "попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }

    public static  void main(String[] args) throws IOException {
        DutComBust game = new DutComBust();
        game.setUpGame();
        game.startPlaying();
    }



}
