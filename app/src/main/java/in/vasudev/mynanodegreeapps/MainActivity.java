package in.vasudev.mynanodegreeapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.spotify_streamer).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.this_button_will_launch_my) + getString(R.string.spotify_streamer), Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.scores_app).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.this_button_will_launch_my) + getString(R.string.scores_app), Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.library_app).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.this_button_will_launch_my) + getString(R.string.library_app), Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.build_it_bigger).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.this_button_will_launch_my) + getString(R.string.build_it_bigger), Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.xyz_reader).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.this_button_will_launch_my) + getString(R.string.xyz_reader), Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.my_own_app).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.this_button_will_launch_my) + getString(R.string.capstone_my_own_app), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
