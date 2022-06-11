import java.sql.*;
import java.util.*;

public class ToDoListBring {
    public static ArrayList<ListDataMain> bringMain() {
        Connection con = Connect.makeConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        //int index = 1;
        //int mainNum = 3;
        ArrayList<ListDataMain> datamainlist = new ArrayList<ListDataMain>();

        ToDoListBringDAO toDoListBringDAO = new ToDoListBringDAO(datamainlist);

        try {
            String printString = "SELECT * FROM messenger.chatmainsub WHERE M_idx >= 1 and M_Task is not null";
            //채팅방번호 조건도 추가되어야함
            pstmt = con.prepareStatement(printString);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                ListDataMain temp = new ListDataMain(rs.getInt("M_idx"), rs.getString("M_Task"),
                        rs.getDate("Deadline"), rs.getInt("M_check"),
                        rs.getInt("SubNum"));
                datamainlist.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (ListDataMain s : datamainlist)
            System.out.println(s);
        return (datamainlist);
    }
    public static ArrayList<ListDataSub> bringSub() {
        Connection con = Connect.makeConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<ListDataSub> datasublist = new ArrayList<ListDataSub>();
        try {
            //String printString = "SELECT * FROM project_table WHERE M_idx >= 1 and M_Task is null";
            String printString = "SELECT * FROM project_table.chatmainsub WHERE S_idx >= 1";
            pstmt = con.prepareStatement(printString);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                ListDataSub temp = new ListDataSub(rs.getInt("M_idx"), rs.getInt("S_idx"),
                        rs.getString("S_Task"), rs.getDate("S_Deadline"), rs.getInt("S_check"));
                datasublist.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datasublist;
    }
}
