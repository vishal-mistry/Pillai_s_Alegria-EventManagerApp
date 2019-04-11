package com.choudhary.yogeshc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.app.ProgressDialog;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.snackbar.Snackbar;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class registration_pg extends AppCompatActivity implements View.OnClickListener{

    public static int err1=1,err2=1,err3=1,err4=1;
    public static String selected_event;
    public static String event_fees;
    EditText editName,editNumber,editEmail;
    Button buttonRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);

        editName = (EditText)findViewById(R.id.f_name);
        editNumber = (EditText)findViewById(R.id.f_number);
        editEmail = (EditText)findViewById(R.id.f_email);

        final String eventL[] = {"Enter Event Name","Face Painting","Poster Making","Rangoli Making","Sketching","T-Shirt Painting","CS:GO","DOTA","FIFA 19","Ludo King","PUBG",
                "Mr and Mrs Alegria","Photography","Fastest Finger","Treasure Hunt","Fitness Physique","Best Manager","Decathlon Business Plan","Creator","Fantasy FootBall Event",
                "Shark Tank","10 KM Marathon","Neo Shootout","Rifle Shooting","Chess","Futsal","3d Printing","Arduino","Machine Learning","Augmented Reality","Game Development",
                "Rowdies Style Interview","Fashion Show","Food-a-thon","Rapping","Beat Boxing","Free-Style Group","Internet of Things Workshop","Drone Piloting","Air rifle Shooting",
                "Archery","Bhangra","Mehandi Designing","Code Competition","Cyber Hunt","Hackathon","Tech Roadies","Badminton","Basketball","Box Cricket","Carrom","Volleyball",
                 "Tug Of War","Table Tennis","Kabaddi","Space Quiz","Essay Writing","Spelling Bbee"};
        final String PriceL[] ={"Select Event","200","100","100","100","100","500","500","150","100","200","250","150","100","300","250","100","100","150","200","200","100","100",
                "150","100","1000","300","1200","500","500","500","150","2500","150","150","150","1200","1200","300","150","150","150","100","150","150","100","100","100",
                "300","1000","200","500","250","100","600","100","100","100"};

        final Spinner spinner = (Spinner)findViewById(R.id.spin);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_bg,eventL);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(R.layout.spinner_bg);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
                if(parent.getItemAtPosition(position).equals("Enter Event Name"))
                {
                    err4=1;
                }
                else {
                int sid=spinner.getSelectedItemPosition();
                Toast.makeText(getBaseContext(),"The Fees for "+eventL[sid]+" is Rs."+PriceL[sid],Toast.LENGTH_SHORT).show();
                err4=0;
                selected_event=spinner.getSelectedItem().toString();
                event_fees=PriceL[sid];
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){
                err4=1;
            }
        });

        buttonRegister = (Button)findViewById(R.id.btn_register);
        buttonRegister.setOnClickListener(this);




        editName.addTextChangedListener(new TextWatcher()  {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s)  {
                if (editName.getText().toString().length() == 0){
                    editName.setError("Please enter your Full Name");
                    err1=1;
                }
                else{
                    editName.setError(null);
                    err1=0;
                }

            }
        });

        editEmail.addTextChangedListener(new TextWatcher()  {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s)  {
                boolean i_email = editEmail.getText().toString().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
                if (!i_email){
                    editEmail.setError("Invalid Email");
                    err2=1;
                }
                else{
                    editEmail.setError(null);
                    err2=0;
                }

            }
        });

        editNumber.addTextChangedListener(new TextWatcher()  {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s)  {
                if (editNumber.getText().toString().length() == 10){
                    editNumber.setError(null);
                    err3=0;
                }
                else{
                    editNumber.setError("Enter 10 digit number Mobile Number");
                    err3=1;
                }

            }
        });

    }

    public void openDialog(String id) {

        AlertDialog alertDialog = new AlertDialog.Builder(this,R.style.MyDialogTheme).create();

        // Set Custom Title
        TextView title = new TextView(this);
        // Title Properties
        title.setText("Registration Successful.");
        title.setPadding(10, 50, 10, 20);   // Set Position
        title.setGravity(Gravity.CENTER);
        title.setTextColor(Color.WHITE);
        title.setTextSize(30);
        alertDialog.setCustomTitle(title);

        // Set Message
        TextView msg = new TextView(this);
        // Message Properties
        String m1 = "Your Form has been Successfully submitted using Token ID:\n";
        String m2 ="\nPlease note down the above Token ID and produce the same at the fees counter to get enrolled for the Event.\nYou have to pay Rs.";
        String mess=m1+id+m2+event_fees;
        msg.setText(mess);
        msg.setGravity(Gravity.CENTER_HORIZONTAL);
        msg.setTextColor(Color.WHITE);
        msg.setTextSize(20);
        msg.setPadding(40, 20, 40, 20);
        alertDialog.setView(msg);

        // Set Button
        // you can more buttons
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL,"FILL AGAIN", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Perform Action on Button


            }
        });

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE,"OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Perform Action on Button
                Intent intent = new Intent(getApplicationContext(), home.class);
                startActivity(intent);
            }
        });

        new Dialog(getApplicationContext());
        alertDialog.show();

        // Set Properties for OK Button
        final Button okBT = alertDialog.getButton(AlertDialog.BUTTON_NEUTRAL);
        LinearLayout.LayoutParams neutralBtnLP = (LinearLayout.LayoutParams) okBT.getLayoutParams();
        neutralBtnLP.gravity = Gravity.FILL_HORIZONTAL;
        okBT.setPadding(50, 20, 50, 20);   // Set Position
        okBT.setTextColor(Color.GREEN);
        okBT.setLayoutParams(neutralBtnLP);

        final Button cancelBT = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);
        LinearLayout.LayoutParams negBtnLP = (LinearLayout.LayoutParams) okBT.getLayoutParams();
        negBtnLP.gravity = Gravity.FILL_HORIZONTAL;
        cancelBT.setPadding(50, 20, 50, 20);
        cancelBT.setTextColor(Color.GREEN);
        cancelBT.setLayoutParams(negBtnLP);
    }

    private void   addItemToSheet() {

        final ProgressDialog loading = ProgressDialog.show(this,"Registering","Please wait...");
        final String name = editName.getText().toString().trim();
        final String number = editNumber.getText().toString().trim();
        final String email = editEmail.getText().toString().trim();
        Random rand = new Random();
        int token;
        token = rand.nextInt(999999-100000)  + 100000;
        String tok =String.valueOf(token);
        final String id = tok.trim();


        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbx3u4ryVd2ubyb962huHSNHqHUVIDoeMVtOD1mKQ9eaEl0LW4o/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(registration_pg.this,response,Toast.LENGTH_LONG).show();
                        openDialog(id);

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem");
                parmas.put("name",name);
                parmas.put("number",number);
                parmas.put("email",email);
                parmas.put("id",id);
                parmas.put("event",selected_event);
                parmas.put("fees",event_fees);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    @Override
    public void onClick(View v) {
        //Define what to do when button is clicked
        if(v== buttonRegister){
            if((err1 == 1) || (err2 == 1) || (err3 == 1) ||(err4 == 1)){
                Snackbar.make(v, "Please Enter correct details and try again.", Snackbar.LENGTH_SHORT).show();
            }
            else if((err1 == 0) && (err2 == 0) && (err3 == 0) && (err4 == 0)){
            addItemToSheet();}
            else{
                Snackbar.make(v, "INTERNAL ERROR.", Snackbar.LENGTH_SHORT).show();
            }

        }
    }


}
