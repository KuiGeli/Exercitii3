public class Exc5Robot {

    private int position;

    public Exc5Robot() {
        this.position = 1;
    }

    public void change(int k) {

        if (k <= position) {
            k = +position;
        }

    }

    public String toString() {
        return String.valueOf(position);
    }

}
