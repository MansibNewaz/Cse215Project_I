//**Name : Mohammad Mansib Newaz */
//**ID : 1931842642 */
//**Course : CSE 215.9 */
//**Course Instructor : M. Rashedur Rahman */

import java.util.ArrayList;

public class Registration {
    private ArrayList<Course> courseList = new ArrayList<Course>();

    public Registration() {

    }

    public void addCourse(Course course) {
        // this method will add a course to a student's course list
        if (course.getNumOfStudent() < course.getSeatCapacity()) {
            courseList.add(course);
        }

    }

    public void deleteCourse(Course course) {
        // this method will remove a specific course from the student course list
        courseList.remove(course);
        course.setNumOfStudent(-1);
    }

    public ArrayList<Course> getCourseList() {
        // it will return an array of Course Containing all the courses a student
        // registered for in a semester.
        return new ArrayList<Course>(courseList);
    }

}