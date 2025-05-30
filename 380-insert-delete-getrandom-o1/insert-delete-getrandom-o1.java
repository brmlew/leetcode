class RandomizedSet {
    List<Integer> set;

    public RandomizedSet() {
        this.set = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (this.set.contains(val)) {
            return false;
        } else {
            this.set.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if (this.set.contains(val)) {
            this.set.remove(Integer.valueOf(val));
            return true;
        } else {
            return false;
        }
    }
    
    public int getRandom() {
        Random rand = new Random();
        int randomNum = rand.nextInt(this.set.size());
        return this.set.get(randomNum);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */