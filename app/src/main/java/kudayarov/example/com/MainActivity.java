package kudayarov.example.com;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.mtp.MtpConstants;
import android.os.Build;
import android.os.Bundle;
import android.text.NoCopySpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bttosttrap = findViewById(R.id.buttonWhatIsThisPage);
        bttosttrap.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @RequiresApi(api = Build.VERSION_CODES.Q)
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, R.string.its_a_trap, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0,0);
                LinearLayout toastlay = new LinearLayout(getApplicationContext());
                TextView text = new TextView(getBaseContext());
                text.setText(R.string.its_a_trap);
                text.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                text.setTextSize(30);
                ImageView i = new ImageView(getApplicationContext());
                toastlay.setOrientation(LinearLayout.VERTICAL);
                toastlay.addView(text);
                toastlay.addView(i);
                i.setImageResource(R.drawable.trap_image);
                toast.setView(toastlay);
                toast.show();
            }
        });
        Button btimagescroll = findViewById(R.id.buttonNewYearImage);
        btimagescroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImagesActivity.class);
                startActivity(intent);
            }
        });
        Button btaboutnewyear = findViewById(R.id.buttonAboutNewYear);
        btaboutnewyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DescriptionActivity.class);
                startActivity(intent);
            }
        });
    }
}
