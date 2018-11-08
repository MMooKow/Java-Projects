/*
Class to create trolls and hero character
 */
package laststand;

public class Characters {
    
private int life = 20, trolls = 0;

public void hero(){
    for (int x = life; x>=0; x-=3){
        System.out.println("Your hero swings and defeats an evil troll, but takes 3 damage points." );
        trolls += 1;
    }

        
}   
public void fin(){
    System.out.print("Your hero faught valiantly deafeated ");
    System.out.print(trolls);
    System.out.println(" trolls.");
    System.out.println("But alas, your hero is no more.");
}

        
    

    
}
