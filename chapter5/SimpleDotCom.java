
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleDotCom {

    //объявляем метод checkYourself(), принимает ход пользователя в качестве параметра String, проверяем его и   возвращаем результат: попал , мимо, потопил;
    int[] locationCells = new int[6];
    int numOfHits = 0;

    // объявляем сеттер setLocationCells(), который принимает целочисленный массив (хранящий адрес трех ячеек в виде переменных типа int);
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    // метод 1) получаем ход пользователя в виде строчкового параметра 2) преобразуем полученные данные в тип int 3) повторяем это с каждой ячейкой массива 4)сравниваем ход пользователя с местоположением клетки. 5)если пользователь угадал инкрементируем количество попаданий, выявляем была ли это последняя ячейка. 5.1) если количество попаданий  равно 3, возвращаем потопил, иначе потопления не произошло, заначит , возвращаем "Попал". конец ветвления. 5.2) иначе  пользователь не попал, возвращаем мимо конец ветвления конец повторения конец метода.
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}

class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0; // переменная для слежения за количеством ходов пользователя
        GameHelper helper = new GameHelper(); // класс с методом для приема пользовательского ввода
        SimpleDotCom theDotCom = new SimpleDotCom(); // создаем экземпляр класса
        int x = (int) (Math.random() * 5);
        int[] location = {x, x + 1, x + 2};   // объявляем целочисленный массив для хранения адреся ячеек. Даем ему имя locationCells;

        theDotCom.setLocationCells(location);

        boolean isAlive = true; // переменная для для проверки окончания игры;

        while (isAlive) {
            String userGuess = helper.getUserInput("введите число");
            String result = theDotCom.checkYourself(userGuess);
            numOfGuesses++;    // инкрементируем количество попыток
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.printf("Вам потребовалось %s попыток(и)", numOfGuesses);
            }
        }
    }
}

    class GameHelper {
     public String getUserInput (String promt) {
         String inputLine = null;
         System.out.print(promt + " ");
         try {
             BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
             inputLine = is.readLine();
             if (inputLine.length() == 0) return null;
         } catch (IOException e) {
             System.out.println("IOException: " + e);
         }
            return inputLine;
     }
    }
