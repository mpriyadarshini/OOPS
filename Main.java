class Main {
    private int serialnum;
    private String name;
    private int age;

    public int getEmpSerial() {
        return serialnum;
    }

    public String getEmpName() {
        return name;
    }

    public int getEmpAge() {
        return age;
    }

    public void setEmpAge(int newValue) {
        age = newValue;
    }

    public void setEmpName(String newValue) {
        name = newValue;
    }

    public void setEmpSerial(int newValue) {
        serialnum = newValue;
    }
}