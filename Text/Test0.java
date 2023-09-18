package cdu.gu.demo.Text;

import java.util.Scanner;

public class Test0 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] arr = new double[n];
        double [] arr1 = new double[n];
        double sum = 0,sum1 =0;
        int index = 0;
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextDouble();
            sum += arr1[i];
            arr[i] = sc.nextDouble();
            sum1 += arr[i];
            if (arr[i]> arr1[i] || arr1[i]<0 || arr[i]<0) index =1;
        }
        double sum2 = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        if (sum2<0 || b<0) index=1;
        if (index == 1) System.out.println("error");
        else{
            if (sum > sum2){
                if (sum - b >= sum1)
                    System.out.printf("%.2f",sum1);
                else
                    System.out.printf("%.2f",sum-b);
            } else {
                if (sum >= sum1)
                    System.out.printf("%.2f",sum1);
                else
                    System.out.printf("%.2f",sum);
            }
        }

    }
}
