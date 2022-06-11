import javax.swing.*;
import java.util.*;


public class ToDoList extends JList{
    private JButton button1;
    private JLabel toDoListLabel;
    private JPanel panel1;
    private JScrollBar scrollBar1;
    private JScrollPane scrollPane1;
    private JPanel list;

    //ArrayList<ListDataMain> datamainlist = new ArrayList<ListDataMain>();
//    ArrayList<ListDataMain> datamainlist = ToDoListBring.bringMain();
    //datamainlist = ToDoListBring.bringMain();
    //mainlist.addAll(ToDoListBring.bringMain());
    //ArrayList<ListDataSub> datasublist = ToDoListBring.bringSub();

    List datamainlist = ToDoListBring.bringMain();


//    for(int i = 0; i<datamainlist.size(); i++){

    //}

    //쿼리문으로 데이터 가져오고 if main_idx 가 1인 데이터 없으면 저장된 to do list가 없습니다. 라고 출력
    //우선 채팅방에서 가져온 데이터들 순차적으로 전위순회
    //main idx 1부터 미리 가져온 mainNum까지
    //main 1가져오고 subnum 가져와서 sub 1부터 subNum까지 출력 ->mainNum까지 반복

    public static void run() {
        JFrame frame = new JFrame("To-do List");
        frame.setContentPane(new ToDoList().panel1);
        frame.pack();
        frame.setVisible(true);
    }



}
