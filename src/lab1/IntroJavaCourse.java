package lab1;

import javax.swing.JOptionPane;

/**
 * This class is responsible for it's credits, courseName, courseNumber, and
 * prerequisites. All are methods/ properties made mandatory by the superclass.
 * 
 * All Methods are mandatory and known because they are all abstract in superclass. 
All are marked final to ensure adherence to the open-close principle (closed to change).
These methods may not change or be inappropriately over-ridden elsewhere, so they should not break. 
I could add concrete methods here /elsewhere in the program (open to extension), 
but I would have to consider making the final to ensure that those don't break. 
Because it extends a class which mandates a set of methods, it is in a way closed to change.
I cannot change what must be here, but it is still open for me to add additional methods not 
dictated by the superclass.
 * 
 * 
 * Because all methods are abstract in the superclass, I have forced awareness of them, no pre-defined original intention
* is over-ridden because none was provided, no poorly written code was inherited, 
* and because all of the methods provided are applicable to this class (and all courses in general). all the dangers of concrete inheritance
have been eliminated.
 * @author Jennifer
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    private double credits;
    private String courseName;
    private String courseNumber;
    private String prerequisites;

    @Override
    public final void setCourseNumber(String courseNumber) {

        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = "5";
    }

    @Override
    public final void setCourseName(String courseName) {
        if (courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = "Intro Java";
    }

    @Override
    public final void setCredits(double credits) {
        this.credits = credits;
    }

    @Override
    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public final double getCredits() {
        return this.credits;
    }

    @Override
    public final String getCourseName() {
        return "A course is: " + this.courseName;
    }

    @Override
    public final String getCourseNumber() {
        return this.courseNumber;
    }

    @Override
    public final String getPrerequisites() {
        return this.prerequisites;
    }

}
