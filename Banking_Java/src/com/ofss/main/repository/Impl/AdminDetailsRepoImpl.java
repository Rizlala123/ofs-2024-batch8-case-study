package com.ofss.main.repository.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.repository.AdminDetailsRepo;

public class AdminDetailsRepoImpl implements AdminDetailsRepo {

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

    private static final String SELECT_ALL_CUSTOMERS_APPROVAL = "select bank_customer_id,f_name,bank_customer_approval_status from bank_customer_details;";
    private static final String APPROVE_CUSTOMER=
                "UPDATE bank_customer_details\n" + //
                "set bank_customer_approval_status=\"APPROVED\"\n" + //
                "WHERE bank_customer_id=?;";

    @Override
    public List<BankCustomerDetails> getAllCustomersAdmin() {
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, userName, password);
            preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMERS_APPROVAL);
            resultSet = preparedStatement.executeQuery();

            List<BankCustomerDetails> customerListApproval = new ArrayList<>();
            while(resultSet.next()){
                int bankcustomerid = resultSet.getInt("bank_customer_id");
                String fname = resultSet.getString("f_name");
                String approvalStatus = resultSet.getString("bank_customer_approval_status");

                BankCustomerDetails employee = new BankCustomerDetails(bankcustomerid,fname, approvalStatus);
                customerListApproval.add(employee);
            }

            return customerListApproval;
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver");
            e.printStackTrace();
        } catch (SQLException e) {
           System.out.println("Failed to connect database");
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean approveCustomer(BankCustomerDetails BankCustomerDetails) {
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, userName, password);
            preparedStatement = connection.prepareStatement(APPROVE_CUSTOMER);
            preparedStatement.setInt(1, BankCustomerDetails.getBank_customer_id());

            int rowCount= preparedStatement.executeUpdate();

            if (rowCount > 0) {
                return true;
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect database");
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

