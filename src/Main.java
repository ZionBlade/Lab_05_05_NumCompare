public class Main
{
    public static void main(String[] args)
    {
        int numOne = 15;
        int numTwo = 19;

        System.out.println("Please enter the first number you would like to compare: ");

        System.out.println("Please enter the second number you would like to compare: ");

        if (numOne == numTwo)
        {
            System.out.println("Both numbers are equal.");
        }
        else if (numOne >= numTwo)
        {
            System.out.println("Both numbers are NOT equal. " + numTwo + " is less than " + numOne);
        }
        else if (numOne <= numTwo)
        {
            System.out.println("Both numbers are NOT equal. " + numOne + " is less than " +numTwo);
        }
        else
        {
            System.out.println("That is not a valid number");
        }
    }
}
