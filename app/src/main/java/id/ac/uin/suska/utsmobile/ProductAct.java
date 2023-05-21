package id.ac.uin.suska.utsmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class ProductAct extends AppCompatActivity implements View.OnClickListener {
    CardView aquaProduct, vitProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_product);

        aquaProduct = findViewById(R.id.aquaProduct);
        vitProduct = findViewById(R.id.vitProduct);

        aquaProduct.setOnClickListener(this);
        vitProduct.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.aquaProduct:
                Toast.makeText(this, "Aqua Product clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.vitProduct:
                Toast.makeText(this, "Vit Product clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

