package uk.ac.rgu.cm2115.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import uk.ac.rgu.cm2115.Context;
import uk.ac.rgu.cm2115.MainApp;
import uk.ac.rgu.cm2115.abstractions.BankAccount;
import uk.ac.rgu.cm2115.abstractions.Controller;
import uk.ac.rgu.cm2115.models.Customer;

public class AccountDetailsController extends Controller<Customer> {

    private Integer newAccountBalance;

    @FXML
    private TextField depositAmountTextField;

    @FXML
    private TextField withdrawAmountTextField;

    @FXML
    private Label accountBalance;

    @FXML
    private Label accountName;

    @FXML
    private Label accountNumber;

    @FXML
    public void initialize() {
    }

    @Override
    public void setModel(Customer model) {
        this.model = model;

        BankAccount account = (BankAccount) Context.getInstance().get("account");

        accountName.setText(account.getAccountName());
        accountNumber.setText(account.getAccountNumber().toString());
        accountBalance.setText(account.getBalance().toString());

        newAccountBalance = Integer.parseInt(accountBalance.getText());
    }

    @FXML
    public void deposit() {
        BankAccount account = (BankAccount) Context.getInstance().get("account");
        if (depositAmountTextField.getText().isEmpty()) {
            showAlert("Error", "Missing Fields", "Please enter an amount to deposit.");
            return;
        }

        Integer amount = Integer.parseInt(depositAmountTextField.getText());
        account.deposit(amount);

        newAccountBalance += amount;
        accountBalance.setText(newAccountBalance.toString());

        showAlert("Success", "Deposit Successful", "You have deposited £" + amount + ".");
        depositAmountTextField.clear();
    }

    @FXML
    public void withdraw() {
        BankAccount account = (BankAccount) Context.getInstance().get("account");

        if (withdrawAmountTextField.getText().isEmpty()) {
            showAlert("Error", "Missing Fields", "Please enter an amount to withdraw.");
            return;
        }

        Integer amount = Integer.parseInt(withdrawAmountTextField.getText());
        account.withdraw(amount);

        newAccountBalance -= amount;
        accountBalance.setText(newAccountBalance.toString());

        showAlert("Success", "Withdrawal Successful", "You have withdrawn £" + amount + ".");
        withdrawAmountTextField.clear();
    }

    @FXML
    private void backToCustomer() throws IOException {
        MainApp.setScene("Customer");
    }

    private void showAlert(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

}
