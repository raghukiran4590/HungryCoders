package src.main.java.multithreading;

public class VolatileVariable {

    private volatile boolean flag;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean getFlag() {
        return this.flag;
    }
}
