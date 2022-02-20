package Homework3;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class PhoneBook {
    private HashMap<String, String> phoneBook = new HashMap<>();

    public void add(User client) {
        phoneBook.put(client.getPhone(), client.getLastName());
    }
    //    private List<Integer> numbers = new ArrayList<>();
//    public void add (User client){
//        if(phoneBook.get(client.getLastName())!=null){
//            if(!phoneBook.containsKey(client.getLastName())){
//                phoneBook.put(client.getLastName(), new ArrayList<Integer>());
//            }
//            phoneBook.put(client.getLastName(), numbers);
//        }
//        numbers.add(client.getPhone());
//        phoneBook.put(client.getLastName(), numbers);
//    }
    public void get(String S) {
        List<String> result = new ArrayList<>();
        for (HashMap.Entry entry : phoneBook.entrySet()) {
            if (S.equals(entry.getValue())) {
                result.add((String) entry.getKey());
            }
        }
        if (result.size() == 0) {
            result.add("абонент с такой фамилией не найден");
        }
        System.out.println(result);
    }
}

