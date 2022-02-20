package Homework3;
import java.util.HashMap;
public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        User user1 = new User("744", "Ivanov");
        User user2 = new User("899","Zaicev");
        User user3 = new User("789", "Ivanov");
        User user4 = new User( "111","Zaicev");
        User user5 = new User("100", "Ivanov");
        phoneBook.add(user1);
        phoneBook.add(user3);
        phoneBook.add(user2);
        phoneBook.add(user4);
        phoneBook.add(user5);

        phoneBook.get("Ivanov");
    }
}
