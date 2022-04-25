package com.sd2.katex_render_android;

import android.util.Log;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class RenderLatex extends AppCompatActivity {
    public void setText(WebView webView,String latex){
        Log.d("TAG", "setTextRenderLatex: "+latex);
        webView.loadData(LaTexParser.getHtml(latex), "text/html", "UTF-8");
    }
}