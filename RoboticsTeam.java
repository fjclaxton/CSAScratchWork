import java.util.Scanner;
public class RoboticsTeam {
   public static void main(String[] args) {
      String teamName = "Viking Robotics";
      int numOfMembers; //number of total members in the club
      int numOfMentors; //number of mentors in the club
      int numOfStudents;
      int totalRobotScoring; //total amount of game objects scored across all matches
      int matchesPlayed; //total amount of matches played during season
      double avRobotScoring; //average amount of game objects scored across all matches
      boolean hasWonMatch; //has won a match during the past season
      
      numOfMembers = 40;
      totalRobotScoring = 576;
      hasWonMatch = true;
      
      System.out.println("How many matches has team 2928 "+teamName+" played this season?");
      
      Scanner scan = new Scanner(System.in);
      matchesPlayed = Integer.parseInt(scan.nextLine()); //converts the string value from the scanner input to an int value
      
      avRobotScoring = totalRobotScoring/matchesPlayed;
      System.out.println("The average amount scored per match is " +avRobotScoring);
      
      System.out.println("\nHow many mentors are in the club?");
      numOfMentors = Integer.parseInt(scan.nextLine()); //converts the string value from the scanner input to an int value
      scan.close();
      
      System.out.println("\nThe total amount of members in the club is "+numOfMembers+".");
      numOfStudents = numOfMembers-numOfMentors;
      System.out.println("There are "+(numOfStudents)+" students in the club.");
      System.out.println("Average amount of points scored by the robot, per student in the club is "+(avRobotScoring/numOfStudents)+".");
   }
}