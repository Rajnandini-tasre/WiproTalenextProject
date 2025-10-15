package com.example.main;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.bean.UserBean;
import com.example.dao.UserDAO;

public class Main {
    public static void main(String[] args) {
        UserDAO dao = new UserDAO();

        System.out.println("--- Starting JDBC Operations ---");

       
        System.out.println("\n--- Scenario 1: Get User Type ---");
        String userType = dao.getUserType("TA1002");
        System.out.println("User Type for TA1002: " + userType);

        
        System.out.println("\n--- Scenario 2: Get Incorrect Attempts ---");
        String attempts = dao.getIncorrectAttempts("AB1001");
        System.out.println("Incorrect attempts status for AB1001: " + attempts);

        System.out.println("\n--- Scenario 3: Change User Type ---");
        String changeTypeResult = dao.changeUserType("RS1003");
        System.out.println("Result of changing RS1003 to Admin: " + changeTypeResult);
        System.out.println("Verifying... New User Type for RS1003: " + dao.getUserType("RS1003"));
        
        
        System.out.println("\n--- Scenario 4: Get Lock Status Count ---");
        int lockCount = dao.getLockStatus();
        System.out.println("Number of users with lock status 0: " + lockCount);

        System.out.println("\n--- Scenario 5: Change Name ---");
        String changeNameResult = dao.changeName("TA1002", "Prasath Kumar");
        System.out.println("Result of changing name for TA1002: " + changeNameResult);

        System.out.println("\n--- Scenario 6: Change Password for Admins ---");
        String changePassResult = dao.changePassword("newAdminPass123");
        System.out.println("Result of changing admin passwords: " + changePassResult);

        System.out.println("\n--- Scenario 7: Add User 1 ---");
        UserBean newUser1 = new UserBean();
        newUser1.setId("JD1004");
        newUser1.setPassword("JD1004");
        newUser1.setName("John Doe");
        newUser1.setIncorrectAttempts(0);
        newUser1.setLockStatus(0);
        newUser1.setUserType("Employee");
        String addUser1Result = dao.addUser_1(newUser1);
        System.out.println("Result of adding John Doe: " + addUser1Result);

        System.out.println("\n--- Scenario 8: Add User 2 ---");
        UserBean newUser2 = new UserBean();
        newUser2.setId("JW1005");
        newUser2.setPassword("JW1005");
        newUser2.setName("Jane Woe");
        newUser2.setIncorrectAttempts(3);
        newUser2.setLockStatus(1); // This user is locked, so insertion should fail
        String addUser2Result = dao.addUser_2(newUser2);
        System.out.println("Result of adding Jane Woe (with lockStatus 1): " + addUser2Result);

        System.out.println("\n--- Scenario 9: Get Users by Type ---");
        ArrayList<UserBean> employees = dao.getUsers("Employee");
        System.out.println("Found Employees:");
        for (UserBean employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\n--- Scenario 10: Store All Records ---");
        ArrayList<UserBean> allUsers = dao.storeAllRecords();
        System.out.println("All users in the database:");
        for (UserBean user : allUsers) {
            System.out.println(user);
        }

        System.out.println("\n--- Scenario 11: Get All Names ---");
        String[] names = dao.getNames();
        System.out.println("All names: " + Arrays.toString(names));
        
        System.out.println("\n--- All Operations Complete ---");
    }
}