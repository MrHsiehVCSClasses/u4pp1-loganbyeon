package u4pp;

public class LeapYear {
    public static boolean isLeapYear(int year){
    //Everything before 1582 is not a leap year
        if(year >= 1582){
            //check if year is divisible by 4
            //years evenly divisible by 100 AND 400
            if(year % 400 == 0 && year % 100 == 0){
                return true;
            }
            else if(year % 4 == 0 && year % 100 != 0){
                return true;
            }
        }
        return false;
    }
}