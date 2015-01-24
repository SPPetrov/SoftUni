
        //Problem 15.	* Age after 10 Years
        //Write a program to read your birthday from the console and print how old you are now and 
        //how old you will be after 10 years.

using System;

class AgeAfterTenYear
{
    static void Main()
    {
        Console.Write("Enter your bithday \"dd.mm.yyyy\" : ");
        DateTime birthDay = DateTime.Parse(Console.ReadLine());
        DateTime timeNow = DateTime.Today;
        int çurrentAge = timeNow.Year - birthDay.Year;
        if ((birthDay.Month > timeNow.Month) || (birthDay.Month==timeNow.Month && birthDay.Day > timeNow.Day) )
        {
            çurrentAge = çurrentAge - 1;
        }
        Console.WriteLine("Your age now : {0}", çurrentAge);
        çurrentAge = çurrentAge + 10;
        Console.WriteLine("Your age after 10 years : {0} ", çurrentAge);
    }
}

