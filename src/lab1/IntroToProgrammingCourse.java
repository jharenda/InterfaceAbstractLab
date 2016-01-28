package lab1;

import javax.swing.JOptionPane;

/**
 * This class is responsible for getting and setting its name and number. It
 * inherits its get/set credits and prerequisites from the ProgrammingCourse
 * super class.
 *
 * @author Jennifer
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {

    private String courseName;
    private String courseNumber;
// 

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
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

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

}
