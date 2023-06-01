import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class rock_Paper_Scissors_game {
    public static void main(String[] args) {
        String You = null;
        String computer = null;
        Random rnd = new Random();
        int ai = rnd.nextInt(3);
        Scanner in = new Scanner(System.in);
        System.out.println("<---------[ Let's Start ]---------->");
        System.out.println("Enter a number b/w (0 to 2) :\nWhere,\n0=Rock\n1=Paper\n2=Scissor\nInput Here: ");
        byte slct = in.nextByte();
        while (slct > 2) {
            System.out.println("give number between 0 and 2");
            slct = in.nextByte();
        }
        //Users Turn
        if(slct==0){
            You = "ROCK";
            System.out.println("You Select =" +You);
        }
        else if(slct==1){
            You = "PAPER";
            System.out.println("You Select =" +You);
        }
        else if(slct==2){
            You = "SCISSOR";
            System.out.println("You Select =" +You);
        }
        //Computers Turn
        if(ai==0){
            computer = "ROCK";
            System.out.println("Computer Selected =" +computer);
        }
        else if(ai==1){
            computer = "PAPER";
            System.out.println("Computer Selected =" +computer);
        }
        else if(ai==2){
            computer = "SCISSOR";
            System.out.println("Computer Selected =" +computer);
        }

        //Comparing You and Ai
        if(You.equals(ai)){
            System.out.println("Match Tie !");
        }
        else if (You.equals("ROCK") && computer.equals("PAPER")) {
            System.out.println("COMPUTER WONS !");
        }
        else if (You.equals("PAPER") && computer.equals("ROCK")) {
            System.out.println("YOU WON !");
        }
        else if (You.equals("ROCK") && computer.equals("SCISSOR")) {
            System.out.println("YOU WON !");
        }
        else if (You.equals("SCISSOR") && computer.equals("ROCK")) {
            System.out.println("COMPUTER WONS !");
        }
        else if (You.equals("SCISSOR") && computer.equals("PAPER")) {
            System.out.println("YOU WON !");
        }
        else if (You.equals("PAPER") && computer.equals("SCISSOR")) {
            System.out.println("COMPUTER WONS !");
        }
    }
}
