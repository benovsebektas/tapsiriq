import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // tap1();
        //tap2();
       // tap3();
       // tap4();
      //  tap5();
      //  tap6();
       // tap7();
       // tap8();
        tap9();
    }

    public static void tap1() {
        System.out.println("zehmet olmasa reqem daxil edin");
        Scanner sc = new Scanner(System.in);
        int reqem = sc.nextInt();
        for (int i = 0; i < reqem; i++) {
            System.out.print("*");

        }

    }

    public static double tap2() {
        System.out.println("1 ci reqemi daxil edin");
        Scanner sc = new Scanner(System.in);
        double reqem = sc.nextDouble();
        System.out.println("2 ci reqemi daxil edin");
        double reqem2 = sc.nextDouble();
        System.out.println("3 cu reqemi daxil edin");
        double reqem3 = sc.nextDouble();

        if (reqem > reqem2 && reqem > reqem3) {
            return reqem;

        } else if (reqem2 > reqem && reqem2 > reqem3) {
            return reqem2;

        } else {
            return reqem3;
        }
    }


    public static double tap3() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1-ci rəqəmi daxil edin");
        double reqem = sc.nextDouble();

        System.out.println("2-ci rəqəmi daxil edin");
        double ustu = sc.nextDouble();
        double cavab=Math.pow(reqem,ustu);
                return cavab;
    }

    public static void tap4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1-ci rəqəmi daxil edin");
        int reqem = sc.nextInt();
        int cem=0;
        for (int i = 1; i <= reqem; i++) {
            cem+=i;


        }
             System.out.println(cem);

        }

    public static void tap5() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1-ci rəqəmi daxil edin");
        int reqem = sc.nextInt();
        int faktorial=1;
        for (int i = 1; i <=reqem; i++) {
            faktorial*=i;


        }
        System.out.println(faktorial);

    }

    public static void tap6() {
        int reqem=10;
        for (int i = 1; i <=reqem ; i++) {
            if (i%2==0) {
                System.out.println(i);

            }
        }

    }

    public static void tap7() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1-ci rəqəmi daxil edin");
        int reqem = sc.nextInt();
        int eded=reqem*reqem;
        System.out.println(eded);

       int sum=1;
      sum+=eded;
        System.out.println(sum);

    }

    public static void tap8() {
        System.out.println("3 reqemli eded daxil edin");
        Scanner sc = new Scanner(System.in);
        int reqem = sc.nextInt();
        int sum=0;
        sum+=reqem%10;
        reqem/=10;
        sum+=reqem%10;
        reqem/=10;
        sum+=reqem%10;
        reqem/=10;
        System.out.println(sum);

    }

    public static void tap9() {
        System.out.println("3 reqemli eded daxil edin");
        Scanner sc = new Scanner(System.in);
        int reqem = sc.nextInt();
        int eded=0;
        eded+=reqem%10;
          eded+=reqem%100;
         eded+=reqem%1000;
        System.out.println(eded);

      //  reqem/10;
       // reqem/10;

    }




    }











