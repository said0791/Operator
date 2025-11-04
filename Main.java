public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        var age = 10;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задание 2");

        var agedegree = 3;

        if (agedegree < 5) {
            System.out.println("На улице холодно " + agedegree + ", нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло " + agedegree + ", можно идти без шапки");
        }

        System.out.println("Задание 3");

        int speed = 60;

        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }

        System.out.println("Задание 4");

        int human = 1; // ОШИБКА: используем human, но проверяем age

        if (human >= 2 && human <= 6) { // Исправлено: проверяем human вместо age
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в детский сад");
        } else if (human >= 7 && human <= 17) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в школу");
        } else if (human >= 18 && human <= 24) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в университет");
        } else if (human > 24) { // Исправлено: > вместо >= чтобы избежать дублирования
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + human + ", то ему рано ходить в детский сад");
        }

        System.out.println("Задание 5");

        int child = 5;
        if (child < 5) { // Исправлено: < вместо <=
            System.out.println("Если ребенку меньше " + child + " лет, то он не может кататься на аттракционе");
        }

        child = 15;
        var zet = "yes";

        // Исправлена структура условий для задания 5
        if (child < 5) {
            System.out.println("Не может кататься на аттракционе");
        } else if (child >= 5 && child <= 14) {
            if (!zet.equals("yes")) { // Исправлено: правильное сравнение строк
                System.out.println("Нельзя кататься на аттракционе без сопровождения взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + child + ", то ему можно кататься на аттракционе в сопровождении");
            }
        } else {
            System.out.println("Он может кататься без сопровождения взрослого");
        }

        System.out.println("Задание 6");

        int totalSeats = 102;
        int sittingSeats = 60;
        int occupied = 42;

        System.out.println("Занято мест: " + occupied);

        if (occupied < sittingSeats) {
            System.out.println("Есть сидячее место!");
        } else if (occupied < totalSeats) {
            System.out.println("Есть стоячее место!");
        } else {
            System.out.println("Вагон полностью забит!");
        }

        System.out.println("Задание 7");

        int one = 10;
        int two = 25;
        int three = 15;

        System.out.println("Даны три числа: " + one + ", " + two + ", " + three);

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }}
