import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppCommand {
    private int id_app_command;
    public double amount;

    public AppCommand()
    {
        this.amount=0;
    }
    public AppCommand(int id_app_command,double amount){
        this.id_app_command=id_app_command;
        this.amount=amount;
    }


    public void setIdappcommand(int id_app_command){
        this.id_app_command=id_app_command;
    }
    public int getIdappcommand(){
        return id_app_command;
    }

    public double getamount(){
        return amount;
    }


    public static List<AppCommand> retrieveFromDatabase() {
        List<AppCommand> appCommands = new ArrayList<>();

        try (Connection connection = ConnectionPool.getConnection();
             PreparedStatement stmt = connection.prepareStatement("SELECT * FROM app_command")) {

            try (ResultSet res = stmt.executeQuery()) {

                while (res.next()) {
                    int id_app_command = res.getInt("id_app_command");
                    int amount = res.getInt("amount");
                    AppCommand appCommand = new AppCommand(id_app_command, amount);
                    appCommands.add(appCommand);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appCommands;
    }

}