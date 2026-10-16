class Solution {
    public boolean isValid(String s) {
        Stack <Character> str=new Stack<>();
       for (char ch : s.toCharArray()){
        if (ch=='(' || ch=='{' || ch=='[') str.push(ch);
        else if (ch==')' || ch=='}' || ch==']'){
            if (str.isEmpty()) return false;

            char top = str.pop();

            switch(ch){
                case ')': if (top!='(') return false;
                break;
                 case '}': if (top!='{') return false;
                break;
                 case ']': if (top!='[') return false;
                break;
            }
        }
       }
       return str.isEmpty();
    }
}