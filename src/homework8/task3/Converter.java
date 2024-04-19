package homework8.task3;

public class Converter {
    /*Необхідно створити клас конвертер, який матиме методи конвертації примітивних типів даних:

- метод convertToInt; (Конвертує byte, short, int, long, char, float, double, String).
При введенні boolean виводить повідомлення, що введено тип boolean.

- метод convertToDouble; (Конвертує byte, short, int, long, char, float, double, String).
При введенні boolean виводить повідомлення, що введено тип boolean.

- метод converToString; (Конвертує byte, short, int, long, char, boolean, float, double, String).
Цей клас повинен мати лише один конструктор, у параметрах якого можна вказати його ім'я.
А також лише один метод геттер для отримання інформації про назву конвертру.
*/


    private String name;

    public Converter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int convertToInt(byte value) {return value;}
    public int convertToInt(short value) {return value;}
    public int convertToInt(int value) {return value;}
    public int convertToInt(long value) {return (int) value;}
    public int convertToInt(char value) {return value;}
    public int convertToInt(float value) {return (int) value;}
    public int convertToInt(double value) {return (int) value;}
    public int convertToInt(String value){return Integer.parseInt(value);}
    public int convertToInt(Object value) {
        if (value instanceof Boolean) {
            System.out.println("Введен тип boolean");
        }
        return 0;
    }

//

    public double convertToDouble(byte value) {
        return value;
    }
    public double convertToDouble(short value) {
        return value;
    }
    public double convertToDouble(int value) {
        return value;
    }
    public double convertToDouble(long value) {
        return value;
    }
    public double convertToDouble(char value) {
        return value;
    }
    public double convertToDouble(float value) {
        return value;
    }
    public double convertToDouble(double value) {
        return value;
    }
    public double convertToDouble(Object value) {
        if (value instanceof Boolean) {
            System.out.println("Введен тип boolean");
        }
        return 0.0;
    }
    //
    public String convertToString(byte value) {
        return String.valueOf(value);
    }
    public String convertToString(short value) {
        return String.valueOf(value);
    }
    public String convertToString(int value) {
        return String.valueOf(value);
    }
    public String convertToString(long value) {
        return String.valueOf(value);
    }
    public String convertToString(char value) {
        return String.valueOf(value);
    }
    public String convertToString(boolean value) {
        return String.valueOf(value);
    }
    public String convertToString(float value) {
        return String.valueOf(value);
    }
    public String convertToString(double value) {
        return String.valueOf(value);
    }
    public String convertToString(String value) {
        return value;
    }

    public String convertToString(Object value) {
        if (value instanceof Boolean) {
            System.out.println("Введен тип boolean");
        }
        return null;
    }


}

