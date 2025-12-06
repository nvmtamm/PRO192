/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public abstract class Staff {
    private int id;
    private String name;
    private String password;
    private int salary;

    public Staff() {
    }

    public Staff(int id, String name, String password, int salary) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public boolean login(int id, String pwd){
        if(this.id==id && this.password.equals(pwd))
            return true;
        return false;
    }
    public void logout(){
        System.out.println("chuc ban 1 ngay vui ve");
    }
    public String toString(){
        return id+","+ name+","+salary+","+ password;
    }
    public double getTax(){
        return IRequest.taxRate*this.salary;
    }
    public abstract double getIncome();
}
