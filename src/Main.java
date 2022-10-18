public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
        public static void task1 () {
            // Задание 1
            String firstName = " Ivan ";
            String middleName = " Ivanovich ";
            String lastName = " Ivanov ";
            String fullName = lastName + firstName + middleName;
            System.out.println("Ф.И.О. сотрудника  - " + fullName);
        }
        public static void task2 () {
        // Задание 2
            String firstName = " Ivan ";
            String middleName = " Ivanovich ";
            String lastName = " Ivanov ";
            String fullName = lastName + firstName + middleName;
            String fullName1 = fullName.toUpperCase();
            System.out.println("Данные ФИО сотрудника для заполнения отчета — " +fullName1 );

        }
        public static void task3 () {
            // Задание 3
            String fullName = " Иванов Семён Семёнович ".replace('ё', 'е');
            System.out.println("Данные ФИО сотрудника — " + fullName);
        }
        public static void task4 () {
            // Задание 4

        }
}
