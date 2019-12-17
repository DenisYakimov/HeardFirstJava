public class Animal {
    public Animal () {
        System.out.println("Создание Animal");
    }
}
class Hippo extends Animal {
    public  Hippo () {
        System.out.println("Создание Hippo");
    }
}
 class TestHippo {
    public static void main(String[] args) {
        System.out.println("Начало");
        Hippo h = new Hippo();
    }
}

/*
Начало
Создание Animal
Создание Hippo

 */
