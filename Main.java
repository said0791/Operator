public class Main {
    public class Main {
        public static void main(String[] args) {

            System.out.println(" Задания-1");

            var age = 10;

            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
            }
            System.out.println(" Задания-2");

            var age1 = 3;

            if (age1 < 5) {
                System.out.println("На улице холодно " + age1 + ", нужно надеть шапку");
            } else {
                System.out.println("Сегодня тепло " + age1 + ", можно идти без шапки");
            }
            System.out.println(" Задания-3");

            int age3 = 60;

            if (age3 >= 60) {
                System.out.println("Если скорость " + age3 + " км/ч, то придется заплатить штраф");
            } else {
                System.out.println("Если скорость " + age3 + " км/ч, то можно ездить спокойно");
            }

            System.out.println(" Задания-4");

            int age4 = 1;

            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age4 + " то ему нужно ходить в детский сад");
            } else {
                System.out.println("Если возраст человека равен " + age4 + "  то ему рано ходить в детский сад");
            }
            int age5 = 7;
            if (age5 >= 7 && age5 <= 17) {
                System.out.println("Если возраст человека равен " + age5 + " то ему нужно ходить в школу");
            } else if (age5 < 7){
                System.out.println("Если возраст человека равен " + age5 + " то ему нужно ходить в детский сад");
            }else {
                System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в университет");}


            int age6 = 18;
            if (age6 >= 18 && age6 <= 24) {
                System.out.println("Если возраст человека равен " + age6 + " то ему нужно ходить в университет ");
            } else if (age6 < 18) {
                System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в школу");
            } else {
                System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить на работу");
            }
            {
                int age7 = 25;
                if (age7 >= 24) {

                    System.out.println("Если возраст человека больше " + age7 + " то ему нужно ходить на работу ");
                }
            }
            System.out.println(" Задания-5");

            int age8 = 5;
            if (age8 <= 5) {
                System.out.println("Если ребенку меньше " + age8 + "  лет, то он не может кататься на аттракционе");
            }
            System.out.println(" Задания 6");
            var age9 = 15;
            var zet = "yes";
            if (age9 >= 5 && age9 <= 14) {
                if (zet == "yes") {
                    System.out.println("Если возраст ребенка равен " + age9 + " то ему можно кататься на аттракционе в сопровождении");
                } else {
                    System.out.println("нельзя кататься на аттракционе, без сопровождения взрослого");
                }
            } else {
                System.out.println("он может кататься без сопровождения взрослого");
            }
            {
                System.out.println(" Задания 6");
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
                { System.out.println(" Задания 7");
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
                }


            }}}


}
