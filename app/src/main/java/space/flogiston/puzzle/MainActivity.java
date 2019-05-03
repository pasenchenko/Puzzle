package space.flogiston.puzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button frameButton = (Button)findViewById(R.id.frameButton);
        frameButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setClass(getApplicationContext(), FrameActivity.class);
                        startActivity(intent);
                    }
                }
        );
        Button relativeButton = (Button)findViewById(R.id.relativeButton);
        relativeButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setClass(getApplicationContext(), RelativeActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
