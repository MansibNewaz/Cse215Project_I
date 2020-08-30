//**Name : Mohammad Mansib Newaz */
//**ID : 1931842642 */
//**Course : CSE 215.9 */
//**Course Instructor : M. Rashedur Rahman */

// ** Each course consists of id, title, credit, tuition per credit, number of students, and
// ** seat capacity.
public class Course {
    private String id;
    private String title;
    private int credit;
    private int tuitionPerCredit;
    private int numOfStudent = 0;
    private int seatCapacity = 3;

    Course(String id, String title, int credit, int tuitionPerCredit) {
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.tuitionPerCredit = tuitionPerCredit;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTuitionPerCredit() {
        return tuitionPerCredit;
    }

    public void setTuitionPerCredit(int tuitionPerCredit) {
        this.tuitionPerCredit = tuitionPerCredit;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public void setNumOfStudent(int add) {
        this.numOfStudent = this.numOfStudent + add;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = this.seatCapacity + seatCapacity;
    }

    @Override
    public String toString() {
        return "Course [credit=" + credit + ", id=" + id + ", numOfStudent=" + numOfStudent + ", seatCapacity="
                + seatCapacity + ", title=" + title + ", tuitionPerCredit=" + tuitionPerCredit + "]";
    }

}
