class Person{
    String Name;
    String Surname;
    String Birthday;
    Person(String name, String surname, String birthday){
        this.Name = name;
        this.Surname = surname;
        this.Birthday = birthday;
    }

    void display(){
        System.out.printf( "Фамилия имя: %s %s.\n Год рождения: %s\n", Name, Surname, Birthday);
    }
}

class Car{
    String Brand;
    int Year;
    double Volume;

    Car(String brand, int year, double volume){
        this.Brand = brand;
        this.Year = year;
        this.Volume = volume;
    }

    void display(){
        System.out.printf( "Марка автомобиля: %s\nГод выпуска: %s.\nОбъем двигателя: %s\n", Brand, Year, Volume);
    }
}

class Book{
    String Title;
    String Author;
    int Year;

    Book(String Title, String Author, int Year){
        this.Title = Title;
        this.Author = Author;
        this.Year = Year;
    }

    void display(){
        System.out.printf( "Название книги: %s\nАвтор: %s\nГод выпуска: %s\n", Title, Author, Year);
    }
    void displayy(Person person, Car car){
        System.out.println(person.Name + " читает книгу " + Title + " про машину " + car.Brand);
    }
}
public class Main {
    public static void main(String[] args){
        Person person = new Person("Дмитрий", "Ермохин", "11/12/2005");
        Car car = new Car("dodge charger", 1964, 7.2);
        Book book = new Book("Автомобили", "Уханов А.А.", 1999);
        person.display();
        car.display();
        book.display();
        book.displayy(person,car);
    }
}