import java.io.PrintWriter;

import java.util.Scanner;

//Create a class

public class Daily extends Appointment

{

    //Define the constructor

    public Daily() { }

    /*Define the parameterized constructor to construct a Daily Appointment */

    public Daily(String description)

    {

        setDescription(description);

    }

    /*Define a method to determines if the appointment occurs on the given date */

    public boolean occursOn(int year, int month, int day)

    {

        return true;

    }

    //Define a method to save the appointment to a PrintWriter

    public boolean save(PrintWriter outw)

    {

        try

        {

            outw.println("D " + super.toString());

        }

        catch (Exception e)

        {

            return false;

        }

        return true;

    }

    /*Define a method to load the appointment from a Scanner */

    public boolean load(Scanner scr)

    {

        try

        {

            // The D is already consumed at this point

            setDescription(scr.nextLine().trim());

        }

        catch (Exception e)

        {

            return false;

        }

        return true;

    }

}
