import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //int val =0;
    //while (val<10){
      //System.out.println("Good morning");
      //val=val+1;
    //}
   for(int val=0;val<12;val++){
     System.out.println("Thanks");
   }
    int age =16;
    if (age>18){
      System.out.println("You can vote");
    
    }else if(age<=10 || age<=17){
      System.out.println("You are too young");
    }else{
      System.out.println("Voting at this age is a crime");
    }

    //Scanner pan = new Scanner(System.in);
    // System.out.println("How old are you? ");
    //int num = pan.nextInt();
    //System.out.println("I am "+num+" years old");

    //receiving string input
    Scanner pand = new Scanner(System.in);
    System.out.println("What is your name?");
    String pet =pand.nextLine();
    System.out.println("My name is"+pet);

  
    //System.out.println("Enter an amount ");
    //double am = pand.nextDouble();
    //System.out.println("The amount is "+am);
    int num =0;
    do{
      System.out.println("Thanks");
      num =num+1;
    }while(num<pet.length());
  }
}