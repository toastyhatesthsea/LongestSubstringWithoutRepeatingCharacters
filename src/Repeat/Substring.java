package Repeat;

import java.util.HashMap;

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
        HashMap<String, Integer> rawrs = new HashMap<>();
        boolean foundRepeat = false;
        int repeatIndexLocation = startingIndex;

        for (int i = 0; i < input.length() && !foundRepeat; i++)
        {
            String currentChar = input.substring(i, i + 1);

            if (rawrs.containsKey(currentChar))
            {
                repeatIndexLocation = i;
                foundRepeat = true;
            } else
            {
                rawrs.put(currentChar, 1);
            }
        }
        return repeatIndexLocation;
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