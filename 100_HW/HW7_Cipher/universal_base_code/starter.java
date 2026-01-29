import pkg.*;
import java.util.Scanner;

public class starter {

	public static void main(String args[]) {
    String response = "";
    String message_encode = "";
    String message_decode = "";
    String message_decoded = "";
    String message_encoded = "";
    String response1 = " ";
    Scanner sc = new Scanner(System.in);
    System.out.println("Would you like to encode or decode a message?");
    response = sc.nextLine();
    if(response.equals("encode")||response.equals("Encode")){
       while (!response1.equals("no")){
           System.out.println("what message would you like to encode?");
        message_encode=sc.nextLine();
       message_encoded = Cipher.encode(message_encode);
       System.out.println("Your encoded message is :"+" "+message_encoded);
       System.out.println("Would you like to continue encoding messages?");
       response1=sc.nextLine();
           
       }
            
    }
    else{
        
        
        while (!response1.equals("no")){
           System.out.println("Would you like to decode by a certain number? (Yes,No)");
           String shift = sc.nextLine();
           if (shift.equals("Yes")||shift.equals("No")){
             System.out.println("What message do you want to decode?");
             message_decode=sc.nextLine();
             System.out.println("What key do you want to decode by?");
             int key=sc.nextInt();
       message_decoded = Cipher.keyedEncode(message_decode,key);
       System.out.println("Your decoded message is :"+" "+message_decoded);
       System.out.println("Would you like to continue decoding keyed messages?");
       response1=sc.nextLine();  
           }
        else{
        message_decode=sc.nextLine();
       message_decoded = Cipher.encode(message_decode);
       System.out.println("Your decoded message is :"+" "+message_decoded);
       System.out.println("Would you like to continue decoding messages?");
       response1=sc.nextLine();
        }
      
    }
    }
  }
}