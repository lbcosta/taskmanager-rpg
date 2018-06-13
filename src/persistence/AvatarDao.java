package persistence;

import model.Avatar;
import model.Status;
import model.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AvatarDao {

//    public void insert(Avatar avatar) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement(
//                    "insert into Avatar (name, experience, level, health, coins, points) values (?,?,?,?,?,?)"
//            );
//
//            stmt.setString(1, avatar.getName());
//            stmt.setInt(2, avatar.getExperience());
//            stmt.setInt(3, avatar.getLevel());
//            stmt.setInt(4, avatar.getHealth());
//            stmt.setInt(5, avatar.getCoins());
//            stmt.setInt(6, avatar.getPoints());
//
//            stmt.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void update(Avatar avatar) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement(
//                    "update Avatar set name = ?, experience = ?, level = ?, health = ?, coins = ?, points = ? where idAvatar = ?"
//            );
//
//            stmt.setString(1, avatar.getName());
//            stmt.setInt(2, avatar.getExperience());
//            stmt.setInt(3, avatar.getLevel());
//            stmt.setInt(4, avatar.getHealth());
//            stmt.setInt(5, avatar.getCoins());
//            stmt.setInt(6, avatar.getPoints());
//            stmt.setInt(7, avatar.getId());
//
//            stmt.executeUpdate();
//
//
//            stmt = con.prepareStatement("select idStatus from Avatar where idAvatar = ?");
//            stmt.setInt(1, avatar.getId());
//            ResultSet rs = stmt.executeQuery();
//            if(rs.next()) {
//                int idStatus = rs.getInt("idStatus");
//
//                stmt = con.prepareStatement(
//                        "update Status set strength = ?, intelligence = ?, constitution = ?, agility = ? where id = ?"
//                );
//
//                stmt.setInt(1, avatar.getStatus().getStrength());
//                stmt.setInt(2, avatar.getStatus().getIntelligence());
//                stmt.setInt(3, avatar.getStatus().getConstitution());
//                stmt.setInt(4, avatar.getStatus().getAgility());
//                stmt.setInt(5, idStatus);
//
//                stmt.executeUpdate();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//    public Avatar searchById(int id) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//        Avatar avatar = new Avatar();
//        Status status = new Status();
//        ArrayList<Task> tasks = new ArrayList<>();
//
//        try {
//            con = Conexao.getConnection();
//
//            stmt = con.prepareStatement(
//                    "select * from Avatar where idAvatar = ?"
//            );
//
//            stmt.setInt(1, id);
//
//            ResultSet rs = stmt.executeQuery();
//
//
//            if (rs.next()) {
//                avatar.setId(rs.getInt("idAvatar"));
//                avatar.setName(rs.getString("name"));
//                avatar.setExperience(rs.getInt("experience"));
//                avatar.setLevel(rs.getInt("level"));
//                avatar.setHealth(rs.getInt("health"));
//                avatar.setCoins(rs.getInt("coins"));
//                avatar.setPoints(rs.getInt("points"));
//            }
//
//            tasks.addAll(new DailyDao().getAll(id));
//            tasks.addAll(new HabitDao().getAll(id));
//            tasks.addAll(new TodoDao().getAll(id));
//
//            avatar.setTasks(tasks);
//
//            status = new StatusDao().searchById(id);
//
//            avatar.setStatus(status);
//
//            return avatar;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    public void buff(int id) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            con = Conexao.getConnection();
//            stmt = con.prepareStatement("select experience from Avatar where idAvatar = ?");
//            stmt.setInt(1, id);
//            ResultSet rs = stmt.executeQuery();
//            if (rs.next()) {
//                int xp = rs.getInt("experience");
//                if (xp + 10 >= 100) {
//                    stmt = con.prepareStatement("update Avatar set level = level + 1, points = 10, experience = 0, coins = coins + 10 where idAvatar = ?");
//                } else {
//                    stmt = con.prepareStatement("update Avatar set experience = experience + 10, coins = coins + 10 where idAvatar = ?");
//                }
//                stmt.setInt(1, id);
//                stmt.executeUpdate();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeConnections(con, stmt);
//        }
//    }
//
//    public void debuff(int id) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//
//        try {
//            con = Conexao.getConnection();
//            stmt = con.prepareStatement("select health, coins from Avatar where idAvatar = ?");
//            stmt.setInt(1, id);
//            ResultSet rs = stmt.executeQuery();
//            if (rs.next()) {
//                int hp = rs.getInt("health");
//                int coins = rs.getInt("coins");
//                if (hp - 10 <= 0) {
//                    if(coins - 10 <= 0)
//                        stmt = con.prepareStatement("update Avatar set health = 0, coins = 0 where idAvatar = ?");
//                    else
//                        stmt = con.prepareStatement("update Avatar set health = 0, coins = coins - 10 where idAvatar = ?");
//                } else {
//                    stmt = con.prepareStatement("update Avatar set health = health - 10, coins = coins - 10 where idAvatar = ?");
//                }
//                stmt.setInt(1, id);
//                stmt.executeUpdate();
//            }
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
}
