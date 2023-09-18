package cdu.gu.demo.Text;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int length = 1;
        int i=0;
        while(length == n){
            for(int j=0;j<n;j++){
                if (str1.charAt(i) == str2.charAt(j)){
                    length++;
                    break;
                }
            }


        }

    }
}
