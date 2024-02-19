public class Switch {

    public static void main(String[] args) {
        //data types not allowed for cases:boolean,float,double

        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("The Day is Monday");  
                break;
            case "Tuesday":
                System.out.println("The Day is Tuesday");   
                break;
            case "Wednesday":
                System.out.println("The Day is Wednesday");
                break;
            case "Thursday":
                System.out.println("The Day is Thursday");
                break;
            case "Friday":
                System.out.println("The Day is Friday");
                break;
            case "Saturday":
                System.out.println("The Day is Saturday");
                break;
            case "Sunday":
                System.out.println("The Day is Sunday");
                break;
            
            default:
                System.out.println("No Day");
                break;
        }
    }
}