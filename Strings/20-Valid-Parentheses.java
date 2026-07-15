class Solution {
    public boolean isValid(String s) {
        Stack <Character> str=new Stack<>();
        for (int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='{' || ch=='[' || ch=='('){
                str.push(ch);
            }else{
                
                if (str.isEmpty())return false;
                char  peek=str.pop();
                if (ch=='}' && peek!='{') return false;
                if (ch==']' && peek!='[') return false;
                if (ch==')' && peek!='(') return false;
             


            }
        }
        return str.isEmpty();
    }
}