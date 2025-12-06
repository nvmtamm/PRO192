/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public abstract class Dev extends Staff{
     private String programlanguage;

    public Dev() {
        super();
        programlanguage="Java";
    }

    public Dev(String programlanguage, int id, String name, String password, int salary) {
        super(id, name, password, salary);
        this.programlanguage = programlanguage;
    }

    public String getProgramlanguage() {
        return programlanguage;
    }

    public void setProgramlanguage(String programlanguage) {
        this.programlanguage = programlanguage;
    }

    @Override
    public String toString() {
        return super.toString()+","+programlanguage;
    }
    //vi lop Dev co thua ke ham getIncome cua lop Staff
    //nhung van ko co cong thuc de code=> van giu no la abstract=> Dev la abstract
}
