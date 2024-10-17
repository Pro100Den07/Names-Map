package app;

public class Main {

    public static void main(String[] args) {
        app.DataHandler handler = new app.DataHandler();
        app.UIOperator uiOperator = new app.UIOperator();
        uiOperator.getOutput(handler.getAll());
        uiOperator.getOutput(handler.getById(172));
    }
}
