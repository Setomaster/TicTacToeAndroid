package com.setomaster.tictactoe;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TicTacToeGame game = new TicTacToeGame();
    Random rand = new Random();
    int firstPlayer = rand.nextInt(2);
    int gameMode = 0;
    ImageView cell0;
    ImageView cell1;
    ImageView cell2;
    ImageView cell3;
    ImageView cell4;
    ImageView cell5;
    ImageView cell6;
    ImageView cell7;
    ImageView cell8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cell0 = findViewById(R.id.cell0);
        cell1 = findViewById(R.id.cell1);
        cell2 = findViewById(R.id.cell2);
        cell3 = findViewById(R.id.cell3);
        cell4 = findViewById(R.id.cell4);
        cell5 = findViewById(R.id.cell5);
        cell6 = findViewById(R.id.cell6);
        cell7 = findViewById(R.id.cell7);
        cell8 = findViewById(R.id.cell8);
    }

    public void computerPlay() {
        if (game.getGameState() == GameState.PLAYING) {
            Random rand = new Random();
            int rand_1;
            do {
                rand_1 = rand.nextInt(game.getLines() * game.getColumns());
            } while (game.valueAt(rand_1) != CellValue.EMPTY);
            game.play(rand_1);
            update(rand_1);
        }
    }

    public void nextPlay(int pos) {
        game.play(pos);
        update(pos);
        if (gameMode == 0) {
            computerPlay();
        }
    }

    public void cell0(View v) {
        if (game.valueAt(0) == CellValue.EMPTY) {
            nextPlay(0);
        }
    }

    public void cell1(View v) {
        if (game.valueAt(1) == CellValue.EMPTY) {
            nextPlay(1);
        }
    }

    public void cell2(View v) {
        if (game.valueAt(2) == CellValue.EMPTY) {
            nextPlay(2);
        }
    }

    public void cell3(View v) {
        if (game.valueAt(3) == CellValue.EMPTY) {
            nextPlay(3);
        }
    }

    public void cell4(View v) {
        if (game.valueAt(4) == CellValue.EMPTY) {
            nextPlay(4);
        }
    }

    public void cell5(View v) {
        if (game.valueAt(5) == CellValue.EMPTY) {
            nextPlay(5);
        }
    }

    public void cell6(View v) {
        if (game.valueAt(6) == CellValue.EMPTY) {
            nextPlay(6);
        }
    }

    public void cell7(View v) {
        if (game.valueAt(7) == CellValue.EMPTY) {
            nextPlay(7);
        }
    }

    public void cell8(View v) {
        if (game.valueAt(8) == CellValue.EMPTY) {
            nextPlay(8);
        }
    }

    private void update(int pos) {
        switch (pos) {
            case 0:
                if (game.valueAt(0) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell0, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(0) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell0, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 1:
                if (game.valueAt(1) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell1, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(1) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell1, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 2:
                if (game.valueAt(2) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell2, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(2) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell2, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 3:
                if (game.valueAt(3) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell3, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(3) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell3, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 4:
                if (game.valueAt(4) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell4, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(4) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell4, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 5:
                if (game.valueAt(5) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell5, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(5) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell5, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 6:
                if (game.valueAt(6) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell6, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(6) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell6, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 7:
                if (game.valueAt(7) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell7, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(7) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell7, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 8:
                if (game.valueAt(8) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell8, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(8) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell8, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
        }
        if (game.getGameState() != GameState.PLAYING) {
            if (game.getGameState() == GameState.DRAW) {
                Toast.makeText(getApplicationContext(), "DRAW", Toast.LENGTH_LONG).show();
            } else if (game.getGameState() == GameState.XWIN) {
                Toast.makeText(getApplicationContext(), "XWIN", Toast.LENGTH_LONG).show();
            } else if (game.getGameState() == GameState.OWIN) {
                Toast.makeText(getApplicationContext(), "OWIN", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void restart(View v) {
        game = new TicTacToeGame();
        reset();
        Toast.makeText(getApplicationContext(), "Restart", Toast.LENGTH_LONG).show();
    }

    private void reset() {
        cell0.setImageResource(R.drawable.empty);
        cell1.setImageResource(R.drawable.empty);
        cell2.setImageResource(R.drawable.empty);
        cell3.setImageResource(R.drawable.empty);
        cell4.setImageResource(R.drawable.empty);
        cell5.setImageResource(R.drawable.empty);
        cell6.setImageResource(R.drawable.empty);
        cell7.setImageResource(R.drawable.empty);
        cell8.setImageResource(R.drawable.empty);
    }

    public static void ImageViewAnimatedChange(Context c, final ImageView v, final Bitmap new_image) {
        final Animation anim_in = AnimationUtils.loadAnimation(c, android.R.anim.fade_in);
        v.startAnimation(anim_in);
        v.setImageBitmap(new_image);
    }
}