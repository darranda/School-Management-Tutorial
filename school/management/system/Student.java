package school.management.system;


//keep track of students fee, names, anf grade
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //constructor- create new student by initializing
    /**
     * Fees for students is $30,000.
     * Fees paid initially is 0.
     * @param id id for the student: unique
     * @param name name of student
     * @param grade grade of student
     */
    public Student (int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    // not altering students names, students id

    /**
     * to update students grade
     * @param grade new grade
     */

    public void setGrade (int grade){
        this.grade = grade;
    }

    /**
     * keep adding fees to feesPaid
     * school receives fees
     * @param fees fees the student pays
     */
    public void payFees (int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    /**
     *
     * @return id of student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees of student
     */

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name : "+name+
                "Total fees paid so far "+ feesPaid;

    }
}