package com.github.ahmadnemati.persianbottomsheetpickers.ui;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.Button;

import com.github.ahmadnemati.persianbottomsheetpickers.Utils;

/**
 * Created by Ahmad Nemati on 12/10/2016.
 */

public class ExtendedButton extends Button {
    public ExtendedButton(Context context) {
        super(context);
        init();
    }

    public ExtendedButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ExtendedButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ExtendedButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init()
    {
        setText(Utils.getFarsiCharNumber(String.valueOf(getText())));
    }
}
