import java.util.Scanner;

public class CountofArrayElement {
    public static int greaterElement(int []array,int size){
        int lessercount=0;
        int maximum=Integer.MIN_VALUE;
        for(int iterator=0;iterator<size;iterator++){
            if(array[iterator]>maximum)
            {
                maximum=array[iterator];
            }
        }
        for(int iterator=0;iterator<size;iterator++){
            if(array[iterator]!=maximum){
                lessercount++;
            }
        }
        return lessercount;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        System.out.println(greaterElement(array,size));
    }

}
