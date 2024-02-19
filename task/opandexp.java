public class opandexp {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        int add = a+b;
        System.out.println("Add :" +add);

        int remainer = a%b;
        System.out.println("Remainder : " +remainer);

        int cal = 5 * (10 + 3);
        System.out.println("5 * (10 + 3) :" +cal);

        int cal1 = (8 - 3) * 2 / 5;
        System.out.println("(8 - 3) * 2 / 5 : " +cal1);

        int cal2 = 10 % 3;
        System.out.println("10 % 3 : " +cal2);

        int num1 = 10;
        int num2 =20;
        int average = num1+num2 % 2;
        System.out.println(average);

        int number = 5;
        if(number==0){
            System.out.println("Zero");
        }else if (number % 2 ==0) {
            System.out.println("Even Number");
        }else if (number % 2 !=0) {
            System.out.println("Odd Number");
        }

        int length = 20;
        int width = 40;
        int areaOfRectangle = length * width;
        System.out.println("Area of Rectangle:" + areaOfRectangle);

        int year = 2000;
        if((year % 4==0 && year % 100 !=0) || (year % 400==0)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }

        double side1= 3.0;
        double side2 = 4.0;
        double righttriangle = (Math.sqrt((side1* side1)+(side2* side2)));
        System.out.println(righttriangle);

    }

}
