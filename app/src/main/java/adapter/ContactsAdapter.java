package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.view.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.Contact;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    Context mContext;
    List<Contact> contactslist;
    public ContactsAdapter(Context mContext,List<Contact> contactslist){
        this.mContext = mContext;
        this.contactslist = contactslist;
    }
    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_contact,viewGroup,false);
        return  new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
        Contact contact = contactslist.get(i);
        contactsViewHolder.imgProfile.setImageResource(contact.getImageID());
        contactsViewHolder.tvName.setText(contact.getName());
        contactsViewHolder.tvPhone.setText(contact.getPhoneNo());

    }

    @Override
    public int getItemCount() {
        return contactslist.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
    CircleImageView imgProfile;
    TextView tvName,tvPhone;
    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);

        imgProfile = itemView.findViewById(R.id.imgProfile);
        tvName = itemView.findViewById(R.id.tvName);
        tvPhone = itemView.findViewById(R.id.tvPhone);

    }
}
}
