class MyFirstClass {
    public static void main(String[] s) {
        // Создание и инициализация объекта "o" типа MySecondClass
        MySecondClass o = new MySecondClass(10, 5);
        
        // Вывод результата деления для начальных значений
        System.out.println(o.divide());
        
        // Вывод таблицы результатов деления для значений от 1 до 8
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setA(i);  // Установка значения первого поля (делимого)
                o.setB(j);  // Установка значения второго поля (делителя)
                System.out.print(o.divide());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    private int a;  // Первое приватное поле (делимое)
    private int b;  // Второе приватное поле (делитель)
    
    // Конструктор с параметрами
    public MySecondClass(int a, int b) {
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
