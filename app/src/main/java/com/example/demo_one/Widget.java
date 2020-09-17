package com.example.demo_one;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;
import java.util.ArrayList;

public class Widget extends Activity implements  AdapterView.OnItemSelectedListener {
    CheckBox checkBox;
    CheckBox customCheckBox;
    RadioGroup radioGroup;
   ArrayList<String> country;
   AlertDialog.Builder builder;
   Spinner spinner;
    public void addListenerOnButtonClick()
{

    checkBox.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           if (checkBox.isChecked())
            Toast.makeText(Widget.this, "checkbox ticked", Toast.LENGTH_SHORT).show();
           else
               Toast.makeText(Widget.this, "checkbox unticked", Toast.LENGTH_SHORT).show();

        }
    });
    customCheckBox.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (customCheckBox.isChecked())
            Toast.makeText(Widget.this,"Custom checkbox ticked",Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(Widget.this,"Custom checkbox Unticked",Toast.LENGTH_SHORT).show();
        }
    });
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.widget);
        Button button = (Button) findViewById(R.id.button);
        final Button toast = (Button) findViewById(R.id.toast);
        Button customToast = (Button) findViewById(R.id.customToast);
        Button alertDialog = (Button) findViewById(R.id.alertDialog);
        final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        checkBox = (CheckBox) findViewById(R.id.checkbox);
        customCheckBox = (CheckBox) findViewById(R.id.customCheckbox);
        RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton);
        RadioButton customRadioButton = (RadioButton) findViewById(R.id.customRadioButton);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        Switch switchh = (Switch) findViewById(R.id.switchh);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        spinner = (Spinner) findViewById(R.id.spinner);
        EditText editText = (EditText) findViewById(R.id.editText);
        final ListView listView = (ListView) findViewById(R.id.listView);
        Button webView = (Button) findViewById(R.id.webView);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Widget.this, "Button is pressed", Toast.LENGTH_SHORT).show();
            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Widget.this, "This is Toast", Toast.LENGTH_SHORT).show();
            }
        });
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("ToggleButton is ").append(toggleButton.getText());
                Toast.makeText(Widget.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        addListenerOnButtonClick();
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Widget.this, "selected", Toast.LENGTH_SHORT).show();
            }
        });
        country = new ArrayList<String>();
        country.add("America");
        country.add("Belgium");
        country.add("California");
        country.add("India");
        country.add("Italy");
        country.add("Denmark");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, country);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Widget.this, country.get(i) + " is selected", Toast.LENGTH_SHORT).show();
            }
        });
        webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt=new Intent(getApplicationContext(),Web_activity.class);
                startActivity(intentt);

            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(Widget.this, "seekbar value changed to " + i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));
        final Toast new_toast = new Toast(getApplicationContext());
        new_toast.setDuration(Toast.LENGTH_SHORT);
        new_toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        new_toast.setView(layout);//setting the view of custom toast layout
        customToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new_toast.show();
            }
        });
        builder = new AlertDialog.Builder(this);
        alertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Uncomment the below code to Set the message and title from the strings.xml file
                builder.setMessage("This is Alert Dialog message") .setTitle("Alert dialog title");

                //Setting message manually and performing action on button click
                builder.setMessage("Do you want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                dialog.cancel();
                                Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                //alert.setTitle("AlertDialogExample");
                alert.show();
            }
        });
ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.country_names,android.R.layout.simple_spinner_item);
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinner.setAdapter(adapter);
spinner.setOnItemSelectedListener(this);
Button recycler_view_button=(Button)findViewById(R.id.recycler_view_button);
recycler_view_button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i2=new Intent(Widget.this,Recycler_view_example.class);
        startActivity(i2);
    }
});
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text=spinner.getSelectedItem().toString();
        Toast.makeText(this,text+"Country selected",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
