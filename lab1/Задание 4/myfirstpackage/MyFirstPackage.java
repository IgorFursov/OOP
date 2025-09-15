package myfirstpackage;

public class MyFirstPackage {
    private int a;  // Первое приватное поле (делимое)
    private int b;  // Второе приватное поле (делитель)

    // Конструктор с параметрами
    public MyFirstPackage(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Методы для получения значений полей
    public int getA() { return a; }
    public int getB() { return b; }

    // Методы для модификации значений полей
    public void setA(int a) { this.a = a; }
    public void setB(int b) { this.b = b; }

    // Метод, реализующий целочисленное деление (вариант 4)
    public int divide() {
        // Проверка деления на ноль
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return 0;
        }
        return a / b;  // Целочисленное деление
    }
}