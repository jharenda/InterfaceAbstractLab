package lab1;

import javax.swing.JOptionPane;

/**
 *  this is an abstract class to hold the prerequisites methods. I put it in a separate abstract class because
 * not all subclasses should use prerequisite methods, but could potentially be used by a number of subclasses and
 * I would not want to have to write the methods over and over again in those subclasses. 
 * It inherits the methods found in the Programming Course abstract class. 
 * @author Jennifer
 */
public abstract class AdvancedProgrammingCourse extends ProgrammingCourse {

    private String prerequisites;

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }
}
