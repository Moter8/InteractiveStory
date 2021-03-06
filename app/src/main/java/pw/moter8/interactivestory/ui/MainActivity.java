package pw.moter8.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;
import pw.moter8.interactivestory.R;


public class MainActivity extends ActionBarActivity {

    private EditText mNameField;
    private Button mStartButton;
    public String[] mBook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        mNameField = (EditText) findViewById(R.id.userNameText);
        mStartButton = (Button) findViewById(R.id.beginStoryButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameField.getText().toString();

                if (name.equals("") || (name.length() <= 2)) {
                    Toast.makeText(MainActivity.this, getString(R.string.enter_name_reminder), Toast.LENGTH_SHORT).show();
                } else if (name.equals("Iliyan")) {
                    throw new RuntimeException("Iliyans no pueden usar la app!");
                } else if (name.equals("Pyry") || name.equals("Shurjo") || name.equals("Borja")) {
                    Toast.makeText(MainActivity.this, getString(R.string.friend_greet), Toast.LENGTH_SHORT).show();
                } else {
                    startStory(name);
                }

            }
        });
    }

    private void startStory(String name) {
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mNameField.setText("");
    }

}
