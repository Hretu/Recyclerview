package model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.view.R;

public class Contact extends AppCompatActivity {
    private String name;
    private String phoneNo;
    private int imageID;
    private String Email;
    private  String Address;

    public Contact(String email, String address) {
        Email = email;
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

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

    public Contact(String name, String phoneNo, int imageID, String Email, String Address) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.imageID = imageID;
        this.Email = Email;
        this.Address = Address;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }
}
