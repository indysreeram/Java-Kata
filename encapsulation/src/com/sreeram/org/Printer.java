package com.sreeram.org;

/**
 * Created by sreeram.srini on 2/26/18.
 */
public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private Boolean isDuplexPrinter;

    public Printer(int tonerLevel, Boolean isDuplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else this.tonerLevel=-1;

        this.pagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount >0 && tonerAmount <=100) {
           if (getTonerLevel()+ tonerAmount > 100) {
               return -1;
           } else {
               setTonerLevel(getTonerLevel()+tonerAmount);
               return getTonerLevel();
           }
        }
        else return -1;

    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (isDuplexPrinter) {
            pagesToPrint = ((pagesToPrint / 2) + (pagesToPrint % 2));
            System.out.println("Printing in duplex mode");
        }
            setPagesPrinted(getPagesPrinted()+pagesToPrint);
            return pagesToPrint;

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public Boolean getDuplexPrinter() {
        return isDuplexPrinter;
    }

    public void setDuplexPrinter(Boolean duplexPrinter) {
        isDuplexPrinter = duplexPrinter;
    }
}
