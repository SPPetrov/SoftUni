﻿//Problem 6.	Strings and Objects
//Declare two string variables and assign them with “Hello” and “World”. Declare an object variable 
//and assign it with the concatenation of the first two variables (mind adding an interval between). 
//Declare a third string variable and initialize it with the value of the object variable (you should perform type casting).

using System;
class StringsAndObjects
{
    static void Main()
    {
        string firstWord = "Hello";
        string secondWord = "World";
        object fullWord = firstWord + " " + secondWord;
        string thirdWord = (string)fullWord;
        Console.WriteLine(firstWord);
        Console.WriteLine(secondWord);
        Console.WriteLine(fullWord);
        Console.WriteLine(thirdWord);
    }
}
