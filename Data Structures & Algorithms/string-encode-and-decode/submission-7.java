class Solution {
   public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();
    for (String s : strs) {
        sb.append(s.length()).append('#').append(s);
    }
    return sb.toString();
}

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        
            while (i < str.length()) {
        int hash = str.indexOf('#', i);                     
        int len = Integer.parseInt(str.substring(i, hash)); 
        int start = hash + 1;                               
        int end = start + len;                             

        decoded.add(str.substring(start, end));
        i = end;                                            
    }

        return decoded;
    }
}
