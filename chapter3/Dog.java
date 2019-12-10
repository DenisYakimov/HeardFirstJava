public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();   //создаем объект Dog и получаем к нему доступ;
        dog1.bark();
        dog1.name = "Барт";

        Dog[] myDogs = new Dog[3]; // создаем массив типа Dog c тремя элементами;
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Фред"; //получаем доступ к объектам Dog с помощью ссылок из массива
        myDogs[1]. name = "Джорж";

        System.out.printf("Имя последней собаки - %s", myDogs[2].name);
        System.out.println();

        int x = 0;
        while(x < myDogs.length) {
            myDogs[x]. bark();
            x++;
        }
    }
    public void bark() {
        System.out.printf("%s сказал Гав!", name);
        System.out.println();
    }
    public void eat() {

    }
    public void chaseCat() {

    }
}
