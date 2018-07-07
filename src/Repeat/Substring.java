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

                    int locationOfRepeat = checkForRepeating(aSubstring, j);

                }
            }

        }
        return 0;
    }


    /** Returns the location of the duplicate entry in the substring
     *
     * @param input String
     * @param startingIndex int
     * @return int
     */
    public int checkForRepeating(String input, int startingIndex)
    {
        int location = startingIndex;
        boolean foundRepeat = false;

        for (int i = 0; i < input.length() && !foundRepeat; i++)
        {
            String firstChar = input.substring(i, i + 1);

            for (int j = i + 1; j < input.length() && !foundRepeat; j++)
            {
                String currentChar = input.substring(j, j + 1);

                if (firstChar.equals(currentChar))
                {
                    location = j;
                    foundRepeat = true;
                }
            }
        }
        return location;
    }

}

class SubstringTesters
{
    public static void main(String[] asfgsgd)
    {
        Substring rawrs = new Substring();

        int answer = rawrs.checkForRepeating("abccdefg", 0);

    }

}