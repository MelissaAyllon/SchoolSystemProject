package org.example;

import java.util.List;
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * New school is created
     * @param teachers in school
     * @param students in school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /**
     * Get the list of all teacher
     * @return teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adding new teachers to the school
     * @param teacher new teacher
     */
    public void setTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Showing list of all students
     * @return list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adding new student to the register
     * @param student
     */
    public void setStudents(Student student) {
        students.add(student);
    }

    /**
     * Get the actual money earned
     * @return earned money
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Set new incomes
     * @param totalMoneyEarned new income
     */
    public void updateMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned += totalMoneyEarned;
    }

    /**
     * money spent till now
     * @return money
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * set new outlays
     * @param totalMoneySpent
     */
    public void updateMoneySpent(int totalMoneySpent) {
        this.totalMoneyEarned -= totalMoneySpent;
        this.totalMoneySpent += totalMoneySpent;
    }

    /**
     * Make the respective payment
     * to every teacher
     * & update the money spent
     */
    public void doPayments(){
        int monthPayment = 0;
        for(Teacher teacher: this.teachers){
            monthPayment += teacher.getSalary();
        }
        updateMoneySpent(monthPayment);
    }
}
