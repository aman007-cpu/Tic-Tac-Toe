package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private String startgame = "X";
    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5,xCount=0,yCount=0,i=0;
    private TextView scorex,scoreo;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= findViewById(R.id.buttonimage1);
        btn2= findViewById(R.id.buttonimage2);
        btn3= findViewById(R.id.buttonimage3);
        btn4= findViewById(R.id.buttonimage4);
        btn5= findViewById(R.id.buttonimage5);
        btn6= findViewById(R.id.buttonimage6);
        btn7= findViewById(R.id.buttonimage7);
        btn8= findViewById(R.id.buttonimage8);
        btn9= findViewById(R.id.buttonimage9);
        scorex = findViewById(R.id.scorex);
        scoreo = findViewById(R.id.scorey);
        reset = findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setImageDrawable(null);
                btn2.setImageDrawable(null);
                btn3.setImageDrawable(null);
                btn4.setImageDrawable(null);
                btn5.setImageDrawable(null);
                btn6.setImageDrawable(null);
                btn7.setImageDrawable(null);
                btn8.setImageDrawable(null);
                btn9.setImageDrawable(null);
                resetvalue();
                xCount = 0;
                yCount = 0;
                scorex.setText("Score X : "+String.valueOf(xCount));
                scoreo.setText("Score Y : "+String.valueOf(yCount));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startgame.equals("X"))
                {
                    btn1.setImageResource(R.drawable.cross);
                    b1 = 1;
                    i++;
                }
                else
                {
                    btn1.setImageResource(R.drawable.circle);
                    b1=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startgame.equals("X"))
                {
                    btn2.setImageResource(R.drawable.cross);
                    b2 = 1;
                    i++;
                }
                else
                {
                    btn2.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startgame.equals("X"))
                {
                    btn3.setImageResource(R.drawable.cross);
                    b3 = 1;
                    i++;
                }
                else
                {
                    btn3.setImageResource(R.drawable.circle);
                    b3=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startgame.equals("X"))
                {
                    btn4.setImageResource(R.drawable.cross);
                    b4 = 1;
                    i++;
                }
                else
                {
                    btn4.setImageResource(R.drawable.circle);
                    b4=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startgame.equals("X"))
                {
                    btn5.setImageResource(R.drawable.cross);
                    b5 = 1;
                    i++;
                }
                else
                {
                    btn5.setImageResource(R.drawable.circle);
                    b5=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startgame.equals("X"))
                {
                    btn6.setImageResource(R.drawable.cross);
                    b6 = 1;
                    i++;
                }
                else
                {
                    btn6.setImageResource(R.drawable.circle);
                    b6=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startgame.equals("X"))
                {
                    btn7.setImageResource(R.drawable.cross);
                    b7 = 1;
                    i++;
                }
                else
                {
                    btn7.setImageResource(R.drawable.circle);
                    b7=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startgame.equals("X"))
                {
                    btn8.setImageResource(R.drawable.cross);
                    b8 = 1;
                    i++;
                }
                else
                {
                    btn8.setImageResource(R.drawable.circle);
                    b8=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startgame.equals("X"))
                {
                    btn9.setImageResource(R.drawable.cross);
                    b9 = 1;
                    i++;
                }
                else
                {
                    btn9.setImageResource(R.drawable.circle);
                    b9=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });


    }

    private  void winningGame()
    {
        if((b1==1) && (b2==1) && (b3==1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            xCount++;
            scorex.setText("Score X : "+String.valueOf(xCount));
        }

       else if((b4==1) && (b5==1) && (b6==1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            xCount++;
            scorex.setText("Score X : "+String.valueOf(xCount));
        }

       else if((b7==1) && (b8==1) && (b9==1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            xCount++;
            scorex.setText("Score X : "+String.valueOf(xCount));
        }

       else if((b1==1) && (b4==1) && (b7==1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            xCount++;
            scorex.setText("Score X : "+String.valueOf(xCount));
        }

       else if((b2==1) && (b5==1) && (b8==1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            xCount++;
            scorex.setText("Score X : "+String.valueOf(xCount));
        }

     else if((b3==1) && (b6==1) && (b9==1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            xCount++;
            scorex.setText("Score X : "+String.valueOf(xCount));
        }
     else if((b1==1) && (b5==1) && (b9==1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            xCount++;
            scorex.setText("Score X : "+String.valueOf(xCount));
        }
     else if((b3==1) && (b5==1) && (b7==1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            xCount++;
            scorex.setText("Score X : "+String.valueOf(xCount));
        }

       else if((b1==0) && (b2==0) && (b3==0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            yCount++;
            scoreo.setText("Score Y : "+String.valueOf(yCount));

        }

        else if((b4==0) && (b5==0) && (b6==0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            yCount++;
            scoreo.setText("Score Y : "+String.valueOf(yCount));

        }
        else if((b7==0) && (b8==0) && (b9==0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            yCount++;
            scoreo.setText("Score Y : "+String.valueOf(yCount));

        }
        else if((b1==0) && (b4==0) && (b7==0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            yCount++;
            scoreo.setText("Score Y : "+String.valueOf(yCount));

        }
        else if((b2==0) && (b5==0) && (b8==0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            yCount++;
            scoreo.setText("Score Y : "+String.valueOf(yCount));

        }
        else if((b3==0) && (b6==0) && (b9==0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            yCount++;
            scoreo.setText("Score Y : "+String.valueOf(yCount));

        }
        else if((b1==0) && (b5==0) && (b9==0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            yCount++;
            scoreo.setText("Score Y : "+String.valueOf(yCount));

        }

        else if((b3==0) && (b5==0) && (b7==0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetvalue();
                }
            });
            AlertDialog alertDialog  = builder.create();
            alertDialog.show();
            yCount++;
            scoreo.setText("Score Y : "+String.valueOf(yCount));

        }
        else {
            if(i==9){
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("No One Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        btn1.setImageDrawable(null);
                        btn2.setImageDrawable(null);
                        btn3.setImageDrawable(null);
                        btn4.setImageDrawable(null);
                        btn5.setImageDrawable(null);
                        btn6.setImageDrawable(null);
                        btn7.setImageDrawable(null);
                        btn8.setImageDrawable(null);
                        btn9.setImageDrawable(null);
                        resetvalue();
                    }
                });
                AlertDialog alertDialog  = builder.create();
                alertDialog.show();
            }
        }



    }

     private  void choosePlayer(){
        if(startgame.equals("X")){
            startgame = "O";

        }
        else{
            startgame ="X";
        }
     }


    private void resetvalue() {

        b1=5;
        b2=5;
        b3=5;
        b4=5;
        b5=5;
        b6=5;
        b7=5;
        b8=5;
        b9=5;
        i=0;
    }
}