class Solution {
    
    String[] combination = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public void combopair(String num, String empty, List<String> output){
        
        if(num.length()==0){
            output.add(empty);
            return;
        }

        char firstDigit = num.charAt(0);
        String digitLeft = num.substring(1);
        
        String key = combination[Integer.parseInt(""+firstDigit)];
        for(char ch : key.toCharArray()){
            combopair(digitLeft,""+empty+ch,output);
        }
        
    }
    
    public List<String> letterCombinations(String num) {
       
        List<String> range = new ArrayList<>();
         if(num.equals("")){
             return range;
         }
        
        combopair(num,"",range);
        return range;
        
    }
}