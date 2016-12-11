package com.github.ahmadnemati.persianbottomsheetpickers;


import com.github.ahmadnemati.persianbottomsheetpickers.utils.PersianCalendar;

import org.junit.Test;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        System.out.println(System.currentTimeMillis());
        PersianCalendar persianCalendar = new PersianCalendar(System.currentTimeMillis());
        System.out.println(persianCalendar.getPersianLongDateAndTime());
        System.out.println(persianCalendar.getTimeInMillis());
    }


}