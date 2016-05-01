package hideandshow.rsantosh.com.hide_and_show_using_textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HideAndShow extends AppCompatActivity implements View.OnClickListener {

    //Creating the object for controls.
    Button button;
    TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide_and_show);

        //Initialising the objects.
        button = (Button)findViewById(R.id.showHide);
        text_view = (TextView)findViewById(R.id.text);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        //Declaring the variables.
        String strName;
        strName = button.getText().toString();

        //Switch case statement.
        switch (strName)
        {
            //This case is written to hide the image.
            case "Hide":
                        text_view.setVisibility(view.INVISIBLE);
                        button.setText(R.string.button_text1);
                        break;

            //This case is written to show the image.
            case "Show":
                        text_view.setVisibility(view.VISIBLE);
                        button.setText(R.string.button_text);
                        break;
        }

    }
}
