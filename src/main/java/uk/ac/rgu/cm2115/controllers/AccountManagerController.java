package uk.ac.rgu.cm2115.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import uk.ac.rgu.cm2115.Context;
import uk.ac.rgu.cm2115.MainApp;
import uk.ac.rgu.cm2115.abstractions.Controller;
import uk.ac.rgu.cm2115.models.AccountManager;
import uk.ac.rgu.cm2115.models.Customer;
import uk.ac.rgu.cm2115.models.CustomerType;

public class AccountManagerController extends Controller<AccountManager> {

    @FXML
    private TextField customerName;

    @FXML
    private TextField customerAddress;

    @FXML
    private ListView<Customer> listCustomers;

    @FXML
    private Label statusLabel;

    @FXML
    private Button btnCreateCustomer;

    @FXML
    private HBox hboxCustomer;

    @FXML
    private ChoiceBox<CustomerType> customerType;

    @Override
    public void setModel(AccountManager model) {
        this.model = model;
        updateCustomerList();
        customerType.getItems().addAll(CustomerType.INDIVIDUAL, CustomerType.BUSINESS, CustomerType.CHARITY);
    }

    public void updateCustomerList() {
        // prefill fields
        customerName.setText("John Doe");
        customerAddress.setText("1 Main Street");
        customerType.getSelectionModel().select(CustomerType.INDIVIDUAL);

        listCustomers.getItems().clear();
        listCustomers.getItems().addAll(model.getCustomers());
    }

    @FXML
    public void createCustomer() {
        String name = customerName.getText();
        String address = customerAddress.getText();
        CustomerType type = customerType.getSelectionModel().getSelectedItem();

        if (name.isEmpty() || address.isEmpty() || type == null) {
            statusLabel.setText("Please enter all fields.");
        } else {
            Customer customer = new Customer();
            customer.setName(name);
            customer.setAddress(address);
            customer.setType(type);
            model.addCustomer(customer);
            listCustomers.getItems().add(customer);
            statusLabel.setText("Customer created.");
            customerName.clear();
            customerAddress.clear();
            customerType.getSelectionModel().clearSelection();
        }
    }

    @FXML
    public void viewCustomerDetails() throws IOException {
        Customer selectedCustomer = listCustomers.getSelectionModel().getSelectedItem();

        if (selectedCustomer != null) {
            // set customer in context
            Context.getInstance().put("customer", selectedCustomer);

            // go to customer scene
            MainApp.setScene("Customer", new Customer());
            statusLabel.setText("Viewing customer details...");
        } else {
            statusLabel.setText("Please select a customer.");
        }
    }
}
