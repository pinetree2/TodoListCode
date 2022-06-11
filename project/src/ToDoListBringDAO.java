import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class ToDoListBringDAO {

    public ToDoListBringDAO( ArrayList<ListDataMain> datamainlist ){
        Connection con = null;

        String url = "127.0.0.1:3306"; // 서버 주소
        String user_name = "root"; //  접속자 id
        String password = "1234"; // 접속자 pw
        PreparedStatement stmt =null;
        // Statement statement = null;
        ResultSet rs = null;

        int M_idx =0;
        String M_Task = null;
        Date Deadline =null;
        int M_Check =0;
        int SubNum =0;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + url + "/messenger?serverTimezone=UTC", user_name, password);
            System.out.println("Connect Success!");

            String sql = "SELECT * FROM messenger.chatmainsub WHERE M_idx >= 1 and M_Task is not null";
            //채팅방번호 조건도 추가되어야함
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()) {
                M_idx =rs.getInt("M_idx");
                M_Task = rs.getString("M_Task");
                Deadline = rs.getDate("Deadline") ;
                M_Check = rs.getInt("M_check");
                SubNum = rs.getInt("SubNum");
                ListDataMain temp = new ListDataMain(M_idx,)
            }

            ToDoListBringDTO.setM_idx(M_idx);
            ToDoListBringDTO.setM_Task(M_Task);
            ToDoListBringDTO.setDeadline(Deadline);
            ToDoListBringDTO.setM_Check(M_Check);
            ToDoListBringDTO.setSubNum(SubNum);


        } catch (ClassNotFoundException|SQLException e) {

            System.out.println("[SQL Error : " + e.getMessage() + "]");

        }  finally {

            //사용순서와 반대로 close 함
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }



    }

}
