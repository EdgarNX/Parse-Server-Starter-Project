/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;


public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

      /* THIS CODE SAVE AN ENTRY AND CREATE A NEW SCORE ENTRY TYPE
      ParseObject score = new ParseObject("Score");
      score.put("username","rob");
      score.put("score",86);
      score.saveInBackground(new SaveCallback() {
        @Override
        public void done(ParseException e) {

          if (e == null) {
            Log.i("SaveInBackgound", "Successful");
          } else {
            Log.i("SaveInBackgound", "Failed. Error: " + e.toString());
          }

        }
      });
       */

    /* THIS ONE RETURN AN OBJECT BY ID AND ALSO UPDATE THE SCORE VALUE
    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

    query.getInBackground("TqSZxlg0zu", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {
        if (e == null && object != null) {

          object.put("score",200);
          object.saveInBackground();

          Log.i("ObjectValue", object.getString("username"));
          Log.i("ObjectValue",Integer.toString(object.getInt("score")));
        } else {
          Log.i("GetInBackgound", "Failed. Error: " + e.toString());
        }
      }
    });
     */

    /* ANOTHER SAVING CODE
    ParseObject tweet = new ParseObject("Tweet");
    tweet.put("username", "tommy");
    tweet.put("tweet", "Hey there!");

    tweet.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if (e == null) {
          Log.i("Tweet","Successful");
        } else {
          Log.i("Tweet", "Failed");
        }
      }
    });
     */

    /* THIS ONE RETURN AN OBJECT BY ID AND ALSO UPDATE THE SCORE VALUE
    ParseQuery<ParseObject> query = ParseQuery.getQuery("Tweet");

    query.getInBackground("SHw8FI5Ohm", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {
        if (e == null && object != null) {
          Log.i("Tweet","Successful");

          object.put("tweet", "Bye");
          object.saveInBackground();
        } else {
          Log.i("Tweet", "Failed");
        }
      }
    });
     */











    ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }

}