package lab1;

import javax.swing.JOptionPane;

/**
 * This is the abstract class used
 *
 * @author Jennifer
 */
public abstract class ProgrammingCourse {

    private double credits;

    public final void setCredits(double credits) {
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
// not specialized versions of methods, hence being in superclass

    public abstract void setCourseNumber(String courseNumber);

    public abstract String getCourseNumber();

    public abstract void setCourseName(String courseName);

    public abstract String getCourseName();

    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

}
