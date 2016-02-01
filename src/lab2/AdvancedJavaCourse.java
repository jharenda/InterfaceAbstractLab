package lab2;

import javax.swing.JOptionPane;

/**
 * The Advanced Java Course class is responsible for storing the Course Name,
 * Course Number, Credits and Prerequisites for itself. 
 *
 * 1/30/16 Changes: Marked all concrete methods final to adhered to open-close principle. Is this correct? 
 * 
 * 
 * 
 * All Methods are mandatory and known because they all come from an interface. 
All are marked final to ensure adherence to the open-close principle (closed to change).
These methods may not change or be inappropriately over-ridden elsewhere, so they should not break. 
I could add concrete methods here /elsewhere in the program (open to extension), 
but I would have to consider making the final to ensure that those don't break. 
because it implements an interface which mandates a set of methods, it is in a way closed to change.
I cannot change what must be here, but it is still open for me to add additional methods not 
dictated by the superclass.
* 
* 
* Because all methods come from an interface, I have forced awareness of them, no pre-defined original intention
* is over-ridden because none was provided, no poorly written code was inherited, 
* and because all of the methods provided are applicable to this class (and all courses in general). all the dangers of concrete inheritance
have been eliminated.
 * @author Jennifer
 * @version 1.00
 */
public class AdvancedJavaCourse implements ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;



    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public  final void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public final double getCredits() {
        return credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public final String getCourseName() {
        return courseName;
    }
// should methods be declared final in subclasses? 

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

}
