package com.example.a2020_2forifhackathon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class PostActivity extends AppCompatActivity {

    ImageButton button_save;
    ImageButton button_image;
    EditText editText_desc;
    EditText editText_title;
    EditText editText_writer;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference colRef = db.collection("post");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_post);

        button_image = (ImageButton)findViewById(R.id.button_image);
        button_save = (ImageButton)findViewById(R.id.button_save);
        editText_desc = findViewById(R.id.editText_desc);
        editText_title = findViewById(R.id.editText_title);
        editText_writer = findViewById(R.id.editText_writer);

    }

    public void saveNote(View v){
        String title = editText_title.getText().toString();
        
        String description = editText_desc.getText().toString();

        String writer = editText_writer.getText().toString();

        String imgURL = "";

        Post post = new Post(title,description, writer, imgURL);

        colRef.add(post).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(PostActivity.this, "Save Complete!", Toast.LENGTH_SHORT).show();
            }})
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(PostActivity.this, "ERROR: "+e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }

}