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

                    boolean hasRepeats = checkForRepeating(aSubstring, j);
                }
            }

        }
    }


    /** Returns the location of the duplicate entry in the substring
     *
     * @param input String
     * @param startingIndex int
     * @return int
     */
    public int checkForRepeating(String input, int startingIndex)
    {
        boolean answer = false;
        int location = 0;
        String lastChar = input.substring(input.length() - 1, input.length());
        int index = 0;

        while (index < (input.length()-1) && !answer)
        {
            String currentChar = input.substring(index, index + 1);

            if (currentChar.equals(lastChar))
            {
                answer = true;
                location = index;
            }
            index++;
        }

        if (location != 0)
        {
            return location;
        }
        else
        {
            return startingIndex;
        }
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