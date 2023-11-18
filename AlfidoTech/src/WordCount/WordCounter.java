package WordCount;
class WordCounter 
{
     
    public static int countWords(String str)
    {     
        if (str == null || str.isEmpty())
            return 0;
       
        String[] words = str.split("\\s+"); 
        return words.length;  // Return number of words in the given string
    }

    public static void main(String args[])
    {
       
        String str =  "Alfido Tech"; // Given String str
        System.out.println("No of words : " + countWords(str));  // Print the result
    }
}