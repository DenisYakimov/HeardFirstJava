import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    // инициализируем и объявляем переменные класса GameHelper
    private static final String alphabet = "alphabet";
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int[gridSize];
    private int comCount = 0;

    // создание метода по чтению с консоли текста, возвращению в нижнем регистре
    public String getUserInput(String promt) throws IOException {
        String inputLine = null;
        System.out.println(promt + " ");
        try {
            BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
             inputLine = reader.readLine();
        if(inputLine.length() == 0) return null;
    }   catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase(); // вывод текста в нижнем регистре
        }
        // метод по созданию листа с координатами текущего сайта
    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphacoords = new String[comSize]; // хранит координаты типа f6
        String temp = null;     //временная строка для кокатенации
        int[] coords = new int[comSize]; // координаты текущего "сайта"
        int attempts = 0;               //  счётчик текущих попыток
        boolean success = false;        // Нашли подходящее местоположение
        int location = 0;               // Текущее начальное местоположение

        comCount++;         // Энный "сайт для размещения
        int incr =1;        // Установливаем горизонтальный инкремент
        if((comCount % 2) == 1) {   //если нечетный (размещаем вертикально)
            incr = gridLength;      //устанавливаем вертикальный инкремент
        }

        while(!success & attempts++ < 200 ) {           //главный поисковый цикл(32)
            location = (int) (Math.random() * gridSize);  //Получаем случайную стартовую точку
            //System.out.println("пробуем" + location);
            int x = 0;      // позиция в "сайте", который нужно разместить
            success = true;     //Предлагаем успешный исход
            while (success && x < comSize) {     //Ищем соседнюю неиспользованную ячейку
                if (grid[location] == 0) {        //Если еще не используется
                    coords[x++] = location;       //Сохраняем местоположение
                    location += incr;              //Пробуем "следующую" соседнюю ячейку
                    if (location >= gridSize) {     //Вышли за рамки - низ
                        success = false;            //Неудача
                    }
                } else {
                    //System.out.println( "используется" + location); // Нашли уже использующееся местоположение, неудача
                    success = false;
                }
            }
        }       // конец while

        int x = 0;      // Переводим местоположение в символьные координаты
        int row = 0;
        int column = 0;
        //System.out.println("/n");
        while (x < comSize) {
            grid[coords[x]] = 1;        //Помечаем ячейки на главной сетке как использованные
            row = (int) (coords[x]/gridLength); //Получаем значение строки
            column = coords[x]%gridLength;  //Получаем числовое заначение столбца
            temp = String.valueOf(alphabet.charAt(column));     //Преобразуем его в строковый символ

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            //System.out.println("coord" + " " + alphaCells.get(x-1));  //находится сайт
            }
            return alphaCells;
             }
        }
