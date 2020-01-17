package gr.teiath.anton.calckid;

import android.media.MediaPlayer;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.Random;

import static gr.teiath.anton.calckid.R.id.editText;
import static gr.teiath.anton.calckid.R.id.textView2;

public class Main2Activity extends AppCompatActivity {

    public TextView textView,textView2,textView3,textView4;
    public ImageButton imageButton7,imageButton6,imageButton5,imageButton9;
    public Button button2;
    public EditText editText;
    public String string1,string2,string3,string4,string5,string6,string7,string8;
    public int number1,number2;
    public int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView textView = (TextView)findViewById(R.id.textView);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        ImageButton imageButton7 = (ImageButton)findViewById(R.id.imageButton7);
        ImageButton imageButton6 = (ImageButton)findViewById(R.id.imageButton6);
        ImageButton imageButton5 = (ImageButton)findViewById(R.id.imageButton5);
        ImageButton imageButton9 = (ImageButton)findViewById(R.id.imageButton9);
        Button button2 = (Button)findViewById(R.id.button2);
        final EditText editText=(EditText)findViewById(R.id.editText);
        final MediaPlayer success=MediaPlayer.create(this,R.raw.ding);
        final MediaPlayer fail=MediaPlayer.create(this,R.raw.fail);


        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Πόσο κάνει");
                textView3.setText("/");
                Random rand = new Random();
                number1 = rand.nextInt(50);
                number2 = rand.nextInt(50);
                string1 = String.valueOf(number1);
                string2 = String.valueOf(number2);
                textView2.setText(string1);
                textView4.setText(string2);
                flag=1;
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Πόσο κάνει");
                textView3.setText("X");
                Random rand = new Random();
                int number3 = rand.nextInt(50);
                int number4 = rand.nextInt(50);
                string3 = String.valueOf(number3);
                string4 = String.valueOf(number4);
                textView2.setText(string3);
                textView4.setText(string4);
                flag=2;
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Πόσο κάνει");
                textView3.setText("-");
                Random rand = new Random();
                int number5 = rand.nextInt(50);
                int number6 = rand.nextInt(50);
                string5 = String.valueOf(number5);
                string6 = String.valueOf(number6);
                textView2.setText(string5);
                textView4.setText(string6);
                flag=3;
            }
        });

        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Πόσο κάνει");
                textView3.setText("+");
                Random rand = new Random();
                int number7 = rand.nextInt(50);
                int number8 = rand.nextInt(50);
                string7 = String.valueOf(number7);
                string8 = String.valueOf(number8);
                textView2.setText(string7);
                textView4.setText(string8);
                flag=4;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==1){
                    double diaer=(double)(number1) / (double)(number2);
                    diaer = Math.floor(diaer * 10) / 10;
                    double a =Double.parseDouble(editText.getText().toString());

                    if (diaer==a)
                    {
                        Toast.makeText(Main2Activity.this, "Έδωσες την σωστή απάντηση", Toast.LENGTH_LONG).show();
                        success.start();
                    }
                    else{
                        Toast.makeText(Main2Activity.this, "Λάθος απάντηση.Προσπάθησε ξανά!", Toast.LENGTH_LONG).show();
                        fail.start();
                    }
                }
                else if(flag==2){
                    int epi=Integer.parseInt(string3) * Integer.parseInt(string4);
                    int b=Integer.parseInt(editText.getText().toString());
                    if(epi==b){
                        Toast.makeText(Main2Activity.this, "Έδωσες την σωστή απάντηση", Toast.LENGTH_LONG).show();
                        success.start();
                    }
                    else{
                        Toast.makeText(Main2Activity.this, "Λάθος απάντηση.Προσπάθησε ξανά!", Toast.LENGTH_LONG).show();
                        fail.start();
                    }
                }
                else if(flag==3){
                    int meion=Integer.parseInt(string5) - Integer.parseInt(string6);
                    int c=Integer.parseInt(editText.getText().toString());
                    if(meion==c){
                        Toast.makeText(Main2Activity.this, "Έδωσες την σωστή απάντηση", Toast.LENGTH_LONG).show();
                        success.start();
                    }
                    else{
                        Toast.makeText(Main2Activity.this, "Λάθος απάντηση.Προσπάθησε ξανά!", Toast.LENGTH_LONG).show();
                        fail.start();
                    }
                }
                else if(flag==4){
                    int sin=Integer.parseInt(string7) + Integer.parseInt(string8);
                    int d=Integer.parseInt(editText.getText().toString());
                    if(sin==d){
                        Toast.makeText(Main2Activity.this, "Έδωσες την σωστή απάντηση", Toast.LENGTH_LONG).show();
                        success.start();
                    }
                    else{
                        Toast.makeText(Main2Activity.this, "Λάθος απάντηση.Προσπάθησε ξανά!", Toast.LENGTH_LONG).show();
                        fail.start();
                    }
                }
                flag=0;
                textView.setText("");
                textView2.setText("");
                textView3.setText("");
                textView4.setText("");
            }
        });
    }

}
