/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myPack;

import java.sql.*;

/**
 *
 * @author Dhwaj
 */
public class registration {
    private String url,site_type,error;
   

   
    public String getError() {
        return error;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSite_type() {
        return site_type;
    }

    public void setSite_type(String site_type) {
        this.site_type = site_type;
    }

    public void setError(String error) {
        this.error = error;
    }

    
    public boolean insert()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
            PreparedStatement ps=con.prepareStatement("insert into web1(url,word,wordcount) values(?,?,0)");
            ps.setString(1,url);
            ps.setString(2,site_type);
            ps.executeUpdate();
            return true;
        }
        catch(Exception ex)
        {
            error=ex.getMessage();
            return false;
        }
        
    }
    public String execute()
        {
            if(insert())
                return "sucess";
            else return "fail";
        }
}
