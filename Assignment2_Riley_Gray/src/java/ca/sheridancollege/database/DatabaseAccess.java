/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.database;

import ca.sheridancollege.beans.Book;
import ca.sheridancollege.Enum.Values;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Riley
 */
public class DatabaseAccess {

    public static String username = "root";
    public static String password = "root";

    /* public static void main(String[] args) {
        DatabaseAccess da= new DatabaseAccess();
        Book b= new Book("r","b",2,3,"g","brampton");
        da.addBook(b);

   }*/
    public ArrayList<Book> getBooks(String location) {
        ArrayList<Book> books = new ArrayList<Book>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//creates connection to library 

            Connection con = DriverManager.getConnection//create connection to mysql server
                    ("jdbc:mysql://localhost/books", username, password);
            //databse,                    username, password

            Statement st = con.createStatement();
            String query = "SELECT * FROM " + location;

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                double price = rs.getDouble(4);
                int quantity = rs.getInt(5);
                String courses = rs.getString(6);

                Book b = new Book(id, title, author, price, quantity, courses);
                books.add(b);
            }
            for (Book i : books) {
                System.out.println(i);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return books;
    }

    public void addBook(Book book) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");//creates connection to library 

            Connection con = DriverManager.getConnection//create connection to mysql server
                    ("jdbc:mysql://localhost/books", username, password);
            //databse,                    username, password

            Statement st = con.createStatement();
            String query = "INSERT INTO " + book.getStore() + " VALUES (?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 0);
            ps.setString(2, book.getTitle());
            ps.setString(3, book.getAuthor());
            ps.setDouble(4, book.getPrice());
            ps.setInt(5, book.getQuantity());
            ps.setString(6, book.getCourses());

            //st.executeQuery(query);//return info
            // st.executeUpdate(query);//change table values 
            ps.executeUpdate();
            con.close();//closes connction 
        } catch (Exception e) {
            System.out.println("connection falied");
            System.out.println(e);
        }
    }

    public void dummy() {
        try {
            String location = "brampton";
            int i = 0;

            for (i = i; i < 3; i++) {
                Class.forName("com.mysql.cj.jdbc.Driver");//creates connection to library 

                Connection con = DriverManager.getConnection//create connection to mysql server
                        ("jdbc:mysql://localhost/books", username, password);
                //databse,                    username, password

                Statement st = con.createStatement();

                if (i == 1) {
                    location = "mississauga";
                }
                if (i == 2) {
                    location = "oakville";
                }

                String query = "INSERT INTO " + location + "  VALUES (?,?,?,?,?,?)";

                for (int x = 0; x < 30; x++) {

                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setInt(1, 0);
                    ps.setString(2, Values.getRandomValue().toString());
                    ps.setString(3, Values.getRandomValue().toString());
                    ps.setDouble(4, (Math.round(((Math.random() * ((999.99 - 1) + 1)) + 1) * 100)) / 100);
                    ps.setInt(5, (int) (Math.round(Math.random() * ((999.99 - 1) + 1)) + 1));
                    ps.setString(6, Values.getRandomValue().toString());

                    ps.executeUpdate();
                }
                con.close();//closes connction 

            }
        } catch (Exception e) {
            System.out.println("connection falied");
            System.out.println(e);
        }
    }

    public void deleteBook(int id, String location) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//creates connection to library 

            Connection con = DriverManager.getConnection//create connection to mysql server
                    ("jdbc:mysql://localhost/books", username, password);

            String query = "DELETE FROM " + location + "  WHERE id= " + id;
            Statement st = con.createStatement();

            st.executeUpdate(query);
            con.close();

        } catch (Exception e) {
            System.out.println("connection falied");
            System.out.println(e);
        }
    }

    public Book getBook(int iD, String location) {
        Book b = new Book();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//creates connection to library 

            Connection con = DriverManager.getConnection//create connection to mysql server
                    ("jdbc:mysql://localhost/books", username, password);

            String query = "SELECT * FROM " + location + "  WHERE id= " + iD;
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                double price = rs.getDouble(4);
                int quantity = rs.getInt(5);
                String courses = rs.getString(6);

                b = new Book(id, title, author, price, quantity, courses);
            }
            con.close();

        } catch (Exception e) {
            System.out.println("connection falied");
            System.out.println(e);
        }
        return b;

    }

    public void editBook(int id, String title, String author, Double price,
            int quantity, String courses, String location) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//creates connection to library 

            Connection con = DriverManager.getConnection//create connection to mysql server
                    ("jdbc:mysql://localhost/books", username, password);
            Statement st = con.createStatement();

            String query = "UPDATE " + location + " SET title= '" + title + "' WHERE id= "+ id;
            st.executeUpdate(query);

            query = "UPDATE " + location + " SET author= '" +author + "' "
                    + "WHERE id= "+ id;
            st.executeUpdate(query);

            query = "UPDATE " + location + " SET price= " + price
                     + " WHERE id= "+ id;
            st.executeUpdate(query);

            query = "UPDATE " + location + " SET inventory_quantity= " + quantity
                     + " WHERE id= "+ id;
            st.executeUpdate(query);

            query = "UPDATE " + location + " SET related_courses= '" + courses + "' "
                    + "WHERE id= "+ id;
            st.executeUpdate(query);
            con.close();

        } catch (Exception e) {
            System.out.println("connection falied");
            System.out.println(e);
        }
    }
    
    
    public void purchaseBook(int id, String location, int quantity, int want) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//creates connection to library 

            Connection con = DriverManager.getConnection//create connection to mysql server
                    ("jdbc:mysql://localhost/books", username, password);

            String query = "UPDATE " + location + " SET inventory_quantity= inventory_quantity -" + want + " WHERE id= "+ id;
            Statement st = con.createStatement();

            st.executeUpdate(query);
            con.close();

        } catch (Exception e) {
            System.out.println("connection falied");
            System.out.println(e);
        }
    }

}
