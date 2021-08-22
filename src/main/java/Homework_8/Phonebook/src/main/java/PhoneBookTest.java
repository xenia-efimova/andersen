public class PhoneBookTest {
    public static void phoneBookTest() {
        System.out.println();
        System.out.println("Создание телефонного справочника:");
        Phonebook phonebook = new Phonebook();
        System.out.print("Справочник пуст: ");
        System.out.println(phonebook.toString());
        System.out.println();

        System.out.println("Запись данных в справочник:");
        phonebook.add("Шеметун", "333333");
        phonebook.add("Шеметун", "555555");
        phonebook.add("Баранкин", "666666");
        phonebook.add("Морозенко", "777777");
        phonebook.add("Шеметун", "999999");
        System.out.println();

        System.out.println("Номера телефонов всех абонентов:");
        //  System.out.print("Шеметун: ");
        System.out.println(phonebook.get("Шеметун"));
        //  System.out.print("Баранкин: ");
        System.out.println(phonebook.get("Баранкин"));
        // System.out.print("Морозенко: ");
        System.out.println(phonebook.get("Морозенко"));
        System.out.println();

        System.out.println("Номер несуществующего абонента:");
        //  System.out.println("Пирожков: ");
        System.out.println(phonebook.get("Пирожков"));
        System.out.println();

        System.out.println("Запись существующего номера:");
        phonebook.add("Шеметун", "333333");
        // System.out.println("Номера телефонов абонента Шеметун:");
        System.out.println(phonebook.get("Шеметун"));
    }
}