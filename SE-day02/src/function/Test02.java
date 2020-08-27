package function;

public class Test02 {
    public static void main(String[] args) {
//        int week=5;
//        if(week==1){
//            System.out.println("周一");
//        }else if(week==2){
//            System.out.println("周二");
//        }else if(week==3){
//            System.out.println("周三");
//        }else if(week==4){
//            System.out.println("周四");
//        }else if(week==5){
//            System.out.println("周五");
//        }else if(week==6){
//            System.out.println("周六");
//        }else if(week==7){
//            System.out.println("周日");
//        }else {
//            System.out.println("输入错误");
//        }
//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//        for (int i = 97; i <= 122; i++) {
//            System.out.print((char) i + " ");
//        }
//        System.out.println();
//        for (int i = 1; i <= 100; i++) {
//            sum1+=i;
//        }
//        int sum1 = 0;
//        int i = 1;
//        int sum2 = 0;
//        int sum3 = 0;
//        while (i <= 100) {
//            sum1 += i;
//            if (i % 2 == 0) {
//                sum2 += i;
//            } else {
//                sum3 += i;
//            }
//            i++;
//        }
//        System.out.println(sum1);
//        System.out.println(sum2);
//        System.out.println(sum3);
//        int i1 = 1;
//        sum1 = 0;
//        sum2 = 0;
//        sum3 = 0;
//        do {
//            sum1 += i1;
//            if (i1 % 2 == 0) {
//                sum2 += i1;
//            } else {
//                sum3 += i1;
//            }
//            i1++;
//        } while (i1 <= 100);
//        System.out.println(sum1);
//        for (int i = 1; i <= 100; i++) {
//            if(i%2==0){
//                sum2+=i;
//            }else {
//                sum3+=i;
//            }
//        }
//        System.out.println(sum2);
//        System.out.println(sum3);
//        int avg = 1;
//        for (int i = 1; i <= 8; i++) {
//            avg*=i;
//        }
//        int i2 = 1;
//        while (i2 <= 8) {
//            avg *= i2;
//            i2++;
//        }
//        System.out.println(avg);
//        int i3 = 1;
//        avg = 1;
//        do {
//            avg *= i3;
//            i3++;
//        } while (i3 <= 8);
//        System.out.println(avg);
//        for (int i = 100; i < 1000; i++) {
//            int g=i%10;
//            int s=i/10%10;
//            int b=i/100;
//            if((g*g*g+s*s*s+b*b*b)==i){
//                System.out.println(i);
//            }
//        }
//        int i4 = 100;
//        while (i4 < 1000) {
//            int g = i4 % 10;
//            int s = i4 / 10 % 10;
//            int b = i4 / 100;
//            if ((g * g * g + s * s * s + b * b * b) == i4) {
//                System.out.println(i4);
//            }
//            i4++;
//        }
//        int i5 = 100;
//        do {
//            int g = i5 % 10;
//            int s = i5 / 10 % 10;
//            int b = i5 / 100;
//            if ((g * g * g + s * s * s + b * b * b) == i5) {
//                System.out.println(i5);
//            }
//            i5++;
//        } while (i5 < 1000);
//        int sum=0;
//        for (int i = 1; i <= 100; i++) {
//            if(i%3==0){
//                continue;
//            }
//            sum+=i;
//        }
//        System.out.println(sum);
//        for (int i = 10; i <= 20; i++) {
//            int g=i%10;
//            if(g==3){
//                break;
//            }
//            System.out.println(i);
//        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
