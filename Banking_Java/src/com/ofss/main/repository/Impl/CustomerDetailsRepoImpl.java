package com.ofss.main.repository.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.repository.CustomerDetailsRepo;


public class CustomerDetailsRepoImpl implements CustomerDetailsRepo{
    private static final String driverName = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/banking_application";
    private static final String userName = "root";
    private static final String password = "root";

    //connect to database
    private Connection connection = null;
    //store and execute query
    private PreparedStatement preparedStatement= null;
    //store result retrived from database
    private ResultSet resultSet = null;

    private static final String SELECT_ALL_CUSTOMERS = "SELECT * FROM bank_customer_details";
    private static final String INSERT_NEW_CUSTOMER ="INSERT INTO bank_customer_details (f_name, l_name, address, city, state, zip, email, phone,cell, bank_customer_approval_status) VALUES (?,?,?,?,?,?,?,?,?,?)";
    private static final String CHANGE_APPROVAL=
                "UPDATE bank_customer_details\n" + //
                "SET bank_customer_approval_status = \"APPROVED\"\n" + //
                "WHERE bank_customer_id=?;";

    @Override
    //GETTING ALL CUSTOMERS
    public List<BankCustomerDetails> getAllCustomers() {
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, userName, password);
            preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMERS);
            resultSet = preparedStatement.executeQuery();

            List<BankCustomerDetails> customerList = new ArrayList<>();
            while(resultSet.next()){
                int customerId = resultSet.getInt("bank_customer_id");
                String firstname = resultSet.getString("f_name");
                String lastname = resultSet.getString("l_name");
                String address = resultSet.getString("address");
                String city = resultSet.getString("city");
                String state = resultSet.getString("state");
                int zip=resultSet.getInt("zip");
                String email= resultSet.getString("email");
                int phone=resultSet.getInt("phone");
                int cell=resultSet.getInt("cell");
                String bank_customer_approval_status=resultSet.getString("bank_customer_approval_status");

                BankCustomerDetails customer = new BankCustomerDetails(customerId, firstname, lastname, 
                address, city, state, zip, email, phone, cell, bank_customer_approval_status
                );
                customerList.add(customer);
            }

            return customerList;

        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver");
            e.printStackTrace();
        } catch (SQLException e) {
           System.out.println("xxxxxxxxxxxFailed to connect database");
            e.printStackTrace();
        }
        return null;
    }

    @Override
    //ADDING NEW CUSTOMERS
    public boolean addNewCustomer(BankCustomerDetails BankCustomerDetails) {
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, userName, password);
            preparedStatement = connection.prepareStatement(INSERT_NEW_CUSTOMER);
            preparedStatement.setString(1, BankCustomerDetails.getF_name());
            preparedStatement.setString(2, BankCustomerDetails.getL_name());
            preparedStatement.setString(3, BankCustomerDetails.getAddress());
            preparedStatement.setString(4, BankCustomerDetails.getCity());
            preparedStatement.setString(5, BankCustomerDetails.getState());
            preparedStatement.setInt(6, BankCustomerDetails.getZip());
            preparedStatement.setString(7, BankCustomerDetails.getEmail());
            preparedStatement.setInt(8, BankCustomerDetails.getPhone());
            preparedStatement.setInt(9, BankCustomerDetails.getCell());
            preparedStatement.setString(10, BankCustomerDetails.getBank_customer_approval_status());

            int rowCount= preparedStatement.executeUpdate();

            if (rowCount > 0) {
                return true;
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQLException Failed to connect database while adding");
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Failed to close connection");
                e.printStackTrace();
            }
        }
        return false;
}



}
