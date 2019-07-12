package alcchallenge.tz.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by Naamini Yonazi on 11/07/19
 */
public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_my_profile);
            initToolBar();

            ImageView image = findViewById(R.id.profileImage);

            RequestOptions bOptions = new RequestOptions()
                    .priority(Priority.NORMAL)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .dontAnimate()
                    .override(500, 500)
                    .placeholder(R.color.overlay_dark_20);
            Glide.with(getApplicationContext())
                    .load(R.drawable.naamini)
                    .thumbnail(0.1f)
                    .apply(bOptions)
                    .into(image);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


    private void initToolBar() {
        getSupportActionBar().setTitle(R.string.my_profile_title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

}
