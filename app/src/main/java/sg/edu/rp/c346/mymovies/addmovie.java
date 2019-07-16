package sg.edu.rp.c346.mymovies;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class addmovie extends AppCompatActivity {
    EditText ettitle;
    EditText etyear;
    EditText etgenre;
    EditText etrated;
    EditText ettheatre;
    EditText etdesc;

    RatingBar rtBar;
    Button btnadd;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_add);

        ettitle = findViewById(R.id.editTextTitle);
        etyear = findViewById(R.id.editTextYear);
        etgenre = findViewById(R.id.editTextGenre);
        etrated = findViewById(R.id.editTextRated);
        ettheatre = findViewById(R.id.editTextRated);
        etdesc = findViewById(R.id.editTextDescription);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etNullCheck()){
                    Intent intent = new Intent(addmovie.this,MainActivity.class);
                    intent.putExtra("source","addmovie");
                    intent.putExtra("title", ettitle.getText().toString().trim());
                    intent.putExtra("year", etyear.getText().toString().trim());
                    intent.putExtra("Genre", etgenre.getText().toString().trim());
                    intent.putExtra("Rated", etrated.getText().toString().trim());
                    intent.putExtra("Theatre", ettheatre.getText().toString().trim());
                    intent.putExtra("Desc", etdesc.getText().toString().trim());
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    public  boolean etNullCheck(){
        if(ettitle.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Title is empty", Toast.LENGTH_SHORT).show();
            return false;
        }

        if(etyear.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Year is empty", Toast.LENGTH_SHORT).show();
            return false;
        }

        if(etgenre.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Genre is empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(etrated.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Rated is empty", Toast.LENGTH_SHORT).show();
            return false;
        }

        if(ettheatre.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Theatre is empty", Toast.LENGTH_SHORT).show();
            return false;
        }

        if(etdesc.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Description is empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
