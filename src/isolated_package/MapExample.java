package isolated_package;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main (String[] args) {
        Map<String, User> userMap = new HashMap<>();

        userMap.put("Alan", new User("Alan", "Alan's data is awesome"));
        userMap.put("Bob", new User("Bob", "Bob's data is OK"));
        userMap.put("Data", new User("Data", "Data's data is positively positronic"));

        for (String key : userMap.keySet()) {
            User user = userMap.get(key);
            System.out.println("Username = " + user.getUserName());
            System.out.println("Data = " + user.getUserData());
        }
    }


}

class User {
    private String userName;
    private String userData;

    public User (String userName, String userData) {
        this.userName = userName;
        this.userData = userData;
    }

    public String getUserName () {
        return userName;
    }

    public String getUserData () {
        return userData;
    }
}