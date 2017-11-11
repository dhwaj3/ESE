/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myPack;

import java.sql.*;
import java.util.ArrayList;



/**
 *
 * @author Dhwaj
 */
public class Userlogin {
    private String query ,url[],error,word;
    //private int age;
ArrayList<String> list=new ArrayList<String>();  
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String[] getUrl() {
        return url;
    }

    public void setUrl(String[] url) {
        this.url = url;
    }
public ArrayList<String> getList() {  
    return list;  
}  
public void setList(ArrayList<String> list) {  
    this.list = list;  
}  
   

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    
    public boolean check()
    {
        try
        {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
             System.out.println("reached1");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
            PreparedStatement ps=con.prepareStatement("select * from wb1 where word like '"+query+"%'");
            //ps.setString(1,s1);
            System.out.println("reached2");
           ResultSet rs=ps.executeQuery();
          if(rs.next())
          { while(rs.next())
           {
               
               System.out.println("reached4");
               System.out.println(rs.getString(1));
               list.add(rs.getString(1));
            }}
          else return false;
         System.out.println("list is \n"+list);
         
        }
        catch(Exception ex)
        {
            error=ex.getMessage();
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    public String execute()
    {
        if(check())
            return "sucess";
        else 
            return "fail";
    }
    
   
}
