import java.util.List;
import java.util.ArrayList;
public class ProjectEuler {

    public static long problem0() {
      int max = 259000;
      long sum = 0;
      for(int i = 0; i<=max; i++) {
         if ((Math.pow(i,2) % 2) !=0) {
            sum +=Math.pow(i,2);
         }
      }
    
      return sum;
    }
    
    
    
    public static void main(String[] args) {
      System.out.println(problem0());
      //System.out.println(problem1006());
    }

}