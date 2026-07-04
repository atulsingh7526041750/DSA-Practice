package basicquestion;

import java.util.Scanner;

public class PatternQuestions {
    //Pattern1
    public static void main(String[] args) {
        patternTwenty();

    }
    public static void patternOne(){
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternTwo(){
        for (int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternThird(){
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void patternFour(){
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void patternFive(){
        for (int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternSix(){
        for (int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void patternSeven(){
        int n = 5;
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int l=0;l<2*i+1;l++){
                System.out.print("*");
            }
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void patternEight(){
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*5-2*i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void patternNine(){
        int n = 10;

        for (int i=0;i<n/2;i++){
            for(int j=0;j<n/2-i-1;j++){
                System.out.print(" ");
            }
            for(int l=0;l<2*i+1;l++){
                System.out.print("*");
            }
            for(int k=0;k<n/2-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*5-2*i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void patternTen(){
        int n=14;

        for(int i=0;i<n/2+1;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int k=n/2;k>0;k--){
            for(int l=0;l<k;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternTwelve(){
        int n=10;
        for (int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int k=0;k<2*(n-1)-2*i;k++){
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }

    }
    public static void patternThirteen(){
        int k=1;
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k);
                System.out.print(" ");
                k++;
            }

            System.out.println();
        }
    }
    public static void patternFourteen() {
        for(int i=0;i<5;i++){
            int p = 65;
            for(int j=0;j<=i;j++){

                System.out.print((char)p);
                p++;
            }
            System.out.println();
        }
    }
    public static void patternFifteen() {
        for(int i=5;i>0;i--){
            int p = 65;
            for(int j=0;j<=i;j++){
                System.out.print((char)p);
                p++;
            }
            System.out.println();
        }
    }

    public static void patternSixteen() {
        int p = 65;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)p);
            }
            p++;
            System.out.println();
        }
    }

    public static void patternSeveteen() {

        for(int i=1;i<=4;i++){
            int p = 65;
            //space
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print((char) p);
                p++;
            }
            p=p-2;
            while (p-65>=0){
                System.out.print((char)p);
                p--;
            }
            System.out.println();

        }
    }

    public static void patternEighteen() {

        for(int i=0;i<5;i++){
            int p = 65+4-i;
            for (int j=0;j<=i;j++){
                System.out.print((char) p + " ");
                p++;
            }
            System.out.println();

        }
    }
    public static void patternNinteen() {
        int n=10;
        for(int i=0;i<5;i++){
            //star
            for(int j=5-i;j>0;j--){
                System.out.print("*");
            }
            //space
            for(int k=0;k<2*i;k++){
                System.out.print(" ");
            }
            //star
            for(int l=5-i;l>0;l--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int k=0;k<2*5-2*i;k++){
                System.out.print(" ");
            }
            //star
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void patternTwenty() {
        for(int i=0;i<9;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");

            }
            for(int k=9-1-2*i;k>0;k--){
                System.out.print(" ");

            }
            for(int l=0;l<=i;l++){
                System.out.print("*");

            }
            System.out.println();
        }
        int a=2;
        for(int i=9;i>0;i--){

            for(int j=1;j<i/2;j++){
                System.out.print("*");

            }
            for(int k=0;k<a;k++){
                System.out.print(" ");

            }
            for(int j=1;j<i/2;j++){
                System.out.print("*");

            }
            System.out.println();
            a = a+2;
        }

    }
}
