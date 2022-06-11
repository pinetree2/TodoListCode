import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class MainCheckController {

    //onclick했을때 db로 메시지 넘기는거
    // 0 -> 1 , check 값을 TRUE로
    // 1 -> 0 , check 값을 FALSE로


    public static void MainCheckController(boolean Check,  int Index, int Chatindex, int Checkbox) {


        boolean check;
        String msg;
        //메인 메시지 : 550
        int index;
        int chatindex;
        int checkbox = Checkbox; //check박스 값


        String port = "7777";
        BufferedReader in;
        Socket socket;
        OutputStream out =socket.getOutputstream();



        if(checkbox == 0){
            checkbox =1;
            check = TRUE;
        }else{
            checkbox =0;
            check =FALSE;
        }


        msg = "550";
        try{
            //메시지,메인인덱스, 채팅방인덱스, 체크
            out.write((msg+"|"+String.valueOf(index)+"|"+String.valueOf(chatindex)+"|"+String.valueOf(check)+"\n").getBytes());
            in.close();
            out.close();
        }catch (IOException e){
        }



    }
    }

//
//JOptionPane.showMessageDialog(null, "일정 내용을 입력하세요");

}



