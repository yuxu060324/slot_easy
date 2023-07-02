package com.example.slot_easy;

import android.view.View;
import com.example.slot_easy.Structure.GameInfo;
import com.example.slot_easy.databinding.ActivityMainBinding;
import java.util.Random;

public class ButtonClickEvent {

    // "Max Bet"ボタンを押した際のイベント
    static int maxbet_click_event(ActivityMainBinding binding, Structure.GameInfo gameinfo){

        gameinfo.game_num++;

        binding.screenTopLeft.setText("...");
        binding.screenTopCenter.setText("...");
        binding.screenTopRight.setText("...");
        binding.screenMidLeft.setText("...");
        binding.screenMidCenter.setText("...");
        binding.screenMidRight.setText("...");
        binding.screenBotLeft.setText("...");
        binding.screenBotCenter.setText("...");
        binding.screenBotRight.setText("...");

        gameinfo.stateFlag[0] = false;
        gameinfo.stateFlag[1] = false;
        gameinfo.stateFlag[2] = false;

        return 0;
    }

    // "Left"ボタンをクリックした際のイベント
    static int left_click_event(ActivityMainBinding binding){

        Random rand = new Random();
        Integer num;

        num = Integer.valueOf(rand.nextInt(10));
        binding.screenTopLeft.setText(num.toString());
        num = Integer.valueOf(rand.nextInt(10));
        binding.screenMidLeft.setText(num.toString());
        num = Integer.valueOf(rand.nextInt(10));
        binding.screenBotLeft.setText(num.toString());

        return 0;
    }

    // "Center"ボタンをクリックした際のイベント
    static int center_click_event(ActivityMainBinding binding){

        Random rand = new Random();
        Integer num;

        num = Integer.valueOf(rand.nextInt(10));
        binding.screenTopCenter.setText(num.toString());
        num = Integer.valueOf(rand.nextInt(10));
        binding.screenMidCenter.setText(num.toString());
        num = Integer.valueOf(rand.nextInt(10));
        binding.screenBotCenter.setText(num.toString());

        return 0;
    }

    // "Right"ボタンをクリックした際のイベント
    static int right_click_event(ActivityMainBinding binding){

        Random rand = new Random();
        Integer num;

        num = Integer.valueOf(rand.nextInt(10));
        binding.screenTopRight.setText(num.toString());
        num = Integer.valueOf(rand.nextInt(10));
        binding.screenMidRight.setText(num.toString());
        num = Integer.valueOf(rand.nextInt(10));
        binding.screenBotRight.setText(num.toString());

        return 0;
    }
}
