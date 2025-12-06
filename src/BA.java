/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class BA extends Staff implements IRequest,ITraining{
    private String field;

    public BA() {
        super();
        field="traffic";
    }

    public BA(String field, int id, String name, String password, int salary) {
        super(id, name, password, salary);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return super.toString()+","+field;
    }
    @Override
    public double getIncome() {
          return getSalary()*IRequest.bonusIncomeRate_BA;
    }

    @Override
    public void sendRequestDayOff() {
        System.out.println("BAs resquest :" + IRequest.dayoff_ba +"/m");
    }

    @Override
    public void doTraining() {
        System.out.println("BA are training Freshers");
    }
    
}
