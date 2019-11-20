import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    //  54
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String[] a=s.split(" ");
        //n为列数
        int n=Integer.valueOf(a[0]);
        char[] c=a[1].toCharArray();
        //int i=0;

        int h=n/2;
        for(int p=0;p<h;p++){
            if(p==0){
                //打印首行
                for(int i=0;i<n;i++){
                    System.out.print(c[0]);
                }
                //回车换行
                //System.out.println();
                for(int i=0;i<n;i++){
                    System.out.print(" ");
                }
                //回车换行
               System.out.println();
                continue;
            }
            if(p==h-1){
                //打印尾行
                for(int i=0;i<n;i++){
                    System.out.print(c[0]);
                }
            }else{
                //打印中间有字母行
                for(int i=0;i<n;i++){
                    if(i==0||i==n-1){
                        System.out.print(c[0]);
                    }else{
                        System.out.print(" ");
                    }
                }
                //System.out.println();
                for(int i=0;i<n;i++){
                    System.out.print(" ");
                }
                //回车换行
                System.out.println();
            }
        }
    }
}
