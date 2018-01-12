package simple;

class StringUtil {

    public String reverse2(String source) {
        String reversed = "";
        for(int i=source.length()-1; i>=0; i--) {
            reversed += source.charAt(i);
        }
        return reversed;
    }

    public String reverse(String source) {
        char[] sourceChars =source.toCharArray();
        char[] reversedChars = new char[sourceChars.length];
        int j=0;
        for(int i=sourceChars.length-1; i>=0; i--) {
            reversedChars[j++] = sourceChars[i];
        }
        return new String(reversedChars);
    }

    /**
     * How to count occurrence of a given character in String?
     * If interviewer ask you to count occurrence of more than one character than you
     * can either use an array, hash table or any additional data structure.
     * In order to solve this problem, you are not allowed to do so.
     * Your method must return count of given character, for example if input String is
     * "Java" and given character is 'a' then it should return 2.
     * Bonus point if you handle case, null and empty String and come up with unit tests.
     *
     * Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4cVsIIgiv
     */
    public long countOccurrenceOfCharacterInString(String string, char characterToCount) {
        return string.chars()
                .mapToObj(i -> (char)i)
                .filter(character -> character == characterToCount)
                .count();
    }

    public long countOccurrenceOfCharacterInString_old(String string, char characterToCount) {
        long count = 0;
        for(char ch : string.toCharArray()) {
            if(ch == characterToCount) count++;
        }
        return count;
    }
}
