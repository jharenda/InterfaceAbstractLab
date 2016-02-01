package lab1;

/**
 *
 * @author Jennifer
 */
//New Comments- 1/30/16 2nd review. 
/**
 * Polymorphism- By having an abstract superclass which marks all methods as
 * abstract, each class extending the superclass is forced to inherit and
 * implement all of the methods which make up a ProgrammingCourse. Since all
 * courses therefore have all the ProgrammingCourse methods in common, they can
 * all temporally function as ProgrammingCourse objects instead of themselves.
 * That said, each class still retains their unique implementations of the
 * common methods because each method is overridden. (My array of
 * ProgrammingCourse objects which prints out the courseName for each class
 * prints the unique implementation of the courseName method. This is great
 * because it means that I can extend my superclass to many different courses
 * while knowing that the correct implementations for each different course will
 * be executed. I have discovered that when substituting a subclass instance
 * when a superclass instance is expected (ProgrammingCourse test = new
 * IntroToJavaCourse(); instead of ProgrammingCourse test = new
 * ProgrammingCourse(); ) that any methods/properties unique to a subclass ( for
 * example, the roomNumber method I created in the IntroToProgrammingCourse) are
 * not accessible. Those are only accessible when the object is of the type of
 * that class, which makes complete sense.  *
 *
 * LSP- To me, it seems like the LSP is simply a formal way of talking about the
 * intent of polymorphism and the Open-Close Principle. The LSP states that
 * subclasses should be substitutable for their super classes. In this program,
 * through the use of (mandatory) abstract superclass methods, I have ensured
 * the forced implementation of the methods mandated by the superclass, and as
 * such, I can expect that any subclass will function as the superclass does.  *
 * The Open-Close Principle states that classes should be open for extension,
 * but closed for modification”. What I think that this really means is that a
 * program should be designed in a way which mean that code shouldn’t have to be
 * changed every time requirements need to be added/changed. The main way in
 * which it is demonstrated in this program is that I can increase the
 * functionality of my program by adding in as many classes which implement the
 * ProgrammingCourse superclass and not have to worry about breaking anything/
 * having to make changes to the code that I have already written. Further, I
 * can add new concrete methods to the different subclasses (for example,
 * roomNumber() in the IntroToJavaCourse), and everything still works as
 * expected. I have also marked all concrete methods throughout all the classes
 * as “final” to ensure that they are not incorrectly overridden in the future.  *
 *
 *
 */
// end new comments. -----------------------------------------------------------
// First review: 
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

// PolyMorphism all classes have to be the same datatype is the superclass
// LSP- References to the base(superclass) can be replaced with a reference to the sub/derived class. If I come back in a month 
//and add another course to this program which extends the ProgrammingCourse Class, it will all still work. 
        ProgrammingCourse[] courses = {new AdvancedJavaCourse(), new IntroJavaCourse(), new IntroToProgrammingCourse()};
        courses[0].setCourseName("adv Java");

        courses[1].setCourseName("Intro Java");
        courses[2].setCourseName("Intro Programming");
        for (ProgrammingCourse pc : courses) {
            System.out.println(pc.getCourseName());
        }

        ProgrammingCourse advJava = new AdvancedJavaCourse();
        advJava.setCourseName("Advanced Java");
        advJava.setCredits(4);
//   
        System.out.println(advJava.getCourseName() + " " + advJava.getCredits());

        ProgrammingCourse course = new IntroToProgrammingCourse();
        course.setCredits(3);
        System.out.println(course.getCourseName());
        System.out.println(course.getCredits() + " " + course.getCourseNumber());

        IntroToProgrammingCourse course2 = new IntroToProgrammingCourse();
        course2.setCredits(4);
        System.out.println(course2.getCourseName() + " " + course2.getCourseNumber());
        System.out.println(course2.getCredits());

//        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java", "152-135", "fdsfs", 5);
//        advancedJava.setCredits(4);
//        advancedJava.setPrerequisites("Intro to Java");
//        System.out.println(advancedJava.getCourseName() + " " + advancedJava.getCourseNumber());
//        System.out.println(advancedJava.getCredits() + " " + advancedJava.getPrerequisites());
//
//        ProgrammingCourse advdJava = new AdvancedJavaCourse("Advanced Java", "152-135", "fdsfs", 5);
//        advdJava.setCredits(4);
//        System.out.println(advdJava.getCourseName() + " " + advdJava.getCourseNumber() + advdJava.getCredits());
        // Can't do following- ProgrammingCourse does not know about setPrerequisits
        //advJava.setPrerequisites("Intro Java ");
        //System.out.println(advJava.getPrerequisites());
        // So prequisites only works when creating an object of the subclass and not when the ojbect is of type superclass? 
        IntroJavaCourse introJava = new IntroJavaCourse();
        introJava.setCourseName("Intro to Java");
        introJava.setPrerequisites("Intro to Programming");
        introJava.setCredits(2);
        System.out.println(introJava.getCourseName() + " " + introJava.getCourseNumber());
        System.out.println(introJava.getCredits() + " " + introJava.getPrerequisites());

        ProgrammingCourse intJava = new IntroJavaCourse();
        intJava.setCredits(3);
        System.out.println(intJava.getCourseName() + " " + intJava.getCourseNumber() + " " + intJava.getCredits());
    }
}
