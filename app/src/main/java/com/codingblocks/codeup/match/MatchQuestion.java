package com.codingblocks.codeup.match;

import com.google.firebase.database.ServerValue;

import java.util.HashMap;

/**
 * Created by naman on 21/6/17.
 */

public class MatchQuestion {

    private String source;
    HashMap<String, Object> timestampCreated;

    public MatchQuestion(String source) {
        this.source = source;
        HashMap<String, Object> timestampNow = new HashMap<>();
        timestampNow.put("timestamp", ServerValue.TIMESTAMP);
        this.timestampCreated = timestampNow;
    }

}