package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a = 0;
    String[] signs = {"+", "-", "*", "/"};
    String sign = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView out = (TextView) findViewById(R.id.output);
        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button zero = (Button) findViewById(R.id.zero);
        Button plus = (Button) findViewById(R.id.plus);
        Button minus = (Button) findViewById(R.id.minus);
        Button mul = (Button) findViewById(R.id.mul);
        Button div = (Button) findViewById(R.id.div);
        Button res = (Button) findViewById(R.id.res);
        Button del = (Button) findViewById(R.id.del);
        one.setOnClickListener((View)->{out.setText(String.valueOf(out.getText())+"1");});
        two.setOnClickListener((View)->{out.setText(String.valueOf(out.getText())+"2");});
        three.setOnClickListener((View)->{out.setText(String.valueOf(out.getText())+"3");});
        four.setOnClickListener((View)->{out.setText(String.valueOf(out.getText())+"4");});
        five.setOnClickListener((View)->{out.setText(String.valueOf(out.getText())+"5");});
        six.setOnClickListener((View)->{out.setText(String.valueOf(out.getText())+"6");});
        seven.setOnClickListener((View)->{out.setText(String.valueOf(out.getText())+"7");});
        eight.setOnClickListener((View)->{out.setText(String.valueOf(out.getText())+"8");});
        nine.setOnClickListener((View)->{out.setText(String.valueOf(out.getText())+"9");});
        zero.setOnClickListener((View)->{out.setText(String.valueOf(out.getText())+"0");});
        del.setOnClickListener((View)->{out.setText("");});
        plus.setOnClickListener((View)->{
            a=Integer.valueOf(String.valueOf(out.getText()));
            ((TextView) findViewById(R.id.output)).setText("");
            sign = "+";
        });
        minus.setOnClickListener((View)->{
            a=Integer.valueOf(String.valueOf(out.getText()));
            ((TextView) findViewById(R.id.output)).setText("");
            sign = "-";
        });
        mul.setOnClickListener((View)->{
            a=Integer.valueOf(String.valueOf(out.getText()));
            ((TextView) findViewById(R.id.output)).setText("");
            sign = "*";
        });
        div.setOnClickListener((View)->{
            a=Integer.valueOf(String.valueOf(out.getText()));
            ((TextView) findViewById(R.id.output)).setText("");
            sign = "/";
        });
        res.setOnClickListener((View)->{
            int b = Integer.valueOf(String.valueOf(out.getText()));
            switch(sign){
                case "+": out.setText(String.valueOf(a+b)); break;
                case "-": out.setText(String.valueOf(a+b)); break;
                case "*": out.setText(String.valueOf(a*b)); break;
                case "/": out.setText(String.valueOf(a/b)); break;
            }
        });
    }

//    public void onTestClick(View view) {
//        TextView out = (TextView) findViewById(R.id.output);
//        if (view.getId() == R.id.one) {
//            out.setText(out.getText() + "1");
//        } else if (view.getId() == R.id.two) {
//            out.setText(out.getText() + "2");
//        } else if (view.getId() == R.id.plus) {
//            a= Integer.valueOf(String.valueOf(out.getText()));
//            out.setText("");
//        } else if (view.getId() == R.id.qe) {
//            int b = Integer.valueOf(String.valueOf(out.getText()));
//            out.setText(String.valueOf(a+b));
//        }
//    }



}