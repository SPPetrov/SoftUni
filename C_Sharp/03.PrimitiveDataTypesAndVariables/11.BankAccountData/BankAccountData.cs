//Problem 11.	Bank Account Data
//A bank account has a holder name (first name, middle name and last name), available amount of money (balance),
//bank name, IBAN, 3 credit card numbers associated with the account.Declare the variables needed to keep 
//the information for a single bank account using the appropriate data types and descriptive names.

using System;
class BankAccountData
{
    static void Main()
    {
        string firstName = "Kaloqn";
        string middleName = "Petrov";
        string lastName = "Kaloqnov";
        decimal balance = 12345678.91m;
        string bankName = "PIB";
        string iban = "5689 PIB BG 5656 5565 2165";
        string firstCardNumber = "4546899266";
        string secondCardNumber = "1234561232";
        string thirdCardNumber = "5454465464";
        Console.WriteLine("First name :"+firstName);
        Console.WriteLine("Middle name :"+ middleName);
        Console.WriteLine("Last name :"+lastName);
        Console.WriteLine("Amount of money : "+balance);
        Console.WriteLine("bankName :"+bankName);
        Console.WriteLine("iban :"+iban);
        Console.WriteLine("FirstCardNumber : "+firstCardNumber);
        Console.WriteLine("SecondCardNumber: "+secondCardNumber);
        Console.WriteLine("thirdCardNumber : "+thirdCardNumber);
    }
}
