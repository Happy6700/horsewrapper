import java.util.ArrayList;

/** Madison Covey
 * Attempt two
 * horsewrapper
 */
public class horsewrapper {

   

    public static void main(String[] args) {
        
        Horse horse1=new Horse("Blake" , 2009);
        ArrayList <Horse> herd= new ArrayList <Horse>();
        herd.add(horse1);
     horse1=new Horse ("Max" , 2017);
      herd.add(horse1);
      horse1=new Horse ("Jeff" , 1989);
      herd.add (horse1);
      for(int x = 0; x < herd . size (); x++){
        System.out.println(herd.get (x ) . toString());
      }


    }

    
}