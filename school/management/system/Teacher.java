package school.management.system;

/**
 * keep track of teachers name, id, and salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * creates new teacher object
     *
     * @param id     id for the teacher
     * @param name   name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return name of the teacher
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return salary of teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     * set the salary
     *
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * adds to salary
     * removes from the total money earned by school
     *
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Name of the teacher: " + name
                +"Total salary earned so far $"
                + salaryEarned;
    }
}