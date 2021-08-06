package util;

public class StringDemo {
    public String concat(String s1, String s2){
        return s1.concat(s2);
    }
    public String subString(String s, int idx){
        return s.substring(idx);
    }
    public String subString(String s1, int start, int end){
        return s1.substring(start, end);
    }
    public int compareTo(String s1, String s2){
        return s1.compareTo(s2);
    }
    public int compareToIgnoreCase(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
    public String removeHyponeInJuminBunho(String juminBunho){
        return juminBunho.replace("-", "");
    }

}
