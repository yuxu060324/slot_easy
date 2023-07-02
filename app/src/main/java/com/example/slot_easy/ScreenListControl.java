package com.example.slot_easy;

import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScreenListControl {

    public static int[] judge_screenList(int[][] screenList){

        int statelist[] = new int[8];
        int splitlist[] = new int[3];

        for (int i=0; i<8; i++) {
            switch (i) {
                case 0:
                    splitlist = screenList[0].clone();
                    break;
                case 1:
                    splitlist = screenList[1].clone();
                    break;
                case 2:
                    splitlist = screenList[2].clone();
                    break;
                case 3:
                    splitlist[0] = screenList[0][0];
                    splitlist[1] = screenList[1][0];
                    splitlist[2] = screenList[2][0];
                    break;
                case 4:
                    splitlist[0] = screenList[0][1];
                    splitlist[1] = screenList[1][1];
                    splitlist[2] = screenList[2][1];
                    break;
                case 5:
                    splitlist[0] = screenList[0][2];
                    splitlist[1] = screenList[1][2];
                    splitlist[2] = screenList[2][2];
                    break;
                case 6:
                    splitlist[0] = screenList[0][0];
                    splitlist[1] = screenList[1][1];
                    splitlist[2] = screenList[2][2];
                    break;
                case 7:
                    splitlist[0] = screenList[0][2];
                    splitlist[1] = screenList[1][1];
                    splitlist[2] = screenList[2][0];
                    break;

            }

            statelist[i] = judge_splitlist(splitlist);

        }

        return statelist;
    }

    static int judge_splitlist(int[] splitlist){

        if (splitlist[0]==splitlist[1] && splitlist[1]==splitlist[2]){
            return 1;
        }

        if (splitlist[1] == 2){
            if ((splitlist[0]==1 && splitlist[2]==3)
                || (splitlist[0]==3 && splitlist[2]==3)){
                return 2;
            }
        }

        if (splitlist[1] == 5){
            if ((splitlist[0]==4 && splitlist[2]==6)
                    || (splitlist[0]==6 && splitlist[2]==4)){
                return 3;
            }
        }

        if (splitlist[1] == 8){
            if ((splitlist[0]==7 && splitlist[2]==9)
                    || (splitlist[0]==9 && splitlist[2]==7)){
                return 4;
            }
        }

        return 0;
    }
}
