class NumberPrinter implements Runnable {
    private String numberToPrint;
    private int delayInMilliseconds;

    // Конструктор, щоб налаштувати кожен потік
    public NumberPrinter(String numberToPrint, int delayInMilliseconds) {
        this.numberToPrint = numberToPrint;
        this.delayInMilliseconds = delayInMilliseconds;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(delayInMilliseconds);

                System.out.println(numberToPrint);
            }
        } catch (InterruptedException e) {
            System.out.println("Потік для " + numberToPrint + " було зупинено.");
        }
    }
}