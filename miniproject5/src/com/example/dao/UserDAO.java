package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.example.bean.UserBean;
import com.example.util.DBUtil;

public class UserDAO {

    
    public String getUserType(String userId) {
        String userType = null;
        String sql = "SELECT UserType FROM UserDetails WHERE UserID = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, userId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    userType = rs.getString("UserType");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userType;
    }

    
    public String getIncorrectAttempts(String userId) {
        String result = "User not found";
        String sql = "SELECT IncorrectAttempts FROM UserDetails WHERE UserID = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, userId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int attempts = rs.getInt("IncorrectAttempts");
                    if (attempts == 0) {
                        result = "No Incorrect Attempt";
                    } else if (attempts == 1) {
                        result = "One Time";
                    } else {
                        result = "Incorrect Attempt Exceeded";
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public String changeUserType(String userId) {
        String sql = "UPDATE UserDetails SET UserType = 'Admin' WHERE UserID = ?";
        int rowsUpdated = 0;
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, userId);
            rowsUpdated = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (rowsUpdated > 1) {
            return "Update Success";
        } else {
            return "Update Failed";
        }
    }
    
    public int getLockStatus() {
        int count = 0;
        String sql = "SELECT COUNT(*) FROM UserDetails WHERE LockStatus = 0";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
    
    public String changeName(String id, String name) {
        String sql = "UPDATE UserDetails SET Name = ? WHERE UserID = ?";
        int rowsUpdated = 0;
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, name);
            pstmt.setString(2, id);
            rowsUpdated = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (rowsUpdated > 0) ? "Success" : "Failed";
    }

    public String changePassword(String password) {
        String sql = "UPDATE UserDetails SET Password = ? WHERE UserType = 'Admin'";
        int rowsUpdated = 0;
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, password);
            rowsUpdated = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (rowsUpdated > 0) ? "Changed" : "0";
    }
    
    public String addUser_1(UserBean bean) {
        String sql = "INSERT INTO UserDetails VALUES (?, ?, ?, ?, ?, ?)";
        int rowsInserted = 0;
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, bean.getId());
            pstmt.setString(2, bean.getPassword());
            pstmt.setString(3, bean.getName());
            pstmt.setInt(4, bean.getIncorrectAttempts());
            pstmt.setInt(5, bean.getLockStatus());
            pstmt.setString(6, bean.getUserType());
            rowsInserted = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (rowsInserted > 0) ? "Success" : "Fail";
    }

    public String addUser_2(UserBean bean) {
        if (bean.getLockStatus() != 0) {
            return "Fail"; }
        return addUser_1(bean);
    }

    // Scenario 9: Get all users of a specific type
    public ArrayList<UserBean> getUsers(String userType) {
        ArrayList<UserBean> userList = new ArrayList<>();
        String sql = "SELECT * FROM UserDetails WHERE UserType = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, userType);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    UserBean user = new UserBean();
                    user.setId(rs.getString("UserID"));
                    user.setPassword(rs.getString("Password"));
                    user.setName(rs.getString("Name"));
                    user.setIncorrectAttempts(rs.getInt("IncorrectAttempts"));
                    user.setLockStatus(rs.getInt("LockStatus"));
                    user.setUserType(rs.getString("UserType"));
                    userList.add(user);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
    
    public ArrayList<UserBean> storeAllRecords() {
        ArrayList<UserBean> allUsers = new ArrayList<>();
        String sql = "SELECT * FROM UserDetails";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                UserBean user = new UserBean();
                user.setId(rs.getString("UserID"));
                user.setPassword(rs.getString("Password"));
                user.setName(rs.getString("Name"));
                user.setIncorrectAttempts(rs.getInt("IncorrectAttempts"));
                user.setLockStatus(rs.getInt("LockStatus"));
                user.setUserType(rs.getString("UserType"));
                allUsers.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allUsers;
    }
    
    public String[] getNames() {
        ArrayList<String> nameList = new ArrayList<>();
        String sql = "SELECT Name FROM UserDetails";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                nameList.add(rs.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nameList.toArray(new String[0]);
    }
}