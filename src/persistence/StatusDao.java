package persistence;

import model.Status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StatusDao {

//    public void insert(Status status) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement(
//                    "insert into Avatar (strength, intelligence, constitution, agility ) values (?,?,?,?)"
//            );
//
//            stmt.setInt(1, status.getStrength());
//            stmt.setInt(2, status.getIntelligence());
//            stmt.setInt(3, status.getConstitution());
//            stmt.setInt(4, status.getAgility());
//
//            stmt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void delete(int id) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement(
//                    "delete from Status where id = ?"
//            );
//
//            stmt.setInt(1, id);
//
//
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
//    public void update(Status status) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement(
//                    "update Status " +
//                            "set strength = ?, intelligence = ?, constitution = ?, agility = ? " +
//                            "where id = ?"
//            );
//
//            stmt.setInt(1, status.getStrength());
//            stmt.setInt(2, status.getIntelligence());
//            stmt.setInt(3, status.getConstitution());
//            stmt.setInt(4, status.getAgility());
//            stmt.setInt(5, status.getId());
//
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
//    public Status searchById(int idQuery) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement(
//                    "select * from Status where id = ?"
//            );
//
//            stmt.setInt(1, idQuery);
//
//            ResultSet rs = stmt.executeQuery();
//
//
//            if (rs.next()) {
//                int id = rs.getInt("id");
//                int stre = rs.getInt("strength");
//                int inte = rs.getInt("intelligence");
//                int cons = rs.getInt("constitution");
//                int agil = rs.getInt("agility");
//
//                return new Status(id, stre, inte, cons, agil);
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
}
