package nyc.c4q.akrios25.helloworld;
import java.util.*;
public class Javanology {

    private static HashMap<String, String> definitionBank = new HashMap<>();

    static void startJavanology(String userName) {
        termBank();
        userIntro();
        startProgram(userName);
    }
    public static void startProgram(String userName) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String userInput = scanner.next();
            if (userInput.toLowerCase().equals("quit")) {
                System.out.println("Thanks for playing " + userName + "!");
                break;
            }
            if (definitionBank.containsKey(userInput)) {
                System.out.println("You typed: " + userInput);
                System.out.println(definitionBank.get(userInput));
            } else {
                System.out.println("Term is not in the definition bank");
            }
        }
    }
    private static void termBank() {
        definitionBank.put("boolean", " an expression or variable that can have only a true or false value ");
        definitionBank.put("array", " a collection of data items ");
        definitionBank.put("bit", " the smallest unit of information in a computer, with a value of either 0 or 1 ");
        definitionBank.put("break", " used to resume program execution at the statement immediately following the current statement. If followed by a label, the program resumes execution at the labeled statement. ");
        definitionBank.put("compiler", " a program to translate source code into code to be executed by a computer ");
        definitionBank.put("constructor", "a pseudo-method that creates an object ");
        definitionBank.put("float", "keyword used to define a floating point number variable ");
        definitionBank.put("for", " keyword used to declare a loop that reiterates statements");
        definitionBank.put("if", " keyword used to conduct a conditional test and execute a block of statements if the test evaluates to true ");
        definitionBank.put("implement", " keyword optionally included in the class declaration to specify any interfaces that are implemented by the current class ");
        definitionBank.put("instance", " an object of a particular class ");
        definitionBank.put("inheritance", " concept of classes automatically containing the variables and methods defined in their superclass ");
        definitionBank.put("int", " a variable of type integer");
        definitionBank.put("method", " a function in a defined class ");
        definitionBank.put("object", " principal building blocks of object-oriented programs ");
        definitionBank.put("null", " keyword used to specify an undefined value for reference variables ");
        definitionBank.put("overloading", " using one identifier to refer to multiple items in the same scope ");
        definitionBank.put("overriding", " providing a different implementation of a method in a subclass of the class that originally defined the method ");
    }
    private static void userIntro() {
        System.out.println("Starting Java-nology! Please enter quit to quit.\n Welcome! Please input a term you'd like to know the definition for: ");
    }
}
