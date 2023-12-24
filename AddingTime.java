import java.util.Scanner;

public class AddingTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current hour: ");
        int hour = input.nextInt();
        System.out.print("Enter the current minute: ");
        int minute = input.nextInt();
        System.out.print("Enter the current second: ");
        int second = input.nextInt();
        
        System.out.println("");
        
        System.out.println("The current time is " + hour + ":" + minute + ":" + second);
        
        System.out.println("");
        
        System.out.print("How many hours to wait: ");
        int hourAdd = input.nextInt();
        System.out.print("How many minutes to wait: ");
        int minuteAdd = input.nextInt();
        System.out.print("How many seconds to wait: ");
        int secondAdd = input.nextInt();
        
        int finalAddH = hour + hourAdd;
        int finalAddM = minute + minuteAdd;
        int finalAddS = second + secondAdd;
        
        int totalAddS = finalAddS / 60;
        int totalM = finalAddM + totalAddS;
        
        int totalAddM = totalM / 60;
        
        int totalH = finalAddH + totalAddM;
        
        int sameAddM = totalM % 60;
        int sameAddS = finalAddS % 60;
        int sameAddH = totalH % 24;
        
        int totalS = sameAddS;
        
        System.out.println("");
        
        System.out.println("After " + hourAdd + " hours, " + minuteAdd + " minutes, and " + secondAdd + " seconds it will be " + sameAddH + ":" + sameAddM + ":" + sameAddS);
    }
}