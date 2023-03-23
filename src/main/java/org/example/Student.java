package org.example;

/**
 * This class is for tracking every student
 * with the payments
 **/

public class Student {
    private String studentId;
    private String name;
    private int grade;
    private float feesPaid;
    private float feesTotal;

    /**
     * Constructing a new student
     * @param studentId
     * @param name
     * @param grade
     */
    public Student(String studentId, String name, int grade){
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    /**
     * Setting a new grade
     * @param grade school term
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * A student has pay some fees
     * @param fees payment
     */
    public void updateFeesPaid(float fees){
        feesPaid += fees;
    }

    /**
     *
     * @return student id
     */
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public float getFeesPaid() {
        return feesPaid;
    }

    public float getFeesTotal() {
        return feesTotal;
    }

    public float getRemainingAm(){
        return feesTotal-feesPaid;
    }
}
