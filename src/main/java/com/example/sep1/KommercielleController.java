package com.example.sep1;

import com.example.sep1.Kommercielle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class KommercielleController {
    @FXML private TextField BudgetTextField;
    @FXML private TextField forventet_tid;
    @FXML private TextField størrelse;
    @FXML private TextField type;
    @FXML private  TextField Etaage;

    private Kommercielle kommercielle;
    private Projektlist projektlist;

    public void initialize() {

        // Initialiser med gemte data fra Kommercielle-objektet
        if (kommercielle != null) {
            BudgetTextField.setText(String.valueOf(kommercielle.getBudget()));
            forventet_tid.setText(String.valueOf(kommercielle.getForventetTid()));
            størrelse.setText(String.valueOf(kommercielle.getStørrelse()));
            type.setText(kommercielle.getType());
            Etaage.setText(String.valueOf(kommercielle.getAntalEtager()));
        }
    }

    public void SubmitChanges() {
        try {
            // Hent data fra tekstfelterne
            int Nybudget = Integer.parseInt(BudgetTextField.getText());
            int NyforventetTid = Integer.parseInt(forventet_tid.getText());
            int Nystørrelse = Integer.parseInt(størrelse.getText());
            String Nytype = type.getText();
            int NyEtaage = Integer.parseInt(Etaage.getText());

            // Opret eller opdater Kommercielle-objektet
            if (kommercielle == null) {
                kommercielle = new Kommercielle(Nybudget, NyforventetTid,Nystørrelse,Nytype, NyEtaage);
            } else {
                kommercielle.setBudgetForKommercielle(Nybudget);
                kommercielle.setForventettidKommercielle(NyforventetTid);
                kommercielle.setStørrelseKommercielle(Nystørrelse);
                kommercielle.setTypeKommercielle(Nytype);
                kommercielle.setAntalEtager(NyEtaage);
            }



        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        projektlist.setKommercielledefault(kommercielle);
        //return kommercielle; //TODO: GEM TIL FIL ISTEDET
    }
    public void cancelpressed(ActionEvent event) throws IOException
    {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();

    }

    public void setProjektlist(Projektlist projektlist)
    {

        this.projektlist = projektlist;
    }
}
