import java.util.Date;

public class ListDataSub extends ListData{
    int M_idx;

    ListDataSub(int M_idx, int idx, String Task, Date Deadline, int check) {
        super(idx, Task, Deadline, check);
        this.M_idx = M_idx;
    }

    public int getM_idx(){
        return M_idx;
    }
}