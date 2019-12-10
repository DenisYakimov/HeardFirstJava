public class Puzzle4 {
    public static void main(String[] args) {
      Puzzle4b [] obs = new Puzzle4b[6]; // объявляем массив и переменные класса
      int y = 1;
      int x = 0;
      int result = 0;
      while (x < 6) {           // в цикле задаем значения переменным;
         obs[x] = new Puzzle4b();
         obs[x].ivar = y;
          y = y * 10;
          x = x + 1;
      }
      x = 6;
      while (x > 0) {        // в цикле расчитываем значение итоговой переменной;
            x = x - 1;
            result = result + obs[x].doStuff(x);
      }
        System.out.println("Результат: " + result);
    }
}
class Puzzle4b {             // класс методом расчета переменных;
    int ivar;
    public int doStuff( int factor ) {
        if (ivar > 100) {
            return ivar * factor;
        } else return ivar *(5 - factor);
    }
}
