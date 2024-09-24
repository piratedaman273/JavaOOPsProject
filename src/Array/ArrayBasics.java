package Array;

public class ArrayBasics {
    public static void main(String[] args) {

/*        int[] arr = new int[2];
        arr[0] = 34;
        System.out.println(arr[0]);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //Reference variables

        Student[] stud = new Student[4];

        stud[0] = new Student(1,"Aman");
        stud[1] = new Student(2,"John Wick");
        stud[2] = new Student(3,"Jane Doe");
        stud[3] = new Student(4,"John Doe");

        for (int i = 0; i < stud.length; i++) {
            System.out.println(stud[i]);
        }
        int arr[] = getArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] getArray(){
        return new int[] {10,20,30,40};
    }
}
