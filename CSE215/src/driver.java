//**Name : Mohammad Mansib Newaz */
//**ID : 1931842642 */
//**Course : CSE 215.9 */
//**Course Instructor : M. Rashedur Rahman */

public class driver {
    public static void main(String[] args) {
        Course CSE115 = new Course("CSE115", "Programming Language-I", 3, 6000);
        Course CSE173 = new Course("CSE173", "Discrete Mathematics", 3, 6000);
        Course CSE215 = new Course("CSE215", "Programming Language-II", 3, 6000);
        Course CSE225 = new Course("CSE225", "Data Structures and Algorithms", 3, 6000);
        Course CSE231 = new Course("CSE231", "Digital Logic Design", 3, 6000);
        Course CSE311 = new Course("CSE311", "Database Systems", 3, 6000);
        Course CSE323 = new Course("CSE323", "Operating Systems Design", 3, 6000);
        Course CSE373 = new Course("CSE373", "Design and Analysis of Algorithms", 3, 6000);
        Student s1 = new Student("Farhan Islam", 1631728042, 2.70);
        Student s2 = new Student("Sadia Sultana", 1821347042, 3.44);
        Student s3 = new Student("Sanjida Akter", 2021746042, 3.65);
        Student s4 = new Student("Farhan Bhuiyan", 1923147042, 3.94);
        Student s5 = new Student("Mahmudul Hoque", 1524137042, 2.14);

        Admin admin1 = new Admin();
        admin1.offerCourse(CSE115);
        admin1.offerCourse(CSE173);
        admin1.offerCourse(CSE215);
        admin1.offerCourse(CSE225);
        admin1.offerCourse(CSE231);
        admin1.offerCourse(CSE311);
        admin1.offerCourse(CSE323);
        admin1.offerCourse(CSE373);
        admin1.publishOfferedCourse();

        s1.makenewReg();
        s1.addCourse(CSE115);
        s1.addCourse(CSE173);

        s2.makenewReg();
        s2.addCourse(CSE115);
        s2.addCourse(CSE215);
        s2.addCourse(CSE225);

        s3.makenewReg();
        s3.addCourse(CSE115);
        s3.addCourse(CSE225);
        s3.addCourse(CSE311);
        admin1.seeCourseStatus();
        s4.makenewReg();
        s4.addCourse(CSE115);
        s4.addCourse(CSE225);

        s5.makenewReg();
        s5.addCourse(CSE115);
        s5.addCourse(CSE173);
        s5.addCourse(CSE215);
        admin1.increaseSeatCapacity(CSE115, 2);
        s3.addCourse(CSE173);
        s3.addCourse(CSE215);
        s3.addCourse(CSE231);
        s3.addCourse(CSE323);
        s5.addCourse(CSE311);
        s5.addCourse(CSE373);
        admin1.seeCourseStatus();
        s3.dropCourse(CSE311);
        s3.printRegisteredCourse();
    }

}