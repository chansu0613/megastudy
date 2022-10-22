import java.util.Calendar;
        import java.util.Date;

public class test {
    public static void main(String[] args) {

        Calendar thatDay = Calendar.getInstance();
        thatDay.set(Calendar.YEAR,2020);
        thatDay.set(Calendar.MONTH,4);
        thatDay.set(Calendar.DATE,1);

        int num = thatDay.get(Calendar.DAY_OF_YEAR);

        Date d = new Date();
        Calendar today = Calendar.getInstance();
        today.setTime(d);
        System.out.println(d);
        int num1 = today.get(Calendar.DAY_OF_YEAR);

        boolean a = today.after(thatDay);

        if(a == true){
            System.out.println(num1 - num);

        }
        else System.out.println("X");


    }
}