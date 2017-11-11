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
public class QuestionEntry {
    private String topic,question,option1,option2,option3,option4,description,error;
    private int answer;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

   public boolean insert()
   {
       try
       {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
            PreparedStatement ps=con.prepareStatement("insert into test_questions(topic,question,option1,option2,option3,option4,answer,description) values(?,?,?,?,?,?,?,?)");
            ps.setString(1, topic);
            ps.setString(2, question);
            ps.setString(3, option1);
            ps.setString(4, option2);
            ps.setString(5, option3);
            ps.setString(6, option4);
            ps.setInt(7, answer);
            ps.setString(8, description);
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
        else 
            return "fail";
    }
}
