package com.example.imageswitcher;





        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.img_view);
        img.setTag(1);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(img.getTag().equals(1)){
                    img.setImageResource(R.drawable.second);
                    img.setTag(2);
                }
                else{
                    img.setImageResource(R.drawable.first);
                    img.setTag(1);
                }
            }
        });
    }
}