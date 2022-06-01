import java.util.ArrayList;
import java.util.Locale;

public class Database {
    private ArrayList<User> userDatabase = new ArrayList<>();

    public void addUserToDatabase(User user) throws UserAlreadyExistException{
        if (user != null){
            if (userDatabase.contains(user)){
                throw new UserAlreadyExistException("Такой пользователь уже существует в базе");
            }
            else {
                userDatabase.add(user);
            }
        }
        else{
            throw new NullPointerException();
        }
    }

    public void removeUserToDatabase(User user) throws UserIsNotExistException {
        if (user != null){
            if (userDatabase.contains(user)){
                userDatabase.remove(user);
            }
            else {
                throw new UserIsNotExistException("Такого пользователя не существует в базе");
            }
        }
        else{
            throw new NullPointerException();
        }
    }

    public ArrayList<User> getUsersByCity(City city){
        ArrayList<User> usersByCity = new ArrayList<>();
        for (User user: userDatabase) {
            if (user.getCity().equals(city)){
                usersByCity.add(user);
            }
        }
        return usersByCity;
    }

    public ArrayList<User> getUsersByFirstName(String firstName){
        ArrayList<User> usersByFirstName = new ArrayList<>();
        for (User user: userDatabase) {
            String userFirstName = user.getFirstName().toLowerCase(Locale.ROOT);
            if (userFirstName.contains(firstName.toLowerCase(Locale.ROOT))){
                usersByFirstName.add(user);
            }
        }
        return usersByFirstName;
    }

    public ArrayList<User> getUsersByLastName(String lastName){
        ArrayList<User> usersByLastName = new ArrayList<>();
        for (User user: userDatabase) {
            String userLastName = user.getLastName().toLowerCase(Locale.ROOT);
            if (userLastName.contains(lastName.toLowerCase(Locale.ROOT))){
                usersByLastName.add(user);
            }
        }
        return usersByLastName;
    }

    public ArrayList<User> getUsersByAge(int startAge, int endAge){
        ArrayList<User> usersByAge = new ArrayList<>();
        for (User user: userDatabase) {
            int userAge = user.getAge();
            if (userAge >= startAge && userAge <= endAge){
                usersByAge.add(user);
            }
        }
        return usersByAge;
    }


}
