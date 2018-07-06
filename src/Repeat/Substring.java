package Repeat;

public class Substring
{


    /**
     * Checks for any repeating characters by checking the last character throughout the String
     * @param input String
     * @return boolean
     */
    public boolean checkForRepeating(String input)
    {
        boolean answer = false;
        String lastChar = input.substring(input.length() - 1, input.length());
        int index = 0;

        while (index < input.length() && answer)
        {
            String currentChar = input.substring(index, index + 1);
        }

        return answer;
    }

}

class SubstringTesters
{
    public static void main(String[] asfgsgd)
    {
        Substring rawrs = new Substring();

        rawrs.checkForRepeating("abc");

    }

}