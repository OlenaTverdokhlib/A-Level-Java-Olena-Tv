package ua.tverdokhlib.hw6;

public class Phone {
    String number;
    String model;
    double weight;

    //Добавить конструктор в класс Phone, который принимает на вход
    //три параметра для инициализации переменных класса - number, model
    //и weight.
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    //Добавить конструктор, который принимает на вход два параметра
//для инициализации переменных класса - number, model.
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    //Добавить конструктор без параметров
    public Phone() {

    }

    //Метод receiveCall
    public void receiveCall(String caller) {
        System.out.println("Звонит: " + caller);
    }

    //Метод вывода номера
    public String getNumber() {
        return number;
    }

    //Создать три экземпляра этого класса.
            public static void main(String[] args) {
            Phone phone1 = new Phone("789_785_671", "Samsung Galaxy Ultra", 228.1);
            Phone phone2 = new Phone("123_456_789", "Lenovo");
            Phone phone3 = new Phone();

            //Присвоить значения полям класса.
            phone3.number = "568_456_023";
            phone3.model = "iPhone";
            phone3.weight = 130.5;

            //Вывод значений полей
            System.out.println("Phone1 number:" + phone1.number);
            System.out.println("Phone1 model:" + phone1.model);
            System.out.println("Phone1 weight:" + phone1.weight);

            System.out.println("Phone2 number:" + phone2.number);
            System.out.println("Phone2 model:" + phone2.model);

            System.out.println("Phone3 number:" + phone3.number);
            System.out.println("Phone3 model:" + phone3.model);
            System.out.println("Phone3 weight:" + phone3.weight);

            // Вызов методов receiveCall и getNumber
            phone1.receiveCall("Lena");
            System.out.println("Phone1 number: " + phone1.getNumber());

            phone2.receiveCall("Max");
            System.out.println("Phone2 number: " + phone2.getNumber());

            phone3.receiveCall("Bob");
            System.out.println("Phone3 number: " + phone3.getNumber());
        }
    }