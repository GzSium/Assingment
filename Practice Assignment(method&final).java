//  a. Write a method called evenChecker that takes an integer number as its argument and prints whether the number is even or odd inside the method.
//  b.Write a method called isEven that takes an integer number as an argument and returns boolean true if the number is even otherwise returns boolean false
//  c.Write a method called isPos that takes an integer number as an argument and returns boolean true if the number is positive otherwise returns boolean false.
//  d.Write a method called sequence() that takes an integer in its parameter called n. Now, if n is positive then it prints all the even numbers from 0 to n, otherwise
//    if n is negative it prints all the odd numbers from n to -1.

import java.util.*;
class task8{
    //method 1
    public static void evenChecker(int n){
        if(n%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    //method 2
    public static boolean isEven(int i){
        boolean b;
        if(i%2 == 0){
          b = true;
        }
        else{
         b  = false;
        }
        return b;
    }
    //method 3
    public static boolean isPos(int p){
        boolean b;
        if(p > 0){
          b = true;
        }
        else{
         b  = false;
        }
        return b;
    }
    //method 4
    public static void sequence(int n){
        if(n>0){
            for(int i =2;i<=n;i++){
                if(i%2 == 0){
                    System.out.print(i+" ");
                }
            }
            System.out.println("");
        }
        else{
            for(int j=n;j<0;j++){
                if(j%2 != 0){
                    System.out.print(j+" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String [] args){
        evenChecker(9); //1
        boolean result = isEven(122); //2
        System.out.println(result);
        boolean result2 = isPos(-5);  //3
        System.out.println(result2);
        sequence(10);
        sequence(-7);
        
    }
}



//   a. rite a method called circleArea that takes an integer radius in its parameter and returns the area of the circle.
//   b.Write a method called sphereVolume that takes an integer radius in its parameter and returns the volume of the sphere. Note: volume of a sphere is 43r3
//   c.Write a method called findSpace that takes two values in its parameters one is an integer diameter and another one is a String. Using the given diameter, this
//     method should calculate the Area of a circle or the Volume of a sphere depending on the value of the second parameter. Finally, it should print the result inside the method.
//task2
import java.util.*;
class task2{
    public static void findSpace(double i,String j){
        //Area
        if(j == "circle" ){
            double res =3.1416*i*i;
            System.out.println(res);
        }
        else if(j == "sphere"){
            double res = 1.33*3.1416*i*i*i;
            System.out.println(res);
        }
        else{
            System.out.println("Wrong Parameter");
        }
    }
    public static void main(String [] args){
    findSpace(10,"circle");
    findSpace(5,"sphere");
    findSpace(10,"square");
    }
}




//task3
import java.util.*;
class task3{
    public static boolean isPrime(int n){
        boolean b;
        int sum =0;
        for(int i =1;i<100;i++){
            if(n%i == 0){
                sum =sum +1;
            }
        }
        if(sum ==2){
            b=true;
        }
        else{
            b =false;
        }
        return b;
    }
    public static void main(String [] args){
    boolean result = isPrime(7);
    System.out.println(result);
    boolean result1 = isPrime(8);
    System.out.println(result1);
    }
}




//task4
class task4{
    public static boolean isPerfect(int n){
        boolean b;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i ==0){
                sum =sum+i;
            }
        }
        if(sum == n){
            b = true;
        }
        else{
            b =false;
        }
      return b;
    }
    public static void main(String [] args){
        boolean check = isPerfect(6);     //1
        System.out.println(check);
        boolean check1 = isPerfect(33);    //2
        System.out.println(check1);
    }
}



//task4
class task4{
    public static double calcTax(int age , double income){
        double dis;
       if(age>=18){
        if(income>=10000 && income<=20000){
           dis = 0.07*income;
        }
        else if(income>20000){
            dis = 0.14*income;
        }else{
          dis =0.0;
        }
        }else{
          dis= 0;
       }
       return dis;
    }
    public static void main(String [] args){
      double t = calcTax(16,20000);
      System.out.println(t);
    }
}


// HappyNumber
import java.util.*;
class happyNumber{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m=0;
       while(true){
           int sumT=0;
           // n 0 na howa prjnto square cholbe
           while(n!=0){
           m=n%10;
           sumT =sumT + (m*m);
           n=n/10;
           }
            if(sumT == 1){
            System.out.println("Happy");
            break;
            }else if(sumT ==4){
            System.out.println(" not Happy");
            break;
            }
           n = sumT;
       }
    }
}


/*   Write a method modifyStrings() that takes in three given strings S, S1, and S2 consisting of different numbers of characters respectively, the task is to modify the
string S by replacing all the substrings S1 with the string S2 in the string S and printing the modified string S.   */
 
import java.util.*;
class substring{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3="";
        for(int i = 0;i<s.length();i++){
              int count=0;  //ekhne na thkle restart hbe na
            for(int j=i;j<s.length()&& count < s1.length();j++){  
    //count ke na dhorle s1 a length choto bole error asbe
                if(s.charAt(j) == s1.charAt(count)){
                    count++;
                }else{
                    break;
                }
            } //loop end
            if(count == s1.length()){
                s3= s3+ s2;
                i = i+s1.length()-1;
            }else{
                s3 = s3 + s.charAt(i);
            }
        } //loop end
        System.out.println(s3);
    }
}


// Binary to decimal
import java.util.*;
class binryTodecimal{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int m;
        for(int i=0;i<4;i++){ //Count hbe bt otar jnno alada loop
            m=n%10;
            n=n/10;
           sum = sum+(m*Math.pow(2,i)); 
        }
        System.out.println(sum);
    }
}
