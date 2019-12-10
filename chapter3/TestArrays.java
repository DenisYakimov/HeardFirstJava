public class TestArrays {
    public static void main(String[] args) {
        String [] islands = new String[4]; // создаем массив

        islands[0] = "Бермуды";     // заполняем массив именами островом
        islands[1] = "Фиджи";
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";

        int[] index = new int[4]; // создаем массив последовательности отображения на экране и присваиваем значение
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;  // вывод на экран имен островов в соответсвии с последовательностью массива index;
        int ref;
        while (y < 4 ) {
            ref = index[y];
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
