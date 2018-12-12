package isNotLabs;

public class Main {
    public static void main(String[] args) {
        Database database = User::new;
        User user = database.create("Simon" , "root");
        System.out.printf("Name: %s%nPassword: %s", user.getName(), user.getPassword());
    }
}
