import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        System.out.println("1.Addition");
        System.out.println("2.Submission");
        System.out.println("3.Muiltiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice from above");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        int num1,num2;

        switch(choice){
            case 1:
                System.out.println("Enter the first num:");
                 num1=sc.nextInt();
                System.out.println("Enter the first num:");
                 num2=sc.nextInt();
                int sum=num1+num2;
                System.out.println("sum = "+sum);
                break;
            case 2:
                System.out.println("Enter the first num:");
                 num1=sc.nextInt();
                System.out.println("Enter the first num:");
                 num2=sc.nextInt();
                 int sub=num1+num2;
                System.out.println("sub = "+sub);
        }

    }
}
