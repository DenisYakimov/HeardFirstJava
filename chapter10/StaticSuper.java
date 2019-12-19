public class StaticSuper {
    static {
        System.out.println("Родительский статический блок");    // 1
    }
    public StaticSuper() {
        System.out.println("Родительский конструктор");         //4
    }
}

class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int)(Math.random()*6);
        System.out.println("Статический блок" + rand);      //2
    }
    StaticTests() {
        System.out.println("Конструктор");
    }       //5

    public static void main(String[] args) {
        System.out.println("Внутри main");              //3
        StaticTests st = new StaticTests();
    }
}
