public static long pthFactor(long n, long p) {
        ArrayList<Long> arr = new ArrayList<>();
        for(long i = 1; i < Math.sqrt(n) + 1; i++)
            if(n % i == 0){
                arr.add(i);
                if(n / i != i) arr.add(n / i);
            }
        Collections.sort(arr);
        if(arr.size() > p - 1) return arr.get(new Long(p - 1).intValue());
        else return 0;
    }