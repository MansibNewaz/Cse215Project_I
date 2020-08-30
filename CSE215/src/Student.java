//**Name : Mohammad Mansib Newaz */
//**ID : 1931842642 */
//**Course : CSE 215.9 */
//**Course Instructor : M. Rashedur Rahman */

import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private double cgpa;
    Registration reg;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public int creditlimit() {
        if (this.cgpa > 3.50) {
            return 18;
        } else {
            return 12;
        }
    }

    public void getStudent() {
        System.out.println("Name :" + name);
        System.out.println("id :" + id);
        System.out.println("cgpa :" + cgpa);

    }

    // creating new reg for new student object
    public void makenewReg() {
        this.reg = new Registration();

    }

    public void addCourse(Course course) {
        if ((this.cgpa >= 3.50) && (reg.getCourseList().size() < 6)) {
            reg.addCourse(course);
            course.setNumOfStudent(+1);

        }
        if ((this.cgpa < 3.50) && (reg.getCourseList().size() < 4)) {
            reg.addCourse(course);
            course.setNumOfStudent(+1);

        }
        if ((this.cgpa < 3.50) && (reg.getCourseList().size() == 4)) {
            System.out.println(
                    this.name + ":You cannot Take" + course.getId() + "Your credit Limit is :" + creditlimit());
        }
        if ((this.cgpa > 3.50) && (reg.getCourseList().size() == 6)) {
            System.out.println(
                    this.name + ":You cannot Take" + course.getId() + "Your credit Limit is :" + creditlimit());
        }
    }

    // Todo this method returns a course object if it is offeredin a semester;
    // Todo Hint : Call the addCourse() method of Registration class from this;
    // Todo method;

    public void dropCourse(Course course) {
        // you need to decrease the number of students for that course and delete that
        // ? course from the array of Course.
        reg.deleteCourse(course);
        course.setNumOfStudent(-1);

    }

    public Registration getRegistration() {
        // todo return a object of Registration created during makeregistration()
        return reg;

    }

    public String printRegisteredCourse() {
        // will return the course id and course title of all the rgeistered course of a
        // student\
        ArrayList<Course> courseList = reg.getCourseList();
        String info = null;
        System.out.println("===============================================");

        System.out.println("Course Id:       Course Title:");
        for (Course item : courseList) {
            System.out.println(item.getId() + "       " + item.getTitle());
        }
        System.out.println("===============================================");
        return info;

    }

    @Override
    public String toString() {
        return "Student [cgpa=" + cgpa + ", id=" + id + ", name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public Registration getReg() {
        return reg;
    }

    public void setReg(Registration reg) {
        this.reg = reg;
    }

}
