package lab2;

/**
 *
 * @author Jennifer
 */
public class Startup {
 

    public static void main(String[] args) {
//         can't access subclass methods this way? 
//        The Liskov Substitution principle can be used when it is preferable to only access members of the superclass (abstract class)  and to not provide 
//        access to the members of the subclass.
//         can't do course1.setPrerequisites because ProgrammingCourse does not have that method
//        
//         I think that interfaces are a good choice for abstraction because you are forced to redeclare
//        all methods in subclasses and there is no chance of inheriting invisible properties/methods. 
//        Interfaces also just seem more flexiable because each method can be tailor, and therefore the interface can be more 
//        broadly used. Also, I like that Interfaces make it possible to set up rules for how a subclass should function, but allow the
//         acutual implementation of the functionality to be specified by each individual class. 
//        One bad thing about interfaces is that is can be more code writing and time spent. 

        ProgrammingCourse course1 = new AdvancedJavaCourse("Advanced Java", "152-002");
        ProgrammingCourse course2 = new IntroToProgrammingCourse("Intro to Programming", "152-009");
        ProgrammingCourse course3 = new IntroJavaCourse("Intro to Java", "152-129");

        AdvancedJavaCourse courseOne = new AdvancedJavaCourse("Advanced Java", "123");
        IntroToProgrammingCourse courseTwo = new IntroToProgrammingCourse("Intro to Programming", "345");
        IntroJavaCourse courseThree = new IntroJavaCourse("Intro Java", "678");

        course1.setCredits(.5);
        course2.setCredits(2);
        course3.setCredits(4);

        courseOne.setPrerequisites("Intro Java is a pre-req.");
        // courseTwo does not have access to any pre-req methods
        courseThree.setPrerequisites("Intro to Programming is a pre-req");
        // no subclass objects of type ProgrammingCourse (courses1-3) have access to pre-req, as ProgrammingCourse has no knowlegde
        // of the subclasses which implements those methods. 

        System.out.println(course1.getCourseName() + " " + course1.getCourseNumber());
        System.out.println(course1.getCredits());
        System.out.println(" ");

        System.out.println(course2.getCourseName() + " " + course2.getCourseNumber());
        System.out.println(course2.getCredits());
        System.out.println(" ");

        System.out.println(course3.getCourseName() + " " + course3.getCourseNumber());
        System.out.println(course3.getCredits());
        System.out.println(" ");

        System.out.println(courseOne.getCourseName() + " " + courseOne.getCourseNumber());
        System.out.println(courseOne.getCredits() + " " + courseOne.getPrerequisites());
        System.out.println("");

        System.out.println(courseTwo.getCourseName() + " " + courseTwo.getCourseNumber());
        System.out.println(courseTwo.getCredits() + " " + courseTwo.getCourseNumber());
        System.out.println("");

        System.out.println(courseThree.getCourseName() + " " + courseThree.getCourseNumber());
        System.out.println(courseThree.getCredits() + " " + courseThree.getCourseNumber());
    }
}
