/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Random;

class starter {
    public static String randName(){
        int rand = (int)(Math.random()*7);
        switch(rand){
            case 0: return "Dopey"; 
            case 1: return "Bashful";
            case 2: return "Grumpy";
            case 3: return "Sleepy";
            case 4: return "Sneezy";
            case 5: return "Happy";
            case 6: return "Doc";
            default: return "Happy";
        }
    }

    public static void main(String args[]) {
        
        PooleDwarf one = new PooleDwarf(randName(), (int)(Math.random()*100)+1);
        PooleDwarf two = new PooleDwarf(randName(), (int)(Math.random()*100)+1);
        PooleDwarf three = new PooleDwarf(randName(), (int)(Math.random()*100)+1);
        PooleDwarf four = new PooleDwarf(randName(), (int)(Math.random()*100)+1);
        PooleDwarf five = new PooleDwarf(randName(), (int)(Math.random()*100)+1);
        PooleDwarf six = new PooleDwarf(randName(), (int)(Math.random()*100)+1);

        
        int dopey = 0, bashful = 0, grumpy = 0, sleepy = 0, sneezy = 0, happy = 0, doc = 0;

        
        PooleDwarf[] dwarvesToCheck = {one, two, three, four, five, six};
        int index = 0;
        while(index < 6){
            PooleDwarf d = dwarvesToCheck[index];
            String n = d.getName();
            if(n.equals("Dopey")) dopey++;
            else if(n.equals("Bashful")) bashful++;
            else if(n.equals("Grumpy")) grumpy++;
            else if(n.equals("Sleepy")) sleepy++;
            else if(n.equals("Sneezy")) sneezy++;
            else if(n.equals("Happy")) happy++;
            else if(n.equals("Doc")) doc++;
            index++;
        }

        
        String mostName = "Dopey";
        int mostCount = dopey;

        if(bashful > mostCount){ mostName = "Bashful"; mostCount = bashful; }
        if(grumpy > mostCount){ mostName = "Grumpy"; mostCount = grumpy; }
        if(sleepy > mostCount){ mostName = "Sleepy"; mostCount = sleepy; }
        if(sneezy > mostCount){ mostName = "Sneezy"; mostCount = sneezy; }
        if(happy > mostCount){ mostName = "Happy"; mostCount = happy; }
        if(doc > mostCount){ mostName = "Doc"; mostCount = doc; }

        
        System.out.println(mostName + " was the name with " + mostCount + " matches!");
    }
}
