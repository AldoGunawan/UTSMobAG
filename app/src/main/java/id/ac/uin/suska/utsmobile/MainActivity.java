package id.ac.uin.suska.utsmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CardView product, event, location, setting, about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        product = (CardView) findViewById(R.id.productCard);
            event = (CardView) findViewById(R.id.eventCard);
                location = (CardView) findViewById(R.id.locationCard);
            setting = (CardView) findViewById(R.id.settingCard);
        about = (CardView) findViewById(R.id.aboutCard);

        product.setOnClickListener((View.OnClickListener) this);
            event.setOnClickListener((View.OnClickListener) this);
                location.setOnClickListener((View.OnClickListener) this);
            setting.setOnClickListener((View.OnClickListener) this);
        about.setOnClickListener((View.OnClickListener) this);

    }
    @Override
    public void onClick(View v) {
        Intent a;
        switch (v.getId()){
            case R.id.productCard: a = new Intent(this,ProductAct.class);
            startActivity(a);
            break;
                case R.id.eventCard: a = new Intent(this,EventAct.class);
                startActivity(a);
                break;
                    case R.id.locationCard: a = new Intent(this,LocationAct.class);
                    startActivity(a);
                    break;
                case R.id.settingCard: a = new Intent(this, SettingsAct.class);
                startActivity(a);
                break;
            case R.id.aboutCard: a = new Intent(this,AboutAct.class);
            startActivity(a);
            break;
        }
    }
}