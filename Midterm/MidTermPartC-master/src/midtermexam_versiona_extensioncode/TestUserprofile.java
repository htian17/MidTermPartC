package midtermexam_versiona_extensioncode;

/**
 *
 * @author htian
 */
import java.util.*;
public class TestUserprofile {
    public static void main(String[] args){
        System.out.println("Please enter name: ");
        Scanner scan = new Scanner(System.in);
        String userID = scan.nextLine();
        System.out.println("Please chose a movie genre (Comedy, Drama, Action, Mystery): ");
        String genre = scan.nextLine();
        UserProfile newUser = new UserProfile(userID,genre);
        System.out.println("User Profile has been created");
    }
}
