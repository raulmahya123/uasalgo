import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a description of class cvxcv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cvxcv extends Actor
{
    /**
     * Act - do whatever the cvxcv wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public cvxcv()
    {
        setRotation(10);
    }
    public void act()
    {
        moveArround();
    }
    public void moveArround()
    {
    if(Greenfoot.isKeyDown("d"))
    {
        setLocation(getX()+5,getY());
    }
    if(Greenfoot.isKeyDown("a"))
    {
        setLocation(getX()-5,getY());
    }
        if(Greenfoot.isKeyDown("w"))
    {
        setLocation(getX(),getY()-5);
    }
         if(Greenfoot.isKeyDown("s"))
    {
        setLocation(getX()-5,getY()+5);
    }
}

public class DBConnect{
    final String DRIVER="com.mysql.jdbc.Driver";
    final String DB_PATH="jdbc:mysql:// localhost/java_test";
   String userName=null;
    String password=null;
    Connection conn=null;
   Statement stmt=null;
   // our counstructor will accept username and password from mysql
    public DBConnect(String name,String pass){
        userName=name;
        password=pass;
   }
    // let's defineIconnection method(like in php,we used separate file for
    public void connect()throws SQLException,Exception{
   
    Class.forName(DRIVER);
    System.out.println("Connecting ...");
    conn=DriverManager.getConnection(DB_PATH,userName,password);
    stmt = conn.createStatement();
    }
   // method to close our statement and connection
    public void closeConnection()throws SQLException,Exception{
    stmt.close();
    conn.close();
    }
    public Statement getStatement(){
        return stmt;
    }
}
}

    
   



