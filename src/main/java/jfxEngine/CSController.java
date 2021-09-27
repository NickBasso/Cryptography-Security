package jfxEngine;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import logic.PolicyExtractor;
import logic.PolicyReader;

public class CSController {
    @FXML
    private Label outerLabel;

    @FXML
    private TextField policyPathInput;

    @FXML
    private TextArea policyTextArea;

    @FXML
    protected void onReadPolicyButtonClick() {
        PolicyReader pr = new PolicyReader(policyPathInput.getText());
        String data = pr.readFile();
        PolicyExtractor pe = new PolicyExtractor(data);
        String res = pe.extractPolicyItems();

        outerLabel.setText("Policy read!");
        policyTextArea.setText(res);
        System.out.println(res);
    }

    @FXML
    protected void onPreviewSelectionChanged() {
        outerLabel.setText("");
    }
}