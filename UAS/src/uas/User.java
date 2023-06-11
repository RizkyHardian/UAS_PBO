/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Msi-GK
 */
public class User {
    final private String username, password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public void CreateAccountDB() {
        try {
            Connection conn = Conn.getConnection();
            PreparedStatement stat = conn.prepareStatement("INSERT INTO tbuser (usr, pass) VALUES (?, ?)");
            stat.setString(1, this.username);
            stat.setString(2, this.password);
            stat.executeUpdate();
            stat.close();
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean IsValid(String username, String password) {
        boolean isValid = false;
        try {
            Connection conn = Conn.getConnection();
            PreparedStatement stat = conn.prepareStatement("SELECT * FROM tbuser WHERE usr = ? AND pass = ?");
            stat.setString(1, username);
            stat.setString(2, password);
            ResultSet resultSet = stat.executeQuery();
            if (resultSet.next()) {
                isValid = true;
            }
            stat.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isValid;
    }
    
        public static boolean IsExist(String username) {
        boolean exist = false;
        try {
            Connection conn = Conn.getConnection();
            PreparedStatement stat = conn.prepareStatement("SELECT * FROM tbuser WHERE usr = ?");
            stat.setString(1, username);
            ResultSet resultSet = stat.executeQuery();
            if (resultSet.next()) {
                exist = true;
            }
            stat.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exist;
    }
}
