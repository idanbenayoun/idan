package haifa.jbmd.cars;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView carsGreen = (TextView) findViewById(R.id.carsGreen);
        TextView carsRed = (TextView) findViewById(R.id.carsRed);
        TextView humansGreen = (TextView) findViewById(R.id.humansGreen);
        TextView humansRed = (TextView) findViewById(R.id.humansRed);

    }
    public void cars_OnClick(View view) {

        // Get transition drawable:
        TransitionDrawable transitionDrawable = (TransitionDrawable)view.getBackground();
        
            transitionDrawable.startTransition(1000);

        }
    }
}
