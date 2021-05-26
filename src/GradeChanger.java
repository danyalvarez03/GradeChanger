/*

      File:  GradeChanger.java

      Programmer:  Daniel A. Alvarez

      Purpose:  Enable the user to replace a student’s given grade in a course with a new one, 
                to add a new course grade, and to compute the GPA.

      I affirm that this class is entirely my own work and none of it is the work of anyone else.

*/
public class GradeChanger 
{
    private int creditsEarned;
    private double totalGradepoints;
    
    public GradeChanger(int totalCredits,double GPA)
    {
        creditsEarned = totalCredits;
        totalGradepoints = GPA * totalCredits;
    }
    
    public int getCredits()
    {
        return creditsEarned;
    }
    
    public double getGradepoints()
    {
        return totalGradepoints;
    } 
    
    public void addClass(int classCredits, double classGrade)
    {
        creditsEarned = creditsEarned + classCredits;
        totalGradepoints = totalGradepoints + classGrade * classCredits;
    }
    
    public void changeClass(int oldCredits, double oldGrade, int newCredits, double newGrade)
    {
        creditsEarned = creditsEarned - oldCredits + newCredits;
        totalGradepoints = totalGradepoints - oldGrade * oldCredits + newGrade * newCredits;
    }
    
    public double GPA()
    {
       return totalGradepoints / creditsEarned; 
    }
}
