package PhoneDirectory;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    Map<String,List<String>> contacts ;

    public PhoneDirectory() {
       contacts = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
       if (contacts.containsKey(surname)) {
           contacts.get(surname).add(phoneNumber);
       } else {
           List<String > newPhoneNumbersList = new ArrayList<>();
           newPhoneNumbersList.add(phoneNumber);
           contacts.put(surname, newPhoneNumbersList);
       }
    }
    public List<String> get(String surname) {
        return contacts.getOrDefault(surname, null);
    }
}
