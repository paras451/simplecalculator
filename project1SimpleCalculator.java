import java.util.Scanner;
public class project1SimpleCalculator {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        while (true) { 
            System.out.println("ENTER FIRST NUMBER"); 
            int num1=scanner.nextInt();

            System.out.println("ENTER AN OPERATION(+,-,*,/)");
            char operator=scanner.next().charAt(0);

            System.out.println("ENTER SECOND NUMBER");
            int num2=scanner.nextInt();

           int result;

           switch(operator){
            case '+' -> result=num1+num2;

            case '-' -> result=num1-num2;

            case '*' -> result=num1*num2;

            case'/' -> {
                if(num2!=0){
                    result=num1/num2;
                }
                else{
                    System.out.println("ERROR ! DIVISION BY ZERO.");
                    continue;
                }   }
           default -> {
            System.out.println("INVALID OPERATOR");
               continue;
                }

          
           }

           System.out.println("THE RESULT IS: " + result);

           System.out.println("DO YOU WANT TO PERFORM ANOTHER CALCULATION?(YES/NO):");
           String choice=scanner.next();

           if(!choice.equalsIgnoreCase("YES")){
            System.out.println("HAPPY CODING!");
            break;
           }
           


        }
        scanner.close();
    
    }
}

    
    

