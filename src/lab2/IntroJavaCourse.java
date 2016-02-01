package lab2;

/**
 * This class stores course name, number, credits and prerequisites for an intro
 * to Java Course. It must implement all the methods provided in the interface. Prerequisites 
 * is not included in the interface. 
 *
 *  1/30/16 Changes: 
 * Marked all concrete methods final to adhered to open-close principle. Is this correct? 
 * 
 * All Methods are mandatory and known because they all come from an interface. 
All are marked final to ensure adherence to the open-close principle (closed to change).
These methods may not change or be inappropriately over-ridden elsewhere, so they should not break. 
I could add concrete methods here /elsewhere in the program (open to extension), 
but I would have to consider making the final to ensure that those don't break. 
Because it implements an interface which mandates a set of methods, it is in a way closed to change.
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
public class IntroJavaCourse implements ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        this.credits = credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
