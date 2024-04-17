package homework8.task1;

import java.util.Objects;

public class Computer {
    /*1) Створити клас Computer з конструктором, що приймає параметри: Марка - тип String, ціна - тип int, оперативна пам'ять - тип int,
    та відеокарта - тип int.
Перевизначити метод toString для виведення об'єкта класу у наст. вигляді:
"Створено PC.
Ім'я = марка.
Ціна = ціна.
Відеокарта = обсяг відеокарти.
ОЗУ = Об'єм оперативної пам'яті."

Усі поля класу Computer мають бути приватними.

Також створіть публічні методи для отримання інформації про поля класу Computer. А також методи зміни його полів.
Перевизначте метод equals та метод hashCode для вашого класу.
Зробіть так, щоб комп'ютери вважалися однаковими у випадку, якщо у них:
рівні значення полів "марка", "оперативна пам'ять" та "відеокарта".

В окремому класі створіть об'єкт класу "комп'ютер" і виведіть у консоль "інформацію про ваш об'єкт".*/

    private String name;
    private int price;
    private int ram;
    private int videoCard;

    /* public void getAllInfoAboutComputer(){ */
    /*System.out.println("Створено PC");
    System.out.println("Імʼя - " + name);
    System.out.println("Ціна - " + price);
    System.out.println("Обсяг відеокарти - " + videoCard + "GB");
    System.out.println("Об'єм оперативної пам'яті" + videoCard);*/
//}

    public Computer(String name, int price, int ram, int videoCard) {
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.videoCard = videoCard;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Створено ПК" +
                "\nІм'я - " + name +
                "\nЦіна - " + price +
                "\nОбсяг відеокарти - " + videoCard + "GB" +
                "\nОб'єм оперативної пам'яті - " + ram + "GB";


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && videoCard == computer.videoCard && Objects.equals(name, computer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ram, videoCard);
    }
}
