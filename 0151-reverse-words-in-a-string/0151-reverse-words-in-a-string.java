class Solution {
    public String reverseWords(String s) {
        String chars[] = s.trim().split("\\s+");
        List<String> charList = Arrays.asList(chars);
      
        Collections.reverse(charList);
        return String.join(" ",charList);



        
    }
}