import java.util.*;

public class array {
    public static void main(String[]args){
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }

        System.out.println("the elements are");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

       //without prompting for input 
        int c=0;
        int c2=0;
        /*int b[]=new int[4];
        b[0]=11;
        b[1]=12;
        b[2]=13;
        b[3]=14;
        
        System.out.println("the elements are");
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }*/

        for(int i=0;i<n;i++){
            if(a[i]%2==0){

              c+=1;
            }
            else{
                c2+=1;
            }
        }
        System.out.println("number of even numbers is"+c);
                System.out.println("number of odd numbers is"+c2);

        sc.close();


    }

    
}
