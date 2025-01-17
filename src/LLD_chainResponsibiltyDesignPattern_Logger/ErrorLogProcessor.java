package LLD_chainResponsibiltyDesignPattern_Logger;

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }

    public void log(int logLevel, String message) {

        if (logLevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else {

            super.log(logLevel, message);
        }

    }    
}
