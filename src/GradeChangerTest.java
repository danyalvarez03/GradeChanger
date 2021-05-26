/*

      File:  GradeChanger.java

      Programmer:  Daniel A. Alvarez

      Purpose:  Enable the user to replace a student’s given grade in a course with a new one, 
                to add a new course grade, and to compute the GPA.

      I affirm that this class is entirely my own work and none of it is the work of anyone else.

*/
public class GradeChangerTest {

   public static void main(String[] args) 
   {
     //1
     GradeChanger Student1 = new GradeChanger (60, 3.0);
     //2
     System.out.println("The initial amount of credits is " + Student1.getCredits() + 
             " , and the initial grade points are " + Student1.getGradepoints());
     //3
     System.out.println("The initial GPA is: " + Student1.GPA());
     //4
     Student1.addClass(3, 3.67);
     //5
     System.out.println("The updated amount of credits is " + Student1.getCredits() + 
             " , and the updated grade points are " + Student1.getGradepoints());
     //6
     System.out.println("The updated GPA is: " + Student1.GPA());
     //7
     Student1.addClass(4, 4.0);
     //8
     System.out.println("The new amount of credits is " + Student1.getCredits() + 
             " , and the new grade points are " + Student1.getGradepoints());
     //9
     System.out.println("The new GPA is: " + Student1.GPA());
     //10
     Student1.changeClass(3, 3.0, 3, 4.0);
     //11
     System.out.println("The final amount of credits is " + Student1.getCredits() + 
             " , and the final grade points are " + Student1.getGradepoints());
     //12
     System.out.println("The final GPA is: " + Student1.GPA());
   }
    
}
