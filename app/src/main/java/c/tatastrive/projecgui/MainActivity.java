package c.tatastrive.projecgui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    CardView admin,user,attend,about;
    FloatingActionButton camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        admin=findViewById(R.id.admin);
        user=findViewById(R.id.user);
        attend=findViewById(R.id.attendance);
        about=findViewById(R.id.about);
        camera=findViewById(R.id.camera);

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Admin clicked", Toast.LENGTH_SHORT).show();
            }
        });
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "User Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        attend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Attendance Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "About us clicked", Toast.LENGTH_SHORT).show();
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "camera clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
