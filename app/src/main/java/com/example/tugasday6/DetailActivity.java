package com.example.tugasday6;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int itemId = getIntent().getIntExtra("itemId", 0);
        ItemModel item = getItemById(itemId);

        TextView tvNama = findViewById(R.id.tvNamaDetail);
        TextView tvDesk = findViewById(R.id.tvDeskDetail);
        TextView tvHarga = findViewById(R.id.tvHargaDetail);
        ImageView ivFoto = findViewById(R.id.ivDetail);
        Button btnShare = findViewById(R.id.btnShare);

        if (item != null){
            tvNama.setText(item.getNamaBarang());
            tvDesk.setText(item.getDeskDetailBarang());
            tvHarga.setText(item.getHargaBarang());
            ivFoto.setImageResource(item.getPhotoBarang());

            btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareItem(item, ivFoto);
                }
            });
        }
    }


    private ItemModel getItemById(int itemId) {
        for (ItemModel item : MainActivity.itemModel) {
            if (item.getId() == itemId) {
                return item;
            }
        }
        return null;
    }

    private void shareItem(ItemModel item, ImageView imageView) {
        String shareText = "\nNama: " + item.getNamaBarang() +
                "\nDeskripsi: \n" + item.getDeskDetailBarang() +
                "\nHarga: " + item.getHargaBarang();


        BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();
        Bitmap bitmap = drawable.getBitmap();
        String imagePath = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Item Image", null);
        Uri imageUri = Uri.parse(imagePath);

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, shareText);
        sendIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
        sendIntent.setType("image/jpeg");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
        }
}
