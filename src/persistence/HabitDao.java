package persistence;

import model.*;
import java.sql.*;
import java.util.ArrayList;

public class HabitDao {
//    public Habit insert(Avatar avatar, Habit habit) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement("insert into Habit values (?,?,?,?,?,?,?,?)");
//            stmt.setString(1, habit.getName());
//            stmt.setString(2, habit.getDifficulty());
//            stmt.setString(3, habit.getDescription());
//            stmt.setBoolean(4, habit.isPositiveInfluence());
//            stmt.setBoolean(5, habit.isNegativeInfluence());
//            stmt.setInt(6, habit.getPositivePoints());
//            stmt.setInt(7, habit.getNegativePoints());
//            stmt.setInt(8, avatar.getId());
//            stmt.executeUpdate();
//
//            return searchByName(habit.getName());
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
//    public void delete(String name) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement("delete from Habit where name = ?");
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
//    public void incPosPoints(String name) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement("update Habit set positivePoints = positivePoints + 10 where name = ?");
//            stmt.setString(1, name);
//            stmt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeConnections(con, stmt);
//        }
//    }
//
//    public void incNegPoints() {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement("update Habit set negativePoints = negativePoints + 10");
//            stmt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeConnections(con, stmt);
//        }
//    }
//
//
//    private void closeConnections(Connection con, PreparedStatement stmt) {
//        try {
//            if (stmt != null)
//                stmt.close();
//            if (con != null)
//                con.close();
//        } catch (SQLException e1) {
//            e1.printStackTrace();
//        }
//    }
//
//    public ArrayList<Habit> getAll(int avatarId) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        ArrayList<Habit> habits = new ArrayList<>();
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement("select * from Habit where Avatar_id = ?");
//
//            stmt.setInt(1, avatarId);
//
//            ResultSet rs = stmt.executeQuery();
//
//            while(rs.next()) {
//                String name = rs.getString("name");
//                String diff = rs.getString("difficulty");
//                String desc = rs.getString("descricao");
//                boolean pi = rs.getBoolean("positiveInfluence");
//                boolean ni = rs.getBoolean("negativeInfluence");
//                int pp = rs.getInt("positivePoints");
//                int np = rs.getInt("negativePoints");
//
//                habits.add(new Habit(name, diff, desc, pi, ni, pp, np));
//            }
//
//            return habits;
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
//    public Habit searchByName(String name) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement("select * from Habit where name = ?");
//            stmt.setString(1, name);
//            ResultSet rs = stmt.executeQuery();
//            if(rs.next()) {
//                String nameFound = rs.getString("name");
//                String diff = rs.getString("difficulty");
//                String desc = rs.getString("descricao");
//                boolean pi = rs.getBoolean("positiveInfluence");
//                boolean ni = rs.getBoolean("negativeInfluence");
//                int pp = rs.getInt("positivePoints");
//                int np = rs.getInt("negativePoints");
//
//                return new Habit(nameFound, diff, desc, pi, ni, pp, np);
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
