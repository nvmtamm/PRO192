/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Fresher extends Dev implements ITraining{

    private boolean fullstack;

    public Fresher() {
        super();
        fullstack=true;
    }

    public Fresher(boolean fullstack, String programlanguage, int id, String name, String password, int salary) {
        super(programlanguage, id, name, password, salary);
        this.fullstack = fullstack;
    }

    @Override
    public String toString() {
        return super.toString() +","+ this.fullstack;
    }
     
    @Override
    public double getIncome() {
       if(this.fullstack)
           return getSalary()*1.1;
       return getSalary();
    }

    @Override
    public void doTraining() {
        System.out.println("Freshs must enroll a management training program");
    }
    
}
