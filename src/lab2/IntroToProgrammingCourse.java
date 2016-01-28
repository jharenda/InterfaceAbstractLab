package lab2;

import javax.swing.JOptionPane;

/**
 * The intro to Programming Course Class is responsible for storing the Course
 * Name, Course Number, and Credits for itself. It must implement all the
 * methods found in the ProgrammingClass interface. There is no prerequisites
 * methods for this class.
 *
 * @author Jennifer
 * @version 1.00
 */
public class IntroToProgrammingCourse implements ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public double getCredits() {
        return credits;
    }

    public String getCourseName() {
        return courseName;
    }

}
