package Array;

public class Student {
    public int rollNo;
    public String name;

    Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
    }
