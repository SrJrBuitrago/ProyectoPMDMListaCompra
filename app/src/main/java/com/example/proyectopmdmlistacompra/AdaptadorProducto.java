package com.example.proyectopmdmlistacompra;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;




import java.util.List;


public class AdaptadorProducto extends RecyclerView.Adapter<AdaptadorProducto.ViewHolder> {

    private final List<Producto> mValues;
    private final OnProductoInteractionListener mListener;

    public AdaptadorProducto(List<Producto> items, OnProductoInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.textViewNombre.setText(holder.mItem.getNombre());
        holder.textViewMarca.setText(holder.mItem.getMarca());
        holder.textViewCantidad.setText(holder.mItem.getCantidad());
        holder.textViewPrecio.setText((int) holder.mItem.getPrecio());
        holder.imageViewProducto.setImageURI(holder.mItem.getRutaFoto());

        holder.miView.setOnClickListener((v)->{
            if (null !=mListener){
                mListener.onProductoClick(holder.mItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View miView;
        public final TextView textViewNombre;
        public final TextView textViewMarca;
        public final TextView textViewCantidad;
        public final TextView textViewPrecio;
        public final ImageView imageViewProducto;
        public Producto mItem;

        public ViewHolder(View view) {
            super(view);
            miView = view;
            textViewNombre = (TextView) view.findViewById(R.id.textViewNombre);
            textViewMarca = (TextView) view.findViewById(R.id.textViewMarca);
            textViewCantidad = (TextView) view.findViewById(R.id.textViewCantidad);
            textViewPrecio = (TextView) view.findViewById(R.id.textViewPrecio);
            imageViewProducto = (ImageView) view.findViewById(R.id.imageView);

        }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewPrecio.getText() + "'";
        }
    }
}