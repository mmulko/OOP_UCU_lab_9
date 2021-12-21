package atm;

public abstract class DefaultTray implements Tray {
    private final int bill;
    private Tray nextTray;
    public DefaultTray(int bill) {
        this.bill = bill;
    }

    public void process(int amount) {
        if (nextTray != null) {
            nextTray.process(amount % bill);
        } else if (amount%bill > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("extracted " + amount/bill + " with amount of " + bill);
    }

    public void setNext(Tray nextTray) {
        this.nextTray = nextTray;
    }
}
