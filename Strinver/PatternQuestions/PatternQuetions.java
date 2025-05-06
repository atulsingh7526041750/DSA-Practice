package Strinver.PatternQuestions;



public class PatternQuetions {
    public static void main(String[] args) {
//        Pattern1(5);
//        Pattern2(5);
//        Pattern3(5);
//        Pattern4(5);
//       Pattern5(5);
////        Pattern6(5);
//        Pattern7(6);
//        Pattern8(6);

//        Pattern9(15);
//
//        Pattern10(3);

//        Pattern11(5);
//        Pattern12(3);
//        Pattern13(3);
//        Pattern14(5);
//        Pattern15(5);
//        Pattern16(5);
        //Pattern17(10);
//        Pattern18(3);
        Pattern19(4);



    }

    public static void Pattern1(int n){

        //Print the pattern
//        * * * *
//        * * * *
//        * * * *
//        * * * *
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");

        }

    }

    public static void Pattern2(int n){
        //Print the pattern
//        *
//        * *
//        * * *
//        * * * *

        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void Pattern3(int n){
//        1
//        1 2
//        1 2 3

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
    public static void Pattern4(int n){
//        Output:
//        1
//        2 2
//        3 3 3


        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

    public static void Pattern5(int n){

//        Output:
//* * *
//* *
//*

            for(int i=1;i<=n;i++){
                for(int j=0;j<n-i+1;j++){
                    System.out.print("* ");

                }
                System.out.println();
            }

    }

    public static void Pattern6(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void Pattern7(int n){


        for( int i=0;i<n;i++){
            //space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }

            //star
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }


    }

    public static void Pattern8(int n){
        for( int i=0;i<n;i++){
            //space
            for( int j=0;j<i;j++)
            {
                System.out.print(" ");
            }


            //star

            for( int j=0; j<(2*n-2*i-1);j++){
                System.out.print("*");
            }

            //space

            for( int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }


    public static void Pattern9(int n) {

        for (int i = 0; i < n / 2; i++) {


            //space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }

            //star
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();

        }

        for (int i = n / 2; i < n; i++) {



            //space
            for( int j=0;j<i;j++)
            {
                System.out.print(" ");
            }


            //star

            for( int j=0; j<(2*n-2*i-1);j++){
                System.out.print("*");
            }

            //space

            for( int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();

        }


    }

    public static void Pattern10(int n){
        for( int i=0;i<2*n-1;i++){
            if(i<=(n-1)){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();


            }
            else{
                for(int j=0;j<(2*n-i-1);j++){
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }

    public static void Pattern11(int n){

//        Output:
//
//        1
//        0 1
//        1 0 1
        int start=1;
        for (int i=0;i<n;i++){
            if(i%2==0){
                start=1;
            }
            else {
                start=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;

            }
            System.out.println();


        }

    }

    public static void Pattern12(int n){
        for( int i=0;i<n;i++){
            //print number
            int start=0;

            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            for(int j=0;j<(2*n-2*i-2);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+1+" ");
            }

            System.out.println();
        }
    }

    public static void Pattern13(int n){
        int start=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start++;
            }
            for(int j=0;j<n-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void Pattern14(int n){
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            for(int j=0;j<n-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pattern15(int n){
        for( int i=n;i>0;i--){
            char ch='A';
            for(int j=i;j>0;j--){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();

        }

    }

    public static void Pattern16(int n){
        char ch='A';
        for( int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
    }


    public static void Pattern17(int n){
        for( int i=0;i<n;i++){


            //space
            for(int j=0; j<=n-i-1;j++){
                System.out.print(" ");
            }

            //star
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=0;j<(2*i+1);j++){
                System.out.print(ch+" ");
                if(j<=breakpoint){
                    ch++;
                }
                else {
                    ch--;
                }
            }

            //space
            for(int j=0; j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pattern18(int n){

        for(int i=0;i<n;i++){
            int a = n-1;
            char ch='A';
            while(a>0){
                ch++;
                a--;
            }
            for(int j=0;j<=i;j++){
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }

        // Write your code here



    }

    public static void Pattern19(int n){
        for( int i=0; i<n;i++){

                for (int j = 0; j < n-i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2 * i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        int space = n+1;
            for( int i=0; i<n;i++){

                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j <= space; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                space  = space -2;

            }

        }
    }




