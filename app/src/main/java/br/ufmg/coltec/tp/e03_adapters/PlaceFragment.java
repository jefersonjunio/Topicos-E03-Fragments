package br.ufmg.coltec.tp.e03_adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PlaceFragment extends Fragment {

    public PlaceFragment() {
        super(R.layout.fragment_place_details);
    }

    public void atualizarLugar(Place place) {

        ImageView img_place_photo = this.getView().findViewById(R.id.img_place_photo);
        TextView tv_place_titulo = this.getView().findViewById(R.id.txt_place_titulo);
        TextView tv_place_description = this.getView().findViewById(R.id.txt_place_description);
        RatingBar rt_rating = this.getView().findViewById(R.id.rt_rating);
        TextView tv_distance = this.getView().findViewById(R.id.txt_place_distance);

        tv_place_titulo.setText(place.getName());
        img_place_photo.setImageResource(place.getPhotoId());
        tv_place_description.setText(place.getDescription());
        rt_rating.setRating(place.getRate());
        tv_distance.setText(place.getDistance().toString());

    }
}
