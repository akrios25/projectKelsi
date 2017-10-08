package nyc.c4q.akrios25.helloworld;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Learning Program.");
        System.out.println("What is your name?");
        String userName = scan.nextLine();
        System.out.println("Welcome "+userName+"! Choose your method of Study!");
        System.out.println("Options: Quiz or Terminology");
        String userChoice = scan.nextLine();
        if(userChoice.toLowerCase().equals("quiz")){
            JavaQuiz.quizStart(userName);
        } else if (userChoice.toLowerCase().equals("terminology")) {
            Javanology.startJavanology(userName);
        } else {
            System.out.println("That's not an option...");
        }
    }
}
