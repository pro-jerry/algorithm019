class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> strList = new ArrayList<>();
        generate(strList,"",0,0,n);

        return strList;
    }

    public void generate(List<String> strList,String str,int left,int right,int n){

        if (str.length() == 2*n) {
            strList.add(str);
            return;
        }

        if (left < n) {
            generate(strList,str+"(",left+1,right,n);
        }

        if (right < left) {
            generate(strList,str+")",left,right+1,n);
        }

    }
}