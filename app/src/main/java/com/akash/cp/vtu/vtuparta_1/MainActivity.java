package com.akash.cp.vtu.vtuparta_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



@SuppressWarnings("all")
public class MainActivity extends AppCompatActivity implements Base {
    TextView mTextViewCompanyName,mTextViewName,mTextViewJobTitle,mTextViewPhoneNumber,mTextViewAddress,mTextViewEmail;
    ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        listener();
    }

    @Override
    public void init() {
        mTextViewCompanyName=(TextView)findViewById(R.id.company_name);
        mTextViewName=(TextView)findViewById(R.id.name);
        mTextViewJobTitle=(TextView)findViewById(R.id.job_title);
        mTextViewPhoneNumber=(TextView)findViewById(R.id.phoneNumber);
        mTextViewAddress=(TextView)findViewById(R.id.address);
        mTextViewEmail=(TextView)findViewById(R.id.email);
        mImageView=(ImageView)findViewById(R.id.company_image);
    }

    @Override
    public void listener() {
        mTextViewCompanyName.setText("Company Name");
        mTextViewName.setText("Name");
        mTextViewJobTitle.setText("Job Title");
        mTextViewPhoneNumber.setText("Phone Number");
        mTextViewAddress.setText("Address");
        mTextViewEmail.setText("Email, Website, fax details");
        mImageView.setBackgroundResource(R.drawable.company);

    }
}