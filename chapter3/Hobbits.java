public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3]; // создаем массив
        int z = 0;

        while (z < 3) {     // цикл с инициализацие массива и выводом имени хоббитов на экран;

            h[z] = new Hobbits();
            h[z].name = "Бильбо";

            if (z == 1) {
                h[z].name = "Фродо";
            }
            if (z == 2) {
                h[z].name = "Сэм";
            }
            System.out.printf("%s - имя хорошего хоббита", h[z].name);
            System.out.println();
            z++;
        }
    }
}
