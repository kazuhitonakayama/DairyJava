
    import java.util.Scanner;

    class MyApp {
    public static void main(String[] args) {
        Integer answer = 6;
        
        System.out.print("Your guess? ");
        Integer guess = new Scanner(System.in).nextInt();
        
        if (answer == guess) {
        System.out.println("Bingo!");
        } else if (answer > guess) {
        System.out.println("The answer is higher!");
        } else {
        System.out.println("The answer is lower!");
        }
    }
    }

