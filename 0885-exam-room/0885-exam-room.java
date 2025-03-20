class ExamRoom {
    int N;
    TreeSet<Integer> seats;
    public ExamRoom(int n) {
        seats = new TreeSet<>(); // ordered set to keep track of students
        this.N = n;
    }
    
    public int seat() {
        int student = 0;
        
        if (seats.size() > 0) { // if at least one student, otherwise seat at 0
            int dist = seats.first(); // the student at lowest seat 
            Integer prev = null; 
            for (Integer seat: seats) { 
                if (prev != null) { 
                    int d = (seat - prev)/2; // every time we see a new student we can seat them between 2 other students
                    if (d > dist) { // select the max range
                        dist = d; 
                        student = prev + d; 
                    }
                }
                prev = seat; 
            }
            if (N - 1 - seats.last() > dist) {
                student = N-1;
            }
        }
        seats.add(student);
        return student;
    }
    
    public void leave(int p) {
        seats.remove(p);
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(n);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */