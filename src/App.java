
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class App {
    public static void main(String[] args) {
        int choice=0;
        Staff st=null;
        do{
            System.out.println("Tao 1 staff la 1 trong cac role: Fresher|Senior|BA");
            System.out.println("1. tao BA");
            System.out.println("2. tao Fresher");
            System.out.println("3. tao Senior");
            System.out.println("4. Print a staff's payslip");
            System.out.println("5. exit");
            System.out.println("enter option:");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    st=new BA("Traffic", 1, "Thi No","12345", 2000);
                    break;
                case 2:
                    st=new Fresher(true,"C#",2, "Pheo","123",2100);
                    break;
                case 3:
                    st=new Senior(200, 6, "Python", 3, "Ma Giam Sinh", "aaa",2200);
                    break;
                case 4:
                    System.out.println("----THONG TIN THU NHAP CUA NV-------");
                    System.out.println(st.toString());
                    System.out.println("basic salary:" + st.getSalary());
                    System.out.println("Tax:" + st.getTax());
                    System.out.println("final Income:" + (st.getIncome()-st.getTax()));
                    System.out.println("----THONg TIN NGHI PHEP------");
                    IRequest tmp=null;
                    if(st instanceof BA){
                      tmp=(BA)st;
                      //((BA)st).sendRequestDayOff();
                    }else if(st instanceof Senior){
                      tmp=(Senior)st;  
                      //((Senior)st).sendRequestDayOff();
                    }
                    if(tmp!=null) tmp.sendRequestDayOff();
                    System.out.println("------Thong tin Dao tao noi bo------");    
                    ITraining tmp2=null;
                    if(st instanceof BA){
                        tmp2=(BA)st;
                    }else if(st instanceof Fresher){
                        tmp2=(Fresher)st;
                    }
                    if(tmp2!=null) tmp2.doTraining();
                    
                case 5:
                    System.out.println("Chuc ban suc khoe!!!");
                    System.exit(0);
            }
        }while(true);
    }
}
