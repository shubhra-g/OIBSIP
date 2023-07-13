import java.util.Random;
import java.util.Scanner;
class main{
   public static void main(String[] args) {

    Random rand=new Random();
int guess_count=0;
int guess_limit=5;    int random_number=rand.nextInt(100)+1;

    System.out.println("Random number is "+random_number);
while(true){
     System.out.println("enter your choice /guess (1-100):");
      
     Scanner sc=new Scanner(System.in);
     while(guess_limit>0){
        guess_count++;
     int guess=sc.nextInt();
     if(guess==random_number){
     System.out.println("correct you win!");
     System.out.println("game closed ");
     break;
    }
    
    
     else if(random_number<guess)
     System.out.println("OOPS the number is higher enter again");
     else
     System.out.println("OOPS the number is lower enter again");
      if(guess_count==guess_limit)
        {
          System.out.println("you lose.Limit is up ");
          break;
        }
        
   
}
System.out.println("the total numbe of guesses made is "+guess_count);
}
}}