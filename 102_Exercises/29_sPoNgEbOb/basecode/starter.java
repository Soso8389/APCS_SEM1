import java.util.*;

class starter {
	public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a phrase");
     String phrase = sc.nextLine();
     String newphrase = "";
     boolean upUpDownDownLeftRightLeftRightBAstart = false;
     for(int i = 0;i<phrase.length();i++){
     	if (upUpDownDownLeftRightLeftRightBAstart == true){
     		newphrase += phrase.substring(i,i+1).toUpperCase();
     		upUpDownDownLeftRightLeftRightBAstart = false;
     	}
        else{
        	newphrase += phrase.substring(i,i+1).toLowerCase();
        	upUpDownDownLeftRightLeftRightBAstart = true;
        }
     }
     System.out.println(newphrase);
	}
}