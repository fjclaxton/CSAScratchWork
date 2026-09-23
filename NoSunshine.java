import java.util.ArrayList;
import java.util.List;

public class NoSunshine {
   public static void main(String[] args) {
      List<String> lyrics = List.of("Ain't no sunshine when she's gone", "It's not warm when she's away", "And she's always gone too long", "Anytime she goes away", "Wonder this time where she's gone", "Wonder if she's gone to stay", "And this house just ain't no home", "And I know, I know, I know, I know", "I know, I know, I know, I know, I know", "I know, I know");
      List nums = List.of(0,1,0,2,3,4,5,0,6,7,8,8,8,8,9);
      
      for (int i = 0; i<nums.size(); i++) {
         print(lyrics.get(Integer.parseInt(nums.get(i).toString())));
      }
      
   }
   public static void print(String st) {
      System.out.println(st);
   }
   public static void rep(int reps, String string) {
      for (int i = 0; i<reps; i++) {
         print(string);
      }
   }
   
}