class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> seenS = new ArrayList<>();
        List<Character> seenT = new ArrayList<>();
        for (char chars : s.toCharArray()){
            seenS.add(chars);
        }
        for (char chars : t.toCharArray()){
            seenT.add(chars);
        }
     Collections.sort(seenS);
      Collections.sort(seenT);
    return seenS.equals(seenT);
    }
}
