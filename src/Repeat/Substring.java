package Repeat;

public class Substring
{


    public int lengthOfLongestSubstring(String s)
    {


        int charCount = 0;
        int highest = 0;
        int currentIndex = 0;

        if (s.length() == 1)
        {
            return s.length();
        } else
        {
            for (int i = 0; i < s.length(); i++)
            {
                String beginningChar = s.substring(i, i + 1);
                boolean foundDuplicate = false;
                for (int j = i + 1; j < s.length() && !foundDuplicate; j++)
                {
                    charCount++;
                    String aSubstring = s.substring(i, s.length());

                    boolean hasRepeats = checkForRepeating(aSubstring);
                }
            }

        }
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

        int answer = rawrs.lengthOfLongestSubstring("abccdefg");

    }

}