package org.example;

/**
 * Keeping track of teachers
 * and the bills the schools
 * have to pay for
 */
public class Teacher {
    private String id;
    private String name;
    private double salary;

    /**
     * Constructing a new teacher
     * @param id unique identifyer
     * @param name of the teacher
     * @param salary of the teacher
     */
    public Teacher(String id, String name, double salary){
        this.id = id;
        this.name = id;
        this.salary = salary;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
