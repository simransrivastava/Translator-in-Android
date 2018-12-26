package com.example.simransrivastava.trial;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class TextToSpeak extends Activity implements
        TextToSpeech.OnInitListener,OnItemSelectedListener  {
    private TextToSpeech tts;
    private Button buttonSpeak;
    private EditText editText;
    private Spinner speedSpinner,pitchSpinner;

    private static String speed="Normal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speak);

        tts = new TextToSpeech(this, this);
        buttonSpeak = (Button) findViewById(R.id.button1);
        editText = (EditText) findViewById(R.id.editText1);
        speedSpinner = (Spinner) findViewById(R.id.spinner1);

//load data in spinner
        loadSpinnerData();
