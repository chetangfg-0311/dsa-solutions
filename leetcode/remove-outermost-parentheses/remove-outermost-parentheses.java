1class Solution {
2    public String removeOuterParentheses(String s) {
3       Stack<Integer> st = new Stack<>();
4        String str="";
5        int idx=0;
6        int start =1;
7        
8        while(idx<s.length()){
9            while(s.charAt(idx)=='('){
10                st.push(idx);
11                idx++;
12            }
13            while(!st.empty() && s.charAt(idx)==')'){
14                st.pop();
15                idx++;
16            }
17            if(st.empty()){
18                str += s.substring(start,idx-1);
19                start = idx+1;
20            }
21        }
22//         for(int i=0;i<s.length();i++){
23//             char c = s.charAt(i);
24//             if(c =='('){
25//                 st.push(i);
26//             }
27//             else if( c==')'){
28//               idx= st.pop();
29                
30//                 if(st.empty()){
31//                     str += s.substring(idx+1,i);
32//                 }
33//             }
34//         }
35        
36        return str ;
37    }
38}