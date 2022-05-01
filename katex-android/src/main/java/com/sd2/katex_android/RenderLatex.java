package com.sd2.katex_android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import java.io.File;

public class RenderLatex extends WebView {

    private String text;

    public RenderLatex(Context context) {
        super(context);
        init(context);
    }

    public RenderLatex(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void init(Context context) {
//        setBackgroundColor(Color.TRANSPARENT);
        this.text = "";

        // enable javascript
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);

        // disable click
        setClickable(false);
        setLongClickable(false);
        getSettings().setUseWideViewPort(true);
        setWebViewClient(new WebViewClient());
    }

    public void setText(String text) {
        loadData(LaTexParser.getHtml(text),"text/html","UTF-8");
    }

    public String getText() {
        return text.substring(1, text.length() - 1);
    }
    @SuppressLint("ClickableViewAccessibility")
    @Override
    public void setOnTouchListener(OnTouchListener l) {
        super.setOnTouchListener(l);
    }

    @Override
    public boolean performClick() {
        return super.performClick();
    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        super.setOnClickListener(l);
    }
}