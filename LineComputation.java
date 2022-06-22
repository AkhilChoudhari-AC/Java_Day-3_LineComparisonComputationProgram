package Day3LineComputationProgram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LineComputation {
    public static void main(String[] args) {

        int ax1,ax2,ay1,ay2;
        int bx1,bx2,by1,by2;

        double Dist1;
        double Dist2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x1 coordinate of first line");
        ax1 = sc.nextInt();
        System.out.println("Enter the y1 coordinate of first line");
        ay1 = sc.nextInt();
        System.out.println("Enter the x2 coordinate of first line");
        ax2 = sc.nextInt();
        System.out.println("Enter the y2 coordinate of first line");
        ay2 = sc.nextInt();

        System.out.println("Enter the x1 coordinate of second line");
        bx1 = sc.nextInt();
        System.out.println("Enter the y1 coordinate of second line");
        by1 = sc.nextInt();
        System.out.println("Enter the x2 coordinate of second line");
        bx2 = sc.nextInt();
        System.out.println("Enter the y2 coordinate of second line");
        by2 = sc.nextInt();

        Dist1 = Math.sqrt((ax2-ax1)*(ax2-ax1) + (ay2-ay1)*(ay2-ay1));
        System.out.println("Distance between"+"("+ax1+","+ay1+"),"+"("+ax2+","+ay2+"),"+"Length of first line:"+Dist1);
        Dist2 = Math.sqrt((bx2-bx1)*(bx2-bx1) + (by2-by1)*(by2-by1));
        System.out.println("Distance between"+"("+bx1+","+by1+"),"+"("+bx2+","+by2+"),"+"Length of second line:"+Dist2);



    }
}
