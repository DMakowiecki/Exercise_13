public class NumberOfDaysInMonth {
    // write your code here
    public static boolean isLeapYear(int year){
        if(year>=1 && year<9999){
            if ((year % 4 == 0) && year % 100 != 0)
            {
                return true;
            }
            else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
            {
                return true;
            }
            else
            {
                return false;
            }
        }else {
            return false;
        }


    }
    public static  int getDaysInMonth(int a,int year){
if(year>=1 && year<=9999) {
    switch (a) {
        case 1:
            return 31;

        case 2:
            if (isLeapYear(year) == true) {
                return 29;
            } else {
                return 28;
            }

        case 3:
            return 31;

        case 4:
            return 30;

        case 5:
            return 31;

        case 6:
            return 30;

        case 7:
            return 31;

        case 8:
            return 31;

        case 9:
            return 30;

        case 10:
            return 31;

        case 11:
            return 30;

        case 12:
            return 31;

        default:
            return -1;


    }
}else {
    return -1;
}
    }
    public static  void getDaysInMonth(int a,int year, int s){

        switch(a){
            case 1:
                System.out.println("31 since January has 31 days ");
                break;
            case 2:
                if(isLeapYear(year)==true){
                    System.out.println("29 since February has 29 days in a leap year and "+ year +"  is a leap year ." );
                }else {
                    System.out.println("28 since February has 28 days if it's not a leap year and "+ year + "  is not a leap year " );
                }
                break;
            case 3:
                System.out.println("31 since March has 31 days ");
                break;
            case 4:
                System.out.println("30 since April has 30 days ");
                break;
            case 5:
                System.out.println("31 since May has 31 days ");
                break;
            case 6:
                System.out.println("30 since June has 30 days ");
                break;
            case 7:
                System.out.println("31 since July has 31 days ");
                break;
            case 8:
                System.out.println("31 since August has 31 days ");
                break;
            case 9:
                System.out.println("30 since September has 30 days ");
                break;
            case 10:
                System.out.println("31 since October has 31 days ");
                break;
            case 11:
                System.out.println("30 since November has 30 days ");
                break;
            case 12:
                System.out.println("31 since December has 31 days ");
                break;
            default:
                System.out.println("It's wrong mounth ");
            break;

        }

    }
}