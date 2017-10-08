package nyc.c4q.akrios25.helloworld;
import java.util.*;
public class JavaQuiz {

    public static void quizStart(String userName){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int quizzerRange = random.nextInt(6)+1;
        System.out.println("Alright then, "+userName + "......");
        System.out.println("!QUIZ START!");
        System.out.println("(You also have the option of typing 'quit' to exit the program)");
        System.out.println(" ");
        int checkCounter = 0;
        while(quizzerRange != 10)
            switch(quizzerRange){
                case 1:
                    System.out.println("What is a boolean?");
                    System.out.println("A. true or false  \nB. a form of drool  \nC. who cares");
                    String userChoice = scan.nextLine();
                    if(userChoice.toLowerCase().equals("a")){
                        checkCounter++;
                        System.out.println("That is correct!");
                        System.out.println(" ");
                        quizzerRange = 2;
                    } else if(userChoice.toLowerCase().equals("quit")){
                        quizzerRange = 0;
                    } else {
                        System.out.println("Uhh...yeah, "+userName+", not quite, try again.");
                    }
                    break;
                case 2:
                    System.out.println("A method is also known as a...?");
                    System.out.println("A. function  \nB. way to do something  \nC. way to not do something ");
                    String userChoice1 = scan.nextLine();
                    if(userChoice1.toLowerCase().equals("a")){
                        checkCounter++;
                        System.out.println("That is correct!");
                        System.out.println(" ");
                        quizzerRange = 3;
                    } else if(userChoice1.toLowerCase().equals("quit")){
                        quizzerRange = 0;
                    } else {
                        System.out.println("Uhh...yeah, "+userName+", not quite, try again.");
                    }

                    break;
                case 3:
                    System.out.println("What does JVM stand for?");
                    System.out.println("A. Java Virtual Machine \nB. Justice Vengeance Machine \nC. Juggulating Ventriloquist Maracas");
                    String userChoice3 = scan.nextLine();
                    if(userChoice3.toLowerCase().equals("a")){
                        checkCounter++;
                        System.out.println("That is correct!");
                        System.out.println(" ");
                        quizzerRange = 4;
                    } else if(userChoice3.toLowerCase().equals("quit")){
                        quizzerRange = 0;
                    } else {
                        System.out.println("Uhh...yeah, "+userName+", not quite, try again.");
                    }

                    break;
                case 4:
                    System.out.println("How do you initialize a variable?");
                    System.out.println("A. Int myInt = 4; \nB. var varType = varOfSaidType; \nC. var = 'string';");
                    String userChoice4 = scan.nextLine();
                    if(userChoice4.toLowerCase().equals("a")){
                        checkCounter++;
                        System.out.println("That is correct!");
                        System.out.println(" ");
                        quizzerRange = 5;
                    } else if(userChoice4.toLowerCase().equals("quit")){
                        quizzerRange = 0;
                    } else {
                        System.out.println("Uhh...yeah, "+userName+", not quite, try again.");
                    }
                    break;
                case 5:
                    System.out.println("Can you change the size of an array?");
                    System.out.println("A. lol no \nB. Yes. \nC. possibly...why do you ask?");
                    String userChoice5 = scan.nextLine();
                    if(userChoice5.toLowerCase().equals("a")){
                        checkCounter++;
                        System.out.println("That is correct!");
                        System.out.println(" ");
                        quizzerRange = 6;
                    } else if(userChoice5.toLowerCase().equals("quit")){
                        quizzerRange = 0;
                    } else {
                        System.out.println("Uhh...yeah, "+userName+", not quite, try again.");
                    }
                    break;
                case 6:
                    System.out.println("What is a double?");
                    System.out.println("A. 64-bit precise number  \nB. a number  \nC. two numbers");
                    String userChoice6 = scan.nextLine();
                    if(userChoice6.toLowerCase().equals("a")){
                        checkCounter++;
                        System.out.println("That is correct!");
                        System.out.println(" ");
                        quizzerRange = 0;
                    } else if(userChoice6.toLowerCase().equals("quit")){
                        quizzerRange = 0;
                    } else {
                        System.out.println("Uhh...yeah, "+userName+", not quite, try again.");
                    }
                    break;
                case 0:
                    System.out.println("You got a total of " +checkCounter+ " questions correct! Nice job, I guess." );
                    System.out.println("Good bye!");
                    quizzerRange = 10;
                    break;
                default:
                    System.out.println("Invalid");
            }
    }
}
