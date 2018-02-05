public class ctciRansomNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        String tmp[];
        Integer count;
        
        magazineMap = new Hashtable<String, Integer>();
        tmp = magazine.split(" ");
        for(int i = 0; i < tmp.length; i++){
            count = magazineMap.get(tmp[i]);
            if (count == null) count = 0;
            magazineMap.put(tmp[i], count + 1);
        }
        
        noteMap = new Hashtable<String, Integer>();
        tmp = note.split(" ");
        for(int i = 0; i < tmp.length; i++){
            count = noteMap.get(tmp[i]);
            if (count == null) count = 0;
            noteMap.put(tmp[i], count + 1);
        }
    }
    
    public boolean solve() {
        Set<String> set = noteMap.keySet();
        for(String x : set) {
            if (magazineMap.get(x) == null || noteMap.get(x) > magazineMap.get(x)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}

