package com.trs.config;

import com.season.core.Controller;
import com.season.core.ControllerKey;

/**
 * Created by 李超-pc on 2016/12/3.
 */

@ControllerKey("hello")
public class HelloController extends Controller {
    public void test() {
        renderText("hi season__hello_word!");
    }
}

