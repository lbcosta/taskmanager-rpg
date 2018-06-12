package persistence;

import model.*;
import java.sql.*;
import java.util.ArrayList;

public class DailyDao {
    public Daily insert(Avatar avatar, Daily daily) {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = Conexao.getConnection();

            stmt = con.prepareStatement("insert into Daily values (?,?,?,?,?)");
            stmt.setString(1, daily.getName());
            stmt.setString(2, daily.getDifficulty());
            stmt.setString(3, daily.getDescription());
            stmt.setBoolean(4, daily.isDailyDone());
            stmt.setInt(5, avatar.getId());
            stmt.executeUpdate();


            stmt = con.prepareStatement("insert into Frequency (startDate, repeats, Daily_name) values (?,?,?)");
            stmt.setDate(1, Date.valueOf(daily.getFrequency().getStartDate()));
            stmt.setInt(2, daily.getFrequency().getRepeats());
            stmt.setString(3, daily.getName());
            stmt.executeUpdate();

            stmt = con.prepareStatement("insert into ChecklistItem (done, name, Daily_name) values (?,?,?)");
            for(CheckListItem c : daily.getChecklist()) {
                stmt.setBoolean(1, c.isDone());
                stmt.setString(2, c.getName());
                stmt.setString(3, daily.getName());
                stmt.executeUpdate();
            }

            return searchByName(daily.getName());



        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void delete(String name) {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = Conexao.getConnection();

            stmt = con.prepareStatement("delete from Frequency where Daily_name = ?");
            stmt.setString(1, name);
            stmt.executeUpdate();

            stmt = con.prepareStatement("delete from ChecklistItem where Daily_name = ?");
            stmt.setString(1, name);
            stmt.executeUpdate();

            stmt = con.prepareStatement("delete from Daily where name = ?");
            stmt.setString(1, name);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnections(con, stmt);
        }

    }

    public void check(Avatar avatar, boolean state, String name) {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = Conexao.getConnection();

            stmt = con.prepareStatement("update Daily set dailyDone = ? where name = ?");
            stmt.setBoolean(1, state);
            stmt.setString(2, name);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnections(con, stmt);
        }
    }

    private void closeConnections(Connection con, PreparedStatement stmt) {
        try {
            if (stmt != null)
                stmt.close();
            if (con != null)
                con.close();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public ArrayList<Daily> getAll(int avatarId) {
        Connection con = null;
        PreparedStatement stmt = null;

        ArrayList<Daily> dailies = new ArrayList<>();

        try {
            con = Conexao.getConnection();

            stmt = con.prepareStatement("select * from Daily where Avatar_id = ?");

            stmt.setInt(1, avatarId);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                String name = rs.getString("name");
                String diff = rs.getString("difficulty");
                String desc = rs.getString("descricao");
                boolean done = rs.getBoolean("dailyDone");
                Frequency freq = null;
                ArrayList<CheckListItem> cli = new ArrayList<>();

                PreparedStatement stmt2 = con.prepareStatement("select * from Frequency where Daily_name = ?");
                stmt2.setString(1, name);

                ResultSet rs2 = stmt2.executeQuery();

                if(rs2.next()) {
                    freq = new Frequency(rs2.getDate("startDate").toLocalDate(), rs2.getInt("repeats"));
                }

                stmt2 = con.prepareStatement("select * from ChecklistItem where Daily_name = ?");
                stmt2.setString(1, name);

                rs2 = stmt2.executeQuery();

                while(rs2.next()) {
                    cli.add(new CheckListItem(rs2.getBoolean("done"), rs2.getString("name")));
                }

                dailies.add(new Daily(name, diff, desc, done, cli, freq));
            }

            return dailies;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnections(con, stmt);
        }

        return null;
    }

    public Daily searchByName(String name) {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = Conexao.getConnection();

            stmt = con.prepareStatement("select * from Daily where name = ?");
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                String nameFound = rs.getString("name");
                String diff = rs.getString("difficulty");
                String desc = rs.getString("descricao");
                boolean done = rs.getBoolean("dailyDone");
                Frequency freq = null;
                ArrayList<CheckListItem> cli = new ArrayList<>();

                PreparedStatement stmt2 = con.prepareStatement("select * from Frequency where Daily_name = ?");
                stmt2.setString(1, name);

                ResultSet rs2 = stmt2.executeQuery();

                if(rs2.next()) {
                    freq = new Frequency(rs2.getDate("startDate").toLocalDate(), rs2.getInt("repeats"));
                }

                stmt2 = con.prepareStatement("select * from ChecklistItem where Daily_name = ?");
                stmt2.setString(1, name);

                rs2 = stmt2.executeQuery();

                while(rs2.next()) {
                    cli.add(new CheckListItem(rs2.getBoolean("done"), rs2.getString("name")));
                }

                return new Daily(nameFound, diff, desc, done, cli, freq);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnections(con, stmt);
        }

        return null;
    }
}
