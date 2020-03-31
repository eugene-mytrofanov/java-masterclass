package net.mytrofanov.encapsulation;

public class Printer {

    private static final double TONER_PER_PAGE = 0.1;

    private double tonerLevel;
    private int paperPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(double tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int printPages(int pagesToPrint) {
        if (isDuplexPrinter) {
            double tonerConsumption = TONER_PER_PAGE * pagesToPrint;
            int paperPages = pagesToPrint /= 2 + pagesToPrint % 2;
            if (isTonerEnough(tonerConsumption)) {
                this.tonerLevel -= tonerConsumption;
                this.paperPagesPrinted += paperPages;
                System.out.println("Printing in duplex mode");
                return pagesToPrint;
            } else {
                System.out.println("Error, the toner is low");
                return -1;
            }
        } else {
            double tonerConsumption = TONER_PER_PAGE * pagesToPrint;
            if (isTonerEnough(tonerConsumption)) {
                this.tonerLevel -= tonerConsumption;
                this.paperPagesPrinted += pagesToPrint;
                System.out.println("Printing in regular mode");
                return pagesToPrint;
            } else {
                System.out.println("Error, the toner is low");
                return -1;
            }
        }
    }

    private boolean isTonerEnough(double minTonerLevel) {
        return tonerLevel >= minTonerLevel;
    }

    public double fillUpToner(double tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPaperPagesPrinted() {
        return paperPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
