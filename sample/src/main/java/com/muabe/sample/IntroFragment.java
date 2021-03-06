package com.muabe.sample;

import com.markjmind.uni.UniIntroFragment;
import com.markjmind.uni.mapper.annotiation.Layout;
import com.markjmind.uni.mapper.annotiation.Timeout;

/**
 * <br>捲土重來<br>
 *
 * @author 오재웅(JaeWoong - Oh)
 * @email markjmind@gmail.com
 * @since 2018-04-30
 */

@Timeout(1500)
@Layout(R.layout.intro)
public class IntroFragment extends UniIntroFragment{
    @Override
    public void onPost() {
        getBuilder()
                .setHistory(false)
                .replace(new MainFragment());
    }
}
