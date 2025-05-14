class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> indexes = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!indexes.isEmpty() && temperatures[i] > temperatures[indexes.peek()]) {
                result[indexes.peek()] = i - indexes.peek();
                indexes.pop();
            }
            indexes.push(i);
        }
        return result;
    }
}