package com.example.feedbackpage;




import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.feedbackpage.R;
public class MainActivity extends AppCompatActivity{
    TextView rateCount;
    Button submit;
    EditText Feedback;
    RatingBar ratingBar;
    CheckBox Check;
    float rateValue; String temp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rateCount= findViewById(R.id.rateCount);
        ratingBar=findViewById(R.id.ratingBar);
        Feedback= findViewById(R.id.EditText_FeedbackBody);
        Check= findViewById(R.id.CheckBoxResponse);


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                rateValue=ratingBar.getRating();
                if(rateValue<=1 & rateValue>0)
                    rateCount.setText("Dissatisfied "+rateValue+" /5");
                else if(rateValue<=2 & rateValue>1)
                    rateCount.setText("Average "+rateValue+" /5");
                else if (rateValue<=3 & rateValue>2)
                    rateCount.setText("Average "+rateValue+" /5");
                else if(rateValue<=4 & rateValue>3)
                    rateCount.setText("Satisfied"+rateValue+" /5");
                else if(rateValue<=5 &rateValue>4)
                    rateCount.setText("Best"+rateValue+" /5");


            }
        });
        submit=(Button)findViewById(R.id.ButtonSendFeedback);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    Toast.makeText(MainActivity.this,"Thanks! Your FeedBack is Submitted.",Toast.LENGTH_LONG).show();
            }

        });


    }
}
