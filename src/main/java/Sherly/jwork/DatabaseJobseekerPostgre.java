package Sherly.jwork;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatabaseJobseekerPostgre {
    private static Connection c = null;
    private static Statement stmt = null;

    public static Jobseeker addJobseeker(Jobseeker jobseeker) {
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            int id = jobseeker.getId();
            String name = jobseeker.getName();
            String email = jobseeker.getEmail();
            String password = jobseeker.getPassword();
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, 1);

            Date date = cal.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = sdf.format(date);

            String query = "INSERT INTO jobseeker (id, name, email, password, date)"
                    + "VALUES (" + id + ",'" + name + "','" + email + "','" + password + "','" + tanggal + "');";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
            return null;
        }
        return jobseeker;
    }

    public static int getLastId() {
        int value = 0;
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX (id) FROM jobseeker;");
            while (rs.next()) {
                value = rs.getInt("max");
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return value;
    }

    public static Jobseeker getJobseekerById(int id) {
        Jobseeker value = null;
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM jobseeker WHERE id = " + id + "");
            while (rs.next()) {
                id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("date");
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(joinDate);
                String password = rs.getString("password");
                value = new Jobseeker(id, name, email, password, calendar);
            }
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return value;
    }

    public static boolean removeJobseeker(int id) {
        c = DatabaseConnection.connection();
        try {
            stmt = c.createStatement();
            String query = "DELETE * FROM jobseeker WHERE id = \"+id+\";\"";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return true;
    }

    public static Jobseeker getJobseekerLogin(String emailInput, String passwordInput) {
        Jobseeker value = null;
        Connection c = DatabaseConnection.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM jobseeker WHERE email = '" + emailInput + "' AND password = '" + passwordInput + "';");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("date");
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(joinDate);
                String password = rs.getString("password");
                value = new Jobseeker(id, name, email, password, calendar);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return value;
    }

    public static ArrayList<Jobseeker> getJobseekerDatabase() {
        ArrayList<Jobseeker> jobseekers = new ArrayList<>();
        Jobseeker value = null;
        Connection c = DatabaseConnection.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM jobseeker;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("date");
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(joinDate);
                String password = rs.getString("password");
                value = new Jobseeker(id, name, email, password, calendar);
                jobseekers.add(value);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return jobseekers;
    }
}

