package net.mytrofanov.composition.pc;

public class PC {

    private Motherboard motherboard;
    private Monitor monitor;
    private Case theCase;

    public PC(Motherboard motherboard, Monitor monitor, Case theCase) {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.theCase = theCase;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Linux Ubuntu");
    }

    private void drawLogo() {
        monitor.drawPixelAt(5, 5, "yellow");
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Case getTheCase() {
        return theCase;
    }
}
