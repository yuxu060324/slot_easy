package com.example.slot_easy;

import android.widget.TextView;

import com.example.slot_easy.databinding.ActivityMainBinding;

public class Structure {

    static class GameInfo {
        int mode;
        int game_num;
        int chance_num;
        Boolean stateFlag[] = new Boolean[3];
        String SlotReelFilePath = new String();

        public GameInfo(){
            mode = 0;
            game_num = 0;
            chance_num = 0;
            stateFlag[0] = false;
            stateFlag[1] = false;
            stateFlag[2] = false;
            SlotReelFilePath = "";
        }

    }

    public enum ScreenViewIdList {
        Screen_Top_left(R.id.screen_top_left),
        Screen_Top_center(R.id.screen_top_center),
        Screen_Top_right(R.id.screen_top_right),
        Screen_Mid_left(R.id.screen_mid_left),
        Screen_Mid_center(R.id.screen_mid_center),
        Screen_Mid_right(R.id.screen_mid_right),
        Screen_Bot_left(R.id.screen_bot_left),
        Screen_Bot_center(R.id.screen_bot_center),
        Screen_Bot_right(R.id.screen_bot_right);

        private int id;

        private ScreenViewIdList(int id) {
            this.id = id;
        }
    }
}
