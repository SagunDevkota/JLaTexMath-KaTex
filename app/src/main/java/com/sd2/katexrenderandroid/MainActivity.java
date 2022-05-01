package com.sd2.katexrenderandroid;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.sd2.katex_android.RenderLatex;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RenderLatex renderLatex = findViewById(R.id.latex);
        renderLatex.setText("$\\frac{\\lambda_c}{\\lambda_p}=\\frac{\\displaystyle\\frac h{\\sqrt{2m_eev}}}{\\frac h{\\sqrt{2m_pev}}}=\\sqrt{\\frac{m_p}{m_e}}$");
        renderLatex.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d("TAG", "onTouch: ");
                return false;
            }
        });
    }
}