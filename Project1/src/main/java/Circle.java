//створюємо користувацькі класи
class Circle {
    // свойства класса
    private double x; // абсцисса центра
    public double y; // ордината центра
    public double r; // радиус
    // методы класса
    // выводит на экран параметры окружности
    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r); // System - клас, що
// забезпечує доступ до системи
// out – консольне виведення інформації
    }
    // перемещает центр, движение окружности
    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }
    // масштабируем, выполняем преобразование подобия с коэффициентом k
    public void zoomCircle(double k) {
        r = r * k;
    }
}