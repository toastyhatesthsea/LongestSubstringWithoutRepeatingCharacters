package Repeat;

import java.util.HashMap;

public class Substring
{


    /**
     * Finds the length of the longest substring in the input
     * @param s String
     * @return int
     */
    public int lengthOfLongestSubstring(String s)
    {
        int longestLength = 1;

        if (s.length() == 1)
        {
            return longestLength;
        }
        else if (s.length() == 0)
        {
            return 0;
        }
        else
        {
            boolean done = false;
            for (int i = 0; i < s.length() && !done; i++)
            {
                String aSubstring = s.substring(i, s.length());
                int locationOfRepeating = checkForRepeating(aSubstring, i);

                int currentLength = locationOfRepeating - i;

                if (currentLength > longestLength)
                {
                    longestLength = currentLength;
                }

                if (longestLength >= aSubstring.length())
                {
                    done = true;
                }
            }
        }

        return longestLength;
    }


    /** Returns the location of the duplicate entry in the substring by using a Hashmap
     * Hashmap checks to make sure there are no duplicates after the character is added
     * @param input String
     * @param startingIndex int
     * @return int
     */
    public int checkForRepeating(String input, int startingIndex)
    {
        HashMap<String, Integer> rawrs = new HashMap<>();
        boolean foundRepeat = false;
        int repeatIndexLocation = 0;
        int count = 0;

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
            count ++;
        }
        if (foundRepeat)
        {
            return repeatIndexLocation + startingIndex;
        }
        else
        {
            return count + startingIndex;
        }
    }

}

class SubstringTesters
{
    public static void main(String[] asfgsgd)
    {
        Substring rawrs = new Substring();

        int answer = rawrs.lengthOfLongestSubstring("abccdef");

    }

}