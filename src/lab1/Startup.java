package lab1;

/**
 *
 * @author Jennifer
 */
// In terms of what is good/ bad about this structure of having an abstract superclass- it would be possible to inherit  superclass memebers
//that we don't know about (for example, the final pre-req and credit methods), which means. 1. They could not be utilized because we (the subclass author)
//don't know about them, which makes for a poorly designed program. 2. Or the sub class authors have to have the documentation of and the time to
//research the superclass methods.  
//Further, unless the concrete superclass methods are marked final, the sub-class authors could easily override the methods in an inappropriate way. 
// It seems that overall, abstract super classes (vs interfaces) require a lot more careful and even more deliberate consideration and organization.
// One good thing about astract superclasses is that it is possbile to enforce both the behavoir and the implemenation of the methods in subclasses. 
// I think that using the Liskov Substitution Principle is useful when it is necessary to limit the object being created to the properties/
//methods of the superclass. It wouldn't have access to the subclass methods and properties because there would be no way
//for the subclass to know about them. Obviously it is not advantageous when access to those subclass members is needed. Additionally,
//it may end up accessing the wrong implementation of a method? - You would get the superclass version and not the subclass version that was expected.
public class Startup {

    public static void main(String[] args) {

        ProgrammingCourse course = new IntroToProgrammingCourse("Intro Programming", "152-001");
        // does not have prerequisites! 
        //course.setPrerequisites
        course.setCredits(3);
        System.out.println(course.getCourseName());
        System.out.println(course.getCredits() + " " + course.getCourseNumber());

        // doesn't have prereq. this way either
        IntroToProgrammingCourse course2 = new IntroToProgrammingCourse("Intro to Programming", "152-003");
        course2.setCredits(4);
        System.out.println(course2.getCourseName() + " " + course2.getCourseNumber());
        System.out.println(course2.getCredits());
        System.out.println(course.getCapitalizedCourseName());

        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java", "152-135");
        advancedJava.setCredits(4);
        advancedJava.setPrerequisites("Intro to Java");
        System.out.println(advancedJava.getCourseName() + " " + advancedJava.getCourseNumber());
        System.out.println(advancedJava.getCredits() + " " + advancedJava.getPrerequisites());

        ProgrammingCourse advJava = new AdvancedJavaCourse("advJava", "1234");
        advJava.setCredits(4);
        System.out.println(advJava.getCourseName() + " " + advJava.getCourseNumber() + advJava.getCredits());
        // Can't do following- ProgrammingCourse does not know about setPrerequisits
        //advJava.setPrerequisites("Intro Java ");
        //System.out.println(advJava.getPrerequisites());

        // So prequisites only works when creating an object of the subclass and not when the ojbect is of type superclass? 
        IntroJavaCourse introJava = new IntroJavaCourse("Intro Java", "123-456");
        introJava.setPrerequisites("Intro to Programming");
        introJava.setCredits(2);
        System.out.println(introJava.getCourseName() + " " + introJava.getCourseNumber());
        System.out.println(introJava.getCredits() + " " + introJava.getPrerequisites());

        ProgrammingCourse intJava = new IntroJavaCourse("int. Java", "345-345");
        intJava.setCredits(3);
        System.out.println(intJava.getCourseName() + " " + intJava.getCourseNumber() + " " + intJava.getCredits());
    }
}
