import java.util.*;

public class Phonebook {
    private final HashMap<String, List<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String lastName, String phone) {
        if (phonebook.containsKey(lastName)) {
            List<String> phones = phonebook.get(lastName);
            if (!phones.contains(phone)) {
                phones.add(phone);
                System.out.println("Абоненту " + lastName + " добавлен номер телефона " + phone);
            } else System.out.println("У абонента " + lastName + " уже есть номер телефона " + phone);
        } else {
            phonebook.put(lastName, new ArrayList<>(Collections.singletonList(phone)));
            System.out.println("Абоненту " + lastName + " добавлен номер телефона " + phone);
        }
    }

    public List<String> get(String lastName) {
        if (phonebook.containsKey(lastName)) {
            System.out.print(lastName + ": ");
            return phonebook.get(lastName);
        } else {
            System.out.println("В телефонном справочнике нет абонента с фамилией " + lastName);
            return new ArrayList<>();
        }
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "phonebook=" + phonebook +
                '}';
    }
}