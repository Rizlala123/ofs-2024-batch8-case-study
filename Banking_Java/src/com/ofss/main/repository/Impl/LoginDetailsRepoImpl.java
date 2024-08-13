package com.ofss.main.repository.Impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.domain.LoginInformation;
import com.ofss.main.repository.LoginDetailsRepo;

public class LoginDetailsRepoImpl implements LoginDetailsRepo{
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

    private static final String CHECK_CUSTOMER_EXISTS =
                "SELECT bank_customer_id,bank_customer_approval_status  FROM bank_customer_details where bank_customer_id=?;";
    private static final String CREATE_CUSTOMER_LOGIN="INSERT INTO login_information (username, password, attempts, login_status, bank_customer_id) VALUES (?,?,?,?,?);";


    @Override
    public BankCustomerDetails checkCustomerLoginApproval(int customerID) {
            try {
                Class.forName(driverName);
                connection = DriverManager.getConnection(url, userName, password);
                preparedStatement = connection.prepareStatement(CHECK_CUSTOMER_EXISTS);
                preparedStatement.setInt(1, customerID);
                resultSet = preparedStatement.executeQuery();
                
                if (resultSet.next()) {
                    int customerId = resultSet.getInt("bank_customer_id");
                    String bank_customer_approval_status=resultSet.getString("bank_customer_approval_status");
                    BankCustomerDetails BankCustomerDetails= new BankCustomerDetails(customerId,bank_customer_approval_status);
                    return BankCustomerDetails;
                }
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("LoginDetailsRepoImpl issue");
            return null;
        }

        @Override
        public boolean addNewCustomerLogin(int customerId,LoginInformation LoginInformation) {
            try {
                    Class.forName(driverName);
                    connection = DriverManager.getConnection(url, userName, password);
                    preparedStatement = connection.prepareStatement(CREATE_CUSTOMER_LOGIN);
                    preparedStatement.setString(1, LoginInformation.getUsername());
                    preparedStatement.setString(2, LoginInformation.getPassword());
                    preparedStatement.setInt(3, 0);
                    preparedStatement.setString(4, "UNBLOCKED");
                    preparedStatement.setInt(5, customerId);
                    int rowCount= preparedStatement.executeUpdate();
                
                    if (rowCount > 0) {
                        return true;
                    }
                    

            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            return false;    
        }

    @Override
    public boolean validateCustomerLogin(LoginInformation LoginInformation) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateCustomerLogin'");
    }




}
