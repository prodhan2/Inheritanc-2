
//define class AppointmentTester

public class AppointmentsTester

{

//define main method

    public static void main(String[] args)

    {

//check Monthly is subclass of Appointment

        System.out.print("Monthly is subclass of Appointment: ");

        System.out.println(Monthly.class.getSuperclass() == Appointment.class);

//print the expected result

        System.out.println("Expected: true");

//check Onetime is subclass of Appointment

        System.out.print("Onetime is subclass of Appointment: ");

        System.out.println(OneTime.class.getSuperclass() == Appointment.class);

//print the expected result

        System.out.println("Expected: true");

//check Daily is subclass of Appointment

        System.out.print("Daily is subclass of Appointment: ");

        System.out.println(Daily.class.getSuperclass() == Appointment.class);

//print the expected result

        System.out.println("Expected: true");

//check whether monthy appoinment have extra fields

        System.out.print("Monthly appointments have no extra fields: ");

        System.out.println(Monthly.class.getDeclaredFields().length == 1);

//print the expected result

        System.out.println("Expected: true");

//check whether Onetime appoinment have extra fields

        System.out.print("Onetime appointments have no extra fields: ");

        System.out.println(OneTime.class.getDeclaredFields().length == 3);

//print the expected result

        System.out.println("Expected: true");

//check whether Daily appoinment have extra fields

        System.out.print("Daily appointments have no extra fields: ");

        System.out.println(Daily.class.getDeclaredFields().length == 0);

//print the expected result

        System.out.println("Expected: true");

//define the object of Monthly

        Appointment obj = new Monthly(15, "pay the bills");

//checking themonthly  appointment

        System.out.println("Checking Monthly appointment: " + obj);

//print the expected result

        System.out.println("Expected: pay the bills");

//call occursOn to check the date

        System.out.println(obj.occursOn(2016, 8, 15));

//print the expected result

        System.out.println("Expected: true");

//define the object of Onetime

        obj = new OneTime(2016, 11, 1, "Dentist appointment.");

//checking the one time appointment

        System.out.println("Checking onetime appointment: " + obj);

//print the expected result

        System.out.println("Expected: Dentist appointment.");

//call occursOn to check the date

        System.out.println(obj.occursOn(2016, 11, 1));

//print the expected result

        System.out.println("Expected: true");

//define the object of Daily

        obj = new Daily("walk the dog.");

//checking the daily appointment

        System.out.println("Checking daily appointment: " + obj);

        System.out.println("Expected: walk the dog");

//call occursOn to check the date

        System.out.println(obj.occursOn(2016, 12, 25));

//print the expected result

        System.out.println("Expected: true");

    }

}