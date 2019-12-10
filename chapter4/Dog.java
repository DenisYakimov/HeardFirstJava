
public class Dog {
    int size;
    String name;

    public Dog(int size) {  // шаблон, с вынесенным размером собаки
        this.size = size;
        bark();
    }

    void bark() {                   // метод голос, с условиями
       if (size > 60) {
           System.out.println("Гав Гав");
       } else if( size > 14)
           System.out.println( "Вуф Вуф");
       else System.out.println( "Тяф Тяф");

        }
    }

class DogTestDrive {                        // проверка метода голос, в зависимости от размера собаки
    public static void main(String[] args) {
        Dog one = new Dog(70);
        Dog two = new Dog(8);
        Dog three = new Dog(35);
    }
}
