package id.ac.poliban.mi.renaldykambayu.desainaplikasiinputnama;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btTampilkan = findViewById(R.id.btTampilkan);

        btTampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Selamat Datang", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
