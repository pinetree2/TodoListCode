import java.util.*;

public class ListData {

    int idx;
    String Task;
    Date Deadline;
    int check;

    ListData(int idx, String Task, Date Deadline, int check){
        this.idx = idx;
        this.Task = Task;
        this.Deadline = Deadline;
        this.check = check; //check했는지 안했는지를 알아야 클라쪽에서 서버한테 보내니까?
    }

    public int getIdx(){
        return idx;
    }
    public String getTask(){
        return Task;
    }
    public Date getDeadline(){
        return Deadline;
    }
    public int check(){
        return check;
    }
}

//{1, aaa, 2022-00-00, 0}, {...

