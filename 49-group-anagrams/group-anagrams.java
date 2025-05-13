class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<HashMap> letters = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < strs[i].length(); j++) {
                Character letter = strs[i].charAt(j);
                if (map.containsKey(letter)) {
                    map.put(letter, map.get(letter) + 1);
                } else {
                    map.put(letter, 1);
                }
            }

            boolean added = false;
            for (int j = 0; j < result.size(); j++) {
                if (letters.get(j).equals(map)) {
                    result.get(j).add(strs[i]);
                    added = true;
                    break;
                }
            }
            if (!added) {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                result.add(group);
                letters.add(map);
            }
        }
        return result;
    }
}