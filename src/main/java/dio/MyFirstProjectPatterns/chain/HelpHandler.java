package dio.MyFirstProjectPatterns.chain;



public abstract class HelpHandler {


        private HelpHandler handler;

    public HelpHandler(HelpHandler handler) {
        this.handler = handler;
    }

    public void handleHelp() {
        if(this.handler !=null){
            System.out.println("chamada do help");
            this.handler.handleHelp();
        } else
            System.out.println("Evento help sem tratamento");
    }


}

