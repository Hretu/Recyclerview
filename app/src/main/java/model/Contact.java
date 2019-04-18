package model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.view.R;

public class Contact extends AppCompatActivity {
    private String name;
    private String phoneNo;
    private int imageID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public Contact(String name, String phoneNo, int imageID) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.imageID = imageID;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }
}
