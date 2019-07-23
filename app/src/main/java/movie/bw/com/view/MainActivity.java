package movie.bw.com.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 手指滑动小球
     * @param view
     */
    public void ball(View view) {
    }

    /**
     * 圆形圆角图
     * @param view
     */
    public void circle(View view) {

    }

    /**
     * 流式布局
     * @param view
     */
    public void flowLayout(View view) {

    }
    public void add(View view) {

        DotRandomView dotRandomView  = findViewById(R.id.randomView);
        dotRandomView.addDot();

    }
}
