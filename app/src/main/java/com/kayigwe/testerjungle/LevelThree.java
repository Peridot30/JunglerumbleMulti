package com.kayigwe.testerjungle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kayigwe on 10/21/15.
 */
public class LevelThree extends Activity {
    private ImageView imgView;
    public ImageView imgView2;
    public ImageView imgView_playlife;
    public ImageView imgView_complife;
    public ImageView imgView_winlose;
    public ImageView imgView_level;
    private TextView result_tv, count_tv;
    int count = 0;
    int play_flag = 0, comp_flag = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levelthree);

        //final Vibrator vibe = (Vibrator) LevelOne.this.getSystemService(Context.VIBRATOR_SERVICE);
        //create vibrate event for a button pressed in the main page
        ImageButton vibratemouse = (ImageButton) findViewById(R.id.vs_other_mouse);
        ImageButton vibratecat = (ImageButton) findViewById(R.id.vs_other_cat);
        ImageButton vibrateelephant = (ImageButton) findViewById(R.id.elephant);
        ImageButton vibratedog = (ImageButton) findViewById(R.id.dog);
        ImageButton vibratepig = (ImageButton) findViewById(R.id.pigreal);
        ImageButton vibraterabbit = (ImageButton) findViewById(R.id.pig);
        ImageButton vibrategiraffe = (ImageButton) findViewById(R.id.giraffe);


        //image view initialization
        imgView = (ImageView) findViewById(R.id.vs_other_otherShow);
        imgView2 = (ImageView) findViewById(R.id.plyrShow);
        imgView_playlife = (ImageView) findViewById(R.id.vs_other_yourlife);
        imgView_complife = (ImageView) findViewById(R.id.vs_other_otherlife);
        imgView_winlose = (ImageView) findViewById(R.id.winlose);
        imgView_level = (ImageView) findViewById(R.id.vs_other_level);
        imgView_level.setImageResource(R.drawable.levelthree);

        //initialization of results and score variables in TextView
        result_tv = (TextView) findViewById(R.id.textScore);
        count_tv = (TextView) findViewById(R.id.textCount);

        MyOnClickListener myOnClickListener = new MyOnClickListener();

        imgView_complife.setImageResource(R.drawable.eight_eight);
        imgView_playlife.setImageResource(R.drawable.eight_eight);
        vibratecat.setOnClickListener(myOnClickListener);
        vibratemouse.setOnClickListener(myOnClickListener);
        vibrateelephant.setOnClickListener(myOnClickListener);
        vibratedog.setOnClickListener(myOnClickListener);
        vibratepig.setOnClickListener(myOnClickListener);
        vibraterabbit.setOnClickListener(myOnClickListener);
        vibrategiraffe.setOnClickListener(myOnClickListener);

    }

    private class MyOnClickListener implements View.OnClickListener {
        final Vibrator vibe = (Vibrator) LevelThree.this.getSystemService(Context.VIBRATOR_SERVICE);

        @Override
        public void onClick(View v) {
            //To do auto-generated method stub
            vibe.vibrate(80);//duration of the vibration for button 1
            int rand = (int)(Math.random()*7 + 1 );

            count++;
            switch(rand){

                case 1:
                    imgView.setImageResource(R.drawable.mouse);
                    switch(v.getId()){
                        case R.id.vs_other_mouse:
                            result_tv.setText("Result:"+"Tied!");
                            imgView2.setImageResource(R.drawable.mouse);
                            count_tv.setText("Round:" + count);
                            break;
                        case R.id.vs_other_cat:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.cat);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.elephant:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.elephant);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.dog:
                            result_tv.setText("Result:"+"Lose!");
                            imgView2.setImageResource(R.drawable.dog);
                            count_tv.setText("Round:" + count);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.pigreal:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.pig);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.pig:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.rabbit);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.giraffe:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.giraffe);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                    }
                    break;
                case 2:
                    imgView.setImageResource(R.drawable.cat);
                    switch(v.getId()){
                        case R.id.vs_other_mouse:
                            result_tv.setText("Result:"+"Lose!");
                            imgView2.setImageResource(R.drawable.mouse);
                            count_tv.setText("Round:" + count);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.vs_other_cat:
                            result_tv.setText("Result:"+"Tied!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.cat);
                            break;
                        case R.id.elephant:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.elephant);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.dog:
                            result_tv.setText("Result:"+"Win!");
                            imgView2.setImageResource(R.drawable.dog);
                            count_tv.setText("Round:" + count);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.pigreal:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.pig);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.pig:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.rabbit);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.giraffe:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.giraffe);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                    }
                    break;
                case 3:
                    imgView.setImageResource(R.drawable.elephant);
                    switch(v.getId()){
                        case R.id.vs_other_mouse:
                            result_tv.setText("Result:"+"Win!");
                            imgView2.setImageResource(R.drawable.mouse);
                            count_tv.setText("Round:" + count);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.vs_other_cat:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.cat);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.elephant:
                            result_tv.setText("Result:"+"Tied!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.elephant);
                            break;
                        case R.id.dog:
                            result_tv.setText("Result:"+"Lose!");
                            imgView2.setImageResource(R.drawable.dog);
                            count_tv.setText("Round:" + count);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.pigreal:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.pig);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.pig:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.rabbit);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.giraffe:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.giraffe);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                    }
                    break;
                case 4:
                    imgView.setImageResource(R.drawable.dog);
                    switch(v.getId()){
                        case R.id.vs_other_mouse:
                            result_tv.setText("Result:"+"Win!");
                            imgView2.setImageResource(R.drawable.mouse);
                            count_tv.setText("Round:" + count);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.vs_other_cat:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.cat);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.elephant:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.elephant);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.dog:
                            result_tv.setText("Result:"+"Tied!");
                            imgView2.setImageResource(R.drawable.dog);
                            count_tv.setText("Round:" + count);
                            break;
                        case R.id.pigreal:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.pig);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.pig:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.rabbit);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.giraffe:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.giraffe);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                    }
                    break;
                case 5:
                    imgView.setImageResource(R.drawable.pig);
                    switch(v.getId()){
                        case R.id.vs_other_mouse:
                            result_tv.setText("Result:"+"Lose!");
                            imgView2.setImageResource(R.drawable.mouse);
                            count_tv.setText("Round:" + count);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.vs_other_cat:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.cat);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.elephant:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.elephant);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.dog:
                            result_tv.setText("Result:"+"Win!");
                            imgView2.setImageResource(R.drawable.dog);
                            count_tv.setText("Round:" + count);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.pigreal:
                            result_tv.setText("Result:"+"Tied!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.pig);
                            break;
                        case R.id.pig:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.rabbit);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.giraffe:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.giraffe);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                    }
                    break;
                case 6:
                    imgView.setImageResource(R.drawable.rabbit);
                    switch(v.getId()){
                        case R.id.vs_other_mouse:
                            result_tv.setText("Result:"+"Lose!");
                            imgView2.setImageResource(R.drawable.mouse);
                            count_tv.setText("Round:" + count);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.vs_other_cat:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.cat);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.elephant:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.elephant);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.dog:
                            result_tv.setText("Result:"+"Win!");
                            imgView2.setImageResource(R.drawable.dog);
                            count_tv.setText("Round:" + count);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.pigreal:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.pig);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.pig:
                            result_tv.setText("Result:"+"Tied!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.rabbit);
                            break;
                        case R.id.giraffe:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.giraffe);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                    }
                    break;
                case 7:
                    imgView.setImageResource(R.drawable.giraffe);
                    switch(v.getId()){
                        case R.id.vs_other_mouse:
                            result_tv.setText("Result:"+"Win!");
                            imgView2.setImageResource(R.drawable.mouse);
                            count_tv.setText("Round:" + count);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.vs_other_cat:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.cat);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.elephant:
                            result_tv.setText("Result:"+"Lose!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.elephant);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.dog:
                            result_tv.setText("Result:"+"Lose!");
                            imgView2.setImageResource(R.drawable.dog);
                            count_tv.setText("Round:" + count);
                            play_flag++;
                            if(play_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (play_flag == 2){imgView_playlife.setImageResource(R.drawable.eight_six);}
                            else if (play_flag == 3){imgView_playlife.setImageResource(R.drawable.eight_five);}
                            else if (play_flag == 4){imgView_playlife.setImageResource(R.drawable.eight_four);}
                            else if (play_flag == 5){imgView_playlife.setImageResource(R.drawable.eight_three);}
                            else if (play_flag == 6){imgView_playlife.setImageResource(R.drawable.eight_two);}
                            else if (play_flag == 7){imgView_playlife.setImageResource(R.drawable.eight_one);}
                            else if (play_flag == 8){imgView_playlife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.pigreal:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:" + count);
                            imgView2.setImageResource(R.drawable.pig);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.pig:
                            result_tv.setText("Result:"+"Win!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.rabbit);
                            comp_flag++;
                            if(comp_flag == 1){imgView_complife.setImageResource(R.drawable.eight_seven);}
                            else if (comp_flag == 2){imgView_complife.setImageResource(R.drawable.eight_six);}
                            else if (comp_flag == 3){imgView_complife.setImageResource(R.drawable.eight_five);}
                            else if (comp_flag == 4){imgView_complife.setImageResource(R.drawable.eight_four);}
                            else if (comp_flag == 5){imgView_complife.setImageResource(R.drawable.eight_three);}
                            else if (comp_flag == 6){imgView_complife.setImageResource(R.drawable.eight_two);}
                            else if (comp_flag == 7){imgView_complife.setImageResource(R.drawable.eight_one);}
                            else if (comp_flag == 8){imgView_complife.setImageResource(R.drawable.eight_zero);}
                            break;
                        case R.id.giraffe:
                            result_tv.setText("Result:"+"Tied!");
                            count_tv.setText("Round:"+count);
                            imgView2.setImageResource(R.drawable.giraffe);
                            break;
                    }
                    break;
            }
            //take away the image views and put either you win or you lose
            if (play_flag >= 8 || comp_flag >= 8){
                imgView.setImageResource(R.drawable.empty);
                imgView2.setImageResource(R.drawable.empty);
                imgView_level.setImageResource(R.drawable.empty);
               if (play_flag >= 8){
                    imgView_winlose.setImageResource(R.drawable.lose);
                   startActivity(new Intent(getApplicationContext(), TransitionThree.class));
                }
                else if (comp_flag>=8){
                    imgView_winlose.setImageResource(R.drawable.win);
                   startActivity(new Intent(getApplicationContext(), Congratulations.class));
                }
               // finish();
            }

        }
    }



}
