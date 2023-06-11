/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Msi-GK
 */
public class Clothes {
    private String id, merk, type, color, size, amount;

    public Clothes(String id, String merk, String type, String color, String size, String amount) {
        this.id = id;
        this.merk = merk;
        this.type = type;
        this.color = color;
        this.size = size;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    public void createDB() {
        Connection conn = null;
        PreparedStatement stat = null;
        String query = "INSERT INTO tbbaju (merk, type, color, size, amount) VALUES (?, ?, ?, ?, ?)";
        try {
            conn = Conn.getConnection();
            stat = conn.prepareStatement(query);
            stat.setString(1, merk);
            stat.setString(2, type);
            stat.setString(3, color);
            stat.setString(4, size);
            stat.setString(5, amount);
            stat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stat != null) {
                    stat.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateDB() {
        Connection conn = null;
        PreparedStatement stat = null;
        String query = "UPDATE tbbaju set merk=?, type=?, color=?, size=?, amount=? WHERE id=?";
        try {
            conn = Conn.getConnection();
            stat = conn.prepareStatement(query);
            stat.setString(1, merk);
            stat.setString(2, type);
            stat.setString(3, color);
            stat.setString(4, size);
            stat.setString(5, amount);
            stat.setString(6, id);
            stat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stat != null) {
                    stat.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteDB(String valueId) {
        Connection conn = null;
        PreparedStatement stat = null;
        String query = "DELETE FROM tbbaju WHERE id=?";
        try {
            conn = Conn.getConnection();
            stat = conn.prepareStatement(query);
            stat.setString(1, valueId);
            stat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stat != null) {
                    stat.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
