package dio.MyFirstProjectPatterns.chain;

public class Button extends HelpHandler {

    private boolean ativo;


    public Button(HelpHandler handler, boolean ativo) {
        super(handler);
        this.ativo=ativo;
    }

    @Override
    public void handleHelp(){
        if (ativo)
            System.out.println("Help do botao tratado");
        else
            super.handleHelp();
    }
}
