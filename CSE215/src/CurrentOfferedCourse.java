//**Name : Mohammad Mansib Newaz */
//**ID : 1931842642 */
//**Course : CSE 215.9 */
//**Course Instructor : M. Rashedur Rahman */

import java.util.ArrayList;
import java.util.List;

public class CurrentOfferedCourse {
    ArrayList<Course> cList = new ArrayList<Course>();

    public CurrentOfferedCourse() {
    }

    // will take course as object and store it in course array.
    public void addcourse(Course course) {
        cList.add(course);
    }

    // ** this method will return a course object if it is offered in this semester.
    public Course getCourse(Course course) {
        return course;
    }

    // *this method will return an array of course offered in this semester

    public List<Course> getCourseList() {
        return cList;
    }

    public CurrentOfferedCourse(ArrayList<Course> cList) {
        this.cList = cList;
    }
}
