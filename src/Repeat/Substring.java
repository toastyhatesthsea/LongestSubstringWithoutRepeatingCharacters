package Repeat;

public class Substring
{


    public int lengthOfLongestSubstring(String s) {
        int currentLength = 1;
        int highest = currentLength;
        int startingIndex = 0;
        int endingIndex = 1;
        String aSubstring = "";

        if (s.length() == 1)
        {
            return currentLength;
        }
        else
        {
            boolean repeats = false;
            boolean done = false;
            while (startingIndex < s.length() - 1 && !done)
            {
                while (!repeats && (endingIndex + 1) <= s.length())
                {
                    aSubstring = s.substring(startingIndex, endingIndex + 1);
                    repeats = checkForRepeating(aSubstring);
                    endingIndex++;
                }

                if (startingIndex >= s.length() - 1 && !repeats)
                {
                    currentLength = aSubstring.length();
                }
                else if (aSubstring.length() >= s.length() - startingIndex && repeats)
                {
                    currentLength = aSubstring.length() - 1;
                    done = true;
                }
                else if (s.length() == aSubstring.length())
                {
                    currentLength = aSubstring.length();
                }
                else
                {
                    currentLength = aSubstring.length() - 1;
                }

                if (currentLength > highest)
                {
                    highest = currentLength;
                }
                startingIndex++;
                endingIndex = startingIndex;
                endingIndex++;
                repeats = false;
            }
        }

        return highest;
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

        int answer = rawrs.lengthOfLongestSubstring("abc");

    }

}