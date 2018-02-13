/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeacherSystem;

import com.google.gson.Gson;
import combo.courses;
import combo.teachers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ivan
 */
public class FirstViewServlet extends HttpServlet {
    private PreparedStatement st;
    private ResultSet rs;
    private List ls = new ArrayList();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = "jdbc:mysql://localhost:3306/databasenew";
        String driver = "com.mysql.jdbc.Driver";
        String username = "root";
        String passwordDB = "yura85";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, passwordDB);
            String chose_teacher = request.getParameter("st_v");
            System.out.println("c=" + chose_teacher);
            String sql = "";
            String action = request.getParameter("action");
            PrintWriter out = response.getWriter();
            Gson n = new Gson();
            sql = "SELECT first_name, surname, academic_title, degree, organization, post, photo FROM teachers WHERE id_teacher=?";
            st = con.prepareStatement(sql);
            st.setString(1, chose_teacher);
            rs = st.executeQuery();
            while (rs.next()) {
                ls.add(new teachers(rs.getString("first_name"),
                        rs.getString("surname"), rs.getString("academic_title"), rs.getString("degree"), rs.getString("organization"), rs.getString("post"), rs.getString("photo")));
            }
            sql = "SELECT id_course, course_name FROM courses WHERE id_teacher=" + chose_teacher;
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                ls.add(new courses(rs.getString("id_course"), rs.getString("course_name")));
            }
            System.out.println(ls);
            String json = n.toJson(ls);
            System.out.println(json);
            out.println(json);
            ls.clear();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(FirstViewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
