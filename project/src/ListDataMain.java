import java.util.Date;

public class ListDataMain extends ListData{
    int SubNum;

    ListDataMain(int idx, String Task, Date Deadline, int check, int SubNum) {
        super(idx, Task, Deadline, check);
        this.SubNum = SubNum;
    }

    public int getSubNum(){
        return SubNum;
    }
}