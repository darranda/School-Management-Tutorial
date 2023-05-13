package school.management.system;
import java.util.List;
/**
 * many teachers, many students
 * implement teacher and students using ArrayList
 */
public class School {
    private List <Teacher> teachers;
    private List <Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object created
     * @param teachers list of teachers
     * @param students list of students
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return list of teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
       teachers.add(teacher);
    }

    /**
     *
     * @return list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * adds student
     * @param student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return total money earned by school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * adds total money earned by the school
     * @param MoneyEarned money to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return total money spent by school
     */
    public int getTotalMoneySpent() {

        return totalMoneySpent;
    }

    /**
     * update money spent by the school/ teachers salary
     * @param moneySpent money spent by the school
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
