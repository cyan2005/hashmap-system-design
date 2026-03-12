import java.util.*;

public class UsernameChecker {

    HashMap<String,Integer> users = new HashMap<>();
    HashMap<String,Integer> attempts = new HashMap<>();

    public boolean checkAvailability(String username){

        attempts.put(username, attempts.getOrDefault(username,0)+1);

        return !users.containsKey(username);
    }

    public void registerUser(String username,int userId){

        users.put(username,userId);
    }

    public static void main(String[] args) {

        UsernameChecker checker = new UsernameChecker();

        checker.registerUser("john_doe",1);

        System.out.println(checker.checkAvailability("john_doe"));
        System.out.println(checker.checkAvailability("jane_smith"));
    }
}