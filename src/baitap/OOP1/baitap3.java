package baitap.OOP1;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the number you want to speak out: ");
        int number = scanner.nextInt();
        while (number >= 1000 || number < 0){
            System.out.println("This app just speak an interger and smaller than 1000.");
            System.out.println("Please enter again!");
            number = new Scanner(System.in).nextInt();
        }
        ChangeNumToWord(number);
    }
    public static void ChangeNumToWord(int number){
        String result = "";
        int hundred = number/100;
        int ten = (number % 10) / 10;
        int one = number % 10;
        if (number >= 0 && number < 20 ){
            switch (number){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eigh");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        }if (number >= 100 && ten == 0){
            switch (hundred){
                case 1:
                    result = result + "one hundred";
                    break;
                case 2:
                    result = result + "two hundred";
                    break;
                case 3:
                    result = result + "three hundred";
                    break;
                case 4:
                    result = result + "four hundred";
                    break;
                case 5:
                    result = result + "five hundred";
                    break;
                case 6:
                    result = result + "six hundred";
                    break;
                case 7:
                    result = result + "seven hundred";
                    break;
                case 8:
                    result = result + "eight hundred";
                    break;
                case 9:
                    result = result + "nine hundred";
                    break;

            }
            switch (one){
                case 0:
                    System.out.println(result);
                    break;
                case 1:
                    result = result + "one";
                    break;
                case 2:
                    result = result + "two";
                    break;
                case 3:
                    result = result + "three";
                    break;
                case 4:
                    result =  result + "four";
                    break;
                case 5:
                    result = result + "five";
                    break;
                case 6:
                    result = result + "six";
                    break;
                case 7:
                    result = result + "seven";
                    break;
                case 8:
                    result = result + "eight";
                    break;
                case 9:
                    result =  result + "nine";
                    break;
            }
            System.out.println(result);
        }
        if (number >= 100 && ten == 1){
            switch (hundred){
                case 1:
                    result = result + "one hundred";
                    break;
                case 2:
                    result = result + "two hundred";
                    break;
                case 3:
                    result =  result + "three hundred";
                    break;
                case 4:
                    result = result + "four hundred";
                    break;
                case 5:
                    result = result + "five hundred";
                    break;
                case 6:
                    result = result + "six hundred";
                    break;
                case 7:
                    result =  result + "seven hundred";
                    break;
                case 8:
                    result = result + "eight hundred";
                    break;
                case 9:
                    result = result + "nine hundred";
                    break;

            }
            switch (number % 10){
                case 10:
                    result = result + "ten";
                    break;
                case 11:
                    result = result + "eleven";
                    break;
                case 12:
                    result = result + "twelve";
                    break;
                case 13:
                    result = result + "thirteen";
                    break;
                case 14:
                    result = result + "fourteen";
                    break;
                case 15:
                    result = result + "fifteen";
                    break;
                case 16:
                    result = result + "sixteen";
                    break;
                case 17:
                    result =  result + "seventeen";
                    break;
                case 18:
                    result =  result + "eighteen";
                    break;
                case 19:
                    result = result + "nineteen";
                    break;
            }
            System.out.println(result);
        }else {
            switch (hundred) {
                case 0:
                    result = result + "";
                    break;
                case 1:
                    result = result + "one hundred";
                    break;
                case 2:
                    result = result + "two hundred";
                    break;
                case 3:
                    result = result + "three hundred";
                    break;
                case 4:
                    result = result + "four hundred";
                    break;
                case 5:
                    result = result + "five hundred";
                    break;
                case 6:
                    result = result + "six hundred";
                    break;
                case 7:
                    result = result + "seven hundred";
                    break;
                case 8:
                    result = result + "eight hundred";
                    break;
                case 9:
                    result = result + "nine hundred";
                    break;
            }
            switch (ten){
                case 2:
                    result = result + "twenty";
                    break;
                case 3:
                    result = result + "thirdty";
                    break;
                case 4:
                    result = result + "fourty";
                    break;
                case 5:
                    result = result + "fifty";
                    break;
                case 6:
                    result = result + "sixty";
                    break;
                case 7:
                    result = result + "seventy";
                    break;
                case 8:
                    result = result + "eighty";
                    break;
                case 9:
                    result = result + "ninety";
                    break;
            }
            switch (one){
                case 0:
                    System.out.println(result);
                    break;
                case 1:
                    result = result + "one";
                    break;
                case 2:
                    result = result + "two";
                    break;
                case 3:
                    result = result + "three";
                    break;
                case 4:
                    result =  result + "four";
                    break;
                case 5:
                    result = result + "five";
                    break;
                case 6:
                    result = result + "six";
                    break;
                case 7:
                    result = result + "seven";
                    break;
                case 8:
                    result = result + "eight";
                    break;
                case 9:
                    result = result + "nine";
                    break;
            }
            System.out.println(result);
        }
    }
}
