class Solution {  //HashMap Solution
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map = new HashMap<>();
        int i;
        List<String> result = new ArrayList<>();
        String sequence;
        for(i=0;i<=s.length()-10;i++){
            sequence = s.substring(i,i+10);
            map.put(sequence,map.getOrDefault(sequence,0)+1);
            
        }
        for(Map.Entry<String,Integer> item : map.entrySet()){
            if(item.getValue()>1){
                result.add(item.getKey());
            }
            
        }


        return result;
        
    }
}

class Solution {  //HashSet solution
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> sequences = new HashSet<>();
        int i;
        String sequence;

        for(i=0;i<=s.length()-10;i++){
            sequence = s.substring(i,i+10);
            if(set.contains(sequence)){
                sequences.add(sequence);
            }
            else{
                set.add(sequence);
            }
        }
        return new ArrayList(sequences);

    }
}

