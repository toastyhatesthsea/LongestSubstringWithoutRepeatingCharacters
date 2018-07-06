package Repeat;

public class Substring
{


    public int lengthOfLongestSubstring(String s) {
        int answer = 1;
        int index = 0;

        if (s.length() == 1)
        {
            return answer;
        }
        else
        {

        }

        return answer;
    }


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

        while (index < (input.length()-1) && !answer)
        {
            String currentChar = input.substring(index, index + 1);

            if (currentChar.equals(lastChar))
            {
                answer = true;
            }
            index++;
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