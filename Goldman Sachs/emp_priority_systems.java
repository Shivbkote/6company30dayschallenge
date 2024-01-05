class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> a_times) {
        Map<String,List<Integer>> amap = new HashMap<>();
        for(List<String> acc:a_times){
            if(!amap.containsKey(acc.get(0))){
                amap.put(acc.get(0),new ArrayList<>());
            }
            char[] second = acc.get(1).toCharArray();
            int hour = (second[0]-'0')*10 +second[1]-'0';
            int min = (second[2]-'0')*10+second[3]-'0';
            amap.get(acc.get(0)).add(hour*60+min);
        }
        List<String> high = new ArrayList<>();
        for(String key:amap.keySet()){
            List<Integer> val = amap.get(key);
            Collections.sort(val);
            for(int j =0;j<val.size()-2;j++){
                if(val.get(j+2)-val.get(j)<=59){
                    high.add(key);
                    break;
                }
            }
        }
        return high;
    }
}