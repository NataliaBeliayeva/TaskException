import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Natalia", "Beliayeva", 30, City.MINSK);
        User user2 = new User("Ivan", "Ivanov", 25, City.MOGILEV);
        User user3 = new User("Olga", "Beliayeva", 27, City.BREST);
        Database database = new Database();
        try {
            database.addUserToDatabase(user1);
            database.addUserToDatabase(user3);
            database.addUserToDatabase(user2);
            database.addUserToDatabase(user2);

        } catch (UserAlreadyExistException e) {
            e.printStackTrace();
        }
        try {
            database.removeUserToDatabase(user2);
            //database.removeUserToDatabase(user3);
        } catch (UserIsNotExistException e) {
            e.printStackTrace();
        }
        ArrayList<User> usersByAge = database.getUsersByAge(24,30);
        ArrayList<User> usersByFirstName = database.getUsersByFirstName("Nata");
        ArrayList<User> usersByLastName = database.getUsersByLastName("Beli");
        System.out.println("Список пользователей по возрасту: ");
        for (User user: usersByAge) {
            System.out.println(user);
        }
        System.out.println();
        System.out.println("Список пользователей по имени: ");
        for (User user: usersByFirstName) {
            System.out.println(user);
        }
        System.out.println();
        System.out.println("Список пользователей по фамилии: ");
        for (User user: usersByLastName) {
            System.out.println(user);
        }
        System.out.println();
    }
}
