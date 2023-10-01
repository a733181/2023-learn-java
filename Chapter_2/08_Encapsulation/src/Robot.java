public class Robot {
    private String name;
    private int madeYear;

    public Robot(String name, int madeYear) {
        this.name = name;
        this.madeYear = madeYear;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMadeYear() {
        return this.madeYear;
    }

    public void setMadeYear(int madeYear) {
        if (madeYear < 100) {
            System.out.println("請輸入100以上");
        } else {
            this.madeYear = madeYear;
        }
    }
}
