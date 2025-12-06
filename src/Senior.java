/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Senior extends Dev implements IRequest{

    private int bonus;
    private int experience;

    public Senior() {
        super();
        this.bonus=0;
        this.experience=0;
    }

    public Senior(int bonus, int experience, String programlanguage, int id, String name, String password, int salary) {
        super(programlanguage, id, name, password, salary);
        this.bonus = bonus;
        this.experience = experience;
    }
    
    @Override
    public double getIncome() {
        return getSalary()+bonus+experience;
    }

    @Override
    public void sendRequestDayOff() {
          System.out.println("Seniors will be requested " + IRequest.dayoff_senior+"/m");     
    }
    
}
