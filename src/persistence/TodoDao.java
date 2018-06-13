package persistence;

import model.*;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class TodoDao {
//    public Todo insert(Avatar avatar, Todo todo) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement("insert into Todo values (?,?,?,?,?,?)");
//            stmt.setString(1, todo.getName());
//            stmt.setString(2, todo.getDifficulty());
//            stmt.setString(3, todo.getDescription());
//            stmt.setBoolean(4, todo.isTodoDone());
//            stmt.setInt(5, avatar.getId());
//            stmt.setDate(6, Date.valueOf(todo.getDueDate()));
//            stmt.executeUpdate();
//
//
//            stmt = con.prepareStatement("insert into Reminders (remind, Todo_name) values (?,?)");
//            for(LocalDate r : todo.getReminders()) {
//                stmt.setDate(1, Date.valueOf(r));
//                stmt.setString(2, todo.getName());
//                stmt.executeUpdate();
//            }
//
//            return searchByName(todo.getName());
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    public void delete(String name) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement("delete from Reminders where Todo_name = ?");
//            stmt.setString(1, name);
//            stmt.executeUpdate();
//
//            stmt = con.prepareStatement("delete from Todo where name = ?");
//            stmt.setString(1, name);
//            stmt.executeUpdate();
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeConnections(con, stmt);
//        }
//
//    }
//
//    public void check(Avatar avatar, boolean state, String name) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement("update Todo set todoDone = ? where name = ?");
//            stmt.setBoolean(1, state);
//            stmt.setString(2, name);
//            stmt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeConnections(con, stmt);
//        }
//    }
//
//    private void closeConnections(Connection con, PreparedStatement stmt) {
////        try {
////            if (stmt != null)
////                stmt.close();
////            if (con != null)
////                con.close();
////        } catch (SQLException e1) {
////            e1.printStackTrace();
////        }
//    }
//
//    public ArrayList<Todo> getAll(int avatarId) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        ArrayList<Todo> todos = new ArrayList<>();
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement("select * from Todo where Avatar_id = ?");
//
//            stmt.setInt(1, avatarId);
//
//            ResultSet rs = stmt.executeQuery();
//
//            while(rs.next()) {
//                String name = rs.getString("name");
//                String diff = rs.getString("difficulty");
//                String desc = rs.getString("descricao");
//                boolean done = rs.getBoolean("todoDone");
//                Date due = rs.getDate("dueDate");
//                ArrayList<LocalDate> reminders = new ArrayList<>();
//
//                PreparedStatement stmt2 = con.prepareStatement("select * from Reminders where Todo_name = ?");
//                stmt2.setString(1, name);
//
//                ResultSet rs2 = stmt2.executeQuery();
//
//                while(rs2.next()) {
//                    reminders.add(rs2.getDate("remind").toLocalDate());
//                }
//
//                todos.add(new Todo(name, diff, desc, done, due.toLocalDate(), reminders));
//            }
//
//            return todos;
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeConnections(con, stmt);
//        }
//
//        return null;
//    }
//
//    public Todo searchByName(String name) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement("select * from Todo where name = ?");
//            stmt.setString(1, name);
//            ResultSet rs = stmt.executeQuery();
//            if(rs.next()) {
//                String nameFound = rs.getString("name");
//                String diff = rs.getString("difficulty");
//                String desc = rs.getString("descricao");
//                boolean done = rs.getBoolean("todoDone");
//                Date due = rs.getDate("dueDate");
//                ArrayList<LocalDate> reminders = new ArrayList<>();
//
//                PreparedStatement stmt2 = con.prepareStatement("select * from Reminders where Todo_name = ?");
//                stmt2.setString(1, name);
//
//                ResultSet rs2 = stmt2.executeQuery();
//
//                while(rs2.next()) {
//                    reminders.add(rs2.getDate("remind").toLocalDate());
//                }
//
//                return new Todo(name, diff, desc, done, due.toLocalDate(), reminders);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeConnections(con, stmt);
//        }
//
//        return null;
//    }
}
