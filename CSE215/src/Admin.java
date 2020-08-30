//**Name : Mohammad Mansib Newaz */
//**ID : 1931842642 */
//**Course : CSE 215.9 */
//**Course Instructor : M. Rashedur Rahman */

import java.util.List;
//**The university has an admin who manages the courses offered in a semester and
//**publishes the offered courses list to the students. The admin can increase the seat
//**capacity of a specific course, and can see the status (how many students registered for
//**that course, its seat capacity, etc. ) of any of the courses. **//

// Todo : Constructors,
public class Admin {
    CurrentOfferedCourse semCourse = new CurrentOfferedCourse();

    public Admin() {
    }

    public void offerCourse(Course course) {
        semCourse.addcourse(course);
    }

    public void publishOfferedCourse() {
        List<Course> cList = semCourse.getCourseList();

        int i = 1; // ! how to set loop using given that i have used already one for loop for
                   // class.
        for (Course item : cList) {

            System.out.println(i++ + "Course Id :" + item.getId());
        }
    }
    // it will print all the courses offered in a semester with course id

    public void increaseSeatCapacity(Course course, int size) {
        course.setSeatCapacity(size);

        // this method will increase the seat capacity of a specified course by that
        // size.
    }

    public void seeCourseStatus() {
        List<Course> cList = semCourse.getCourseList();
        for (Course item : cList) {
            System.out.println("Course Id :" + item.getId() + ", Seat Capacity" + item.getSeatCapacity()
                    + "Number of Student " + item.getNumOfStudent());
        }
    }
    // it will print all the offered courses with course id, number of students
    // enrolled in and seat capacity of that course.
}
