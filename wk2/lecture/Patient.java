class Patient {
    String name;
    int height;
    
    Patient(String n, int h) {
        name = n;
        height = h;
    }
    
    void updateHeight(int newHeight) {
        height = newHeight;
    }
    
    public static void main(String[] args) {
        Patient p1 = new Patient("Jane Doe", 65);
        p1.updateHeight(67);
    }
}

