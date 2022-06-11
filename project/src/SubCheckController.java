import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class SubCheckController {

    public static void subCheckController(boolean Check, int SubMainindex, int Index, int Chatindex, int Checkbox) {
        //onclick했을때 db로 메시지 넘기는거
        // 0 -> 1 , check 값을 TRUE로
        // 1 -> 0 , check 값을 FALSE로

        boolean check;
        String msg;
        //서브메시지 : 600
        int index = Index;
        int chatindex = Chatindex;
        int submainindex = SubMainindex;
        int checkbox = Checkbox; //check박스 값


        String port = "7777";
        BufferedReader in;
        Socket socket = new Socket();
        OutputStream out = socket.getOutputstream();

        if (checkbox == 0) {
            checkbox = 1;
            check = TRUE;
        } else {
            checkbox = 0;
            check = FALSE;
        }

        msg = "600";
        try {
            //메시지,메인인덱스, 채팅방인덱스, 체크
            out.write((msg + "|" + String.valueOf(index) + "|" + String.valueOf(chatindex) + "|" + String.valueOf(submainindex) + "|" + String.valueOf(check) + "\n").getBytes());
            in.close();
            out.close();
        } catch (IOException e) {
        }


    }
}

