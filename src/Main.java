import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("massivin uzunlugu: ");
        int n= sc.nextInt();
        System.out.println();
        System.out.println("massivin elementleri: ");
        int [] arr= new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println();
        check(arr);
    }
    public static void check(int [] array){
      for (int i=0; i<array.length; i++){
          if(array.length!=0){
              System.out.println("bu elementlerin indeksleri: "+i);
          }
       }
        if (array.length==0){
            System.out.println("-1");

        }
    }

}