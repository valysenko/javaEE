package com.lysenko;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Vladyslav on 21.04.2015.
 */
@Controller
@RequestMapping(value = "/MyData")
public class RestController {

    @RequestMapping(value="/test")
    public String test(){
        return "index";
    }

    @RequestMapping(value="/{time}", method = RequestMethod.GET)
    public @ResponseBody MyData getMyData(
            @PathVariable long time) {
        return new MyData(time, "REST GET Call !!!");
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody MyData putMyData(
            @RequestBody MyData md) {

        return md;
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody MyData postMyData() {

        return new MyData(System.currentTimeMillis(),
                "REST POST Call !!!");
    }

    @RequestMapping(value="/{time}", method = RequestMethod.DELETE)
    public @ResponseBody MyData deleteMyData(
            @PathVariable long time) {

        return new MyData(time, "REST DELETE Call !!!");
    }
}
