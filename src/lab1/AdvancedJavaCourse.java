package lab1;

import javax.swing.JOptionPane;

/**
 * This class is responsible for it's own name and course number. It gets
 * credits and prerequisites from the superclass. It inherits from the
 * AdvancedProgrammingCourse superclass, which in turn, inherits from the
 * ProgrammingCourse superclass.
 *
 * @author Jennifer
 * @version 1.00
 */
public class AdvancedJavaCourse extends AdvancedProgrammingCourse {

    private String courseName;
    private String courseNumber;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }
// Doesn't require an override? I do not understand. 

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

}
