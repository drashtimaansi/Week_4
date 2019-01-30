package day1;
import java.util.Arrays;
import java.util.*;
 class Arrays1 {

    private student[] sec_G;
    private int bottom;
    public Arrays1(int num){
        sec_G=new student[num];
        bottom=-1;
    }

   public void insert(student s1){
        if(bottom!=sec_G.length-1){
            bottom++;
            sec_G[bottom]=s1;
        }
    }

    void display(){
        for(student s1 :sec_G){
            System.out.println(s1);
        }
    }
    public static void main(String [] args) {
        Arrays1 list =new Arrays1(37);

        Scanner in =new Scanner(System.in);

        System.out.println("Enter length");
        int length=in.nextInt();
        for(int i=0;i<length1;i++) {
            student s1=new student();

            s1.setRollno(i);
            s1.setname("komal" + i);
            list.insert(s1);
        }

            /*if(s1 !=null){
                System.out.println(s1);
            }
        }
        */
            list.display();
    }


}

class student{
    private int rollno;
    private String name;

    // getter & setters
    // obesevers & transformers
    // accessor & mutators

    int getRollNo(){
        return rollno;
    }

    String getName(){
        return name;
    }

    void setRollno(int rollno){
        this.rollno=rollno;
    }

   void setname(String name){
        this.name=name;
   }

    public String toString()
    {
        return (rollno+ " "+name);
    }
}