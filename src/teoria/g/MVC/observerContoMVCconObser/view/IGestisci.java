package teoria.g.MVC.observerContoMVCconObser.view;

import teoria.g.MVC.observerContoMVCconObser.controller.Controller;

import javax.swing.*;

public interface IGestisci {
    public JTextField getInputVal();

    public void setController(Controller c);
}
