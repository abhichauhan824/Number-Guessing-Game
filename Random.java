package Arrays;
import java.util.Random;
import java.util.Scanner;

public class Randm{
    public static void main(String[] args) {
            // Create a Random object
            Random random = new Random();

            // Generate a random number between 1 and 100
            int randomNumber = random.nextInt(100) + 1; // Generates between 1 and 100 (inclusive)


        System.out.println("******************** Select your option ********************");
        System.out.println("           Enter 1 to the Number in 5 times");
        System.out.println("           Enter 2 to the Number in 10 times");
        System.out.println("           Enter 3 to the Number in 20 times");
        System.out.println("-------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your option");
        int Num = sc.nextInt();



            switch (Num) {
                case 1:
                    System.out.println("You choose 1 option, that means you have 5 times chance to Guess the Random Number !");

                    int i = 1;
                    int chance = 5;
                    while(i <=5){
                        System.out.println("********************* Enter your Guessing Number *******************");
                        int num1 = sc.nextInt();
                        if(num1 < randomNumber){
                            System.out.println("Your guessing Number is less than Random Number");
                            i++;
                            chance--;
                            System.out.println("********** You have " + chance + " chance to Guess the correct Number! **********");
                        } else if (num1 > randomNumber) {

                            System.out.println("Your guessing Number is grater than Random Number");
                            i++;
                            chance--;
                            System.out.println("********** You have " + chance + " chance to Guess the correct Number! **********");
                        }else if(num1 == randomNumber) {
                            System.out.println("----------Congratulations you win the game, You guess the correct Number !----------");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("You choose 2 option, that means you have 10 times chance to Guess the Random Number !");

                    int start = 1;
                    int chance2 = 10;
                    while(start <=10){
                        System.out.println("********************* Enter your Guessing Number *******************");
                        int num1 = sc.nextInt();
                        if(num1 < randomNumber){
                            System.out.println("Your guessing Number is less than Random Number");
                            start++;
                            chance2--;
                            System.out.println("********** You have " + chance2 + " chance to Guess the correct Number! **********");
                        } else if (num1 > randomNumber) {

                            System.out.println("Your guessing Number is grater than Random Number");
                            start++;
                            chance2--;
                            System.out.println("********** You have " + chance2 + " chance to Guess the correct Number! **********");
                        }else if(num1 == randomNumber) {
                            System.out.println("----------Congratulations you win the game, You guess the correct Number !----------");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("You choose 3 option, that means you have 20 times chance to Guess the Random Number !");

                    int srt = 1;
                    int chance3 = 20;
                    while(srt <=20){
                        System.out.println("********************* Enter your Guessing Number *******************");
                        int num1 = sc.nextInt();
                        if(num1 < randomNumber){
                            System.out.println("Your guessing Number is less than Random Number");
                            srt++;
                            chance3--;
                            System.out.println("********** You have " + chance3 + " chance to Guess the correct Number! **********");
                        } else if (num1 > randomNumber) {

                            System.out.println("Your guessing Number is grater than Random Number");
                            srt++;
                            chance3--;
                            System.out.println("********** You have " + chance3 + " chance to Guess the correct Number! **********");
                        }else if(num1 == randomNumber) {
                            System.out.println("----------Congratulations you win the game, You guess the correct Number !----------");
                            break;
                        }
                    }
                    break;
                // Additional case labels and code blocks
                default:
                    System.out.println("You select invalid option !");

            }
    }
}
