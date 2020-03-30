package hometask;

public class RemoveChar {
    String newStr;
    int l;
    public String removeChar(String s){
        l=s.length();
        if(l>2){
            if(s.charAt(0)=='A' && s.charAt(1)=='A') {
                newStr=s.substring(2);
            }
            else if(s.charAt(0)=='A' && s.charAt(1)!='A') {
                newStr=s.substring(1);
            }
            else if(s.charAt(0)!='A' && s.charAt(1)=='A') {
                newStr=s.charAt(0)+s.substring(2);
            }
            else if(s.charAt(0)!='A' && s.charAt(1)!='A') {
                newStr=s;
            }
        }
        else {
            if(s.charAt(0)=='A' && s.charAt(1)=='A') {
                newStr="";
            }
            else if(s.charAt(0)=='A' && s.charAt(1)!='A') {
                newStr=""+s.charAt(1);
            }
            else if(s.charAt(0)!='A' && s.charAt(1)=='A') {
                newStr=""+s.charAt(0);
            }
            else {
                newStr=s;
            }
        }
        return newStr;
    }
}
