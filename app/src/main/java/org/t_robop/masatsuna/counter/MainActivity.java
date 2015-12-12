
package org.t_robop.masatsuna.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView; //TextViewを使うためにインポート

public class MainActivity extends AppCompatActivity {

    private int mCount;//カウントのフィールド

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus(View view){    //plusが押された時の実行内容
        mCount++;                   //mCountを+1
        updateCountView();
    }

    public void minus(View view){      //minusが押された時の実行内容
        if(mCount > 0) {                //負の値を表示させない
            mCount--;                       //mCountを-1
            updateCountView();
        }
    }

    public void twice(View view){   //×２が押された時の実行内容
        mCount *= 2;                //mCountを2倍する
        updateCountView();
    }

    public void clear(View view){   //clearが押された時の実行内容
        mCount = 0;                 //mCountを0に戻す
        updateCountView();
    }

    private void updateCountView() {
        TextView countView = (TextView) findViewById(R.id.textView1);   //インスタンスを生成
        countView.setText(String.valueOf(mCount));  /*生成されたインスタンスにmCountの値を入れ、
                                                      カウントを表示*/
    }
}
