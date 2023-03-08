package com.example.pr4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WordsAdapter extends RecyclerView.Adapter<WordsAdapter.ViewHolder>{

    private OnNoteListener mOnNoteListener;
    public interface OnNoteListener {
        void onNoteClick(int position);
    }

    private final LayoutInflater inflater;
    private final List<Words> words;
    private static final String TAG = "MyApp";

    WordsAdapter(Context context, List<Words> words, OnNoteListener mOnNoteListener) {
        this.words = words;
        this.mOnNoteListener = mOnNoteListener;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public WordsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view, mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(WordsAdapter.ViewHolder holder, int position) {
        Words W = words.get(position);
        holder.flagView.setImageResource(W.getFlagResource());
        holder.capitalView.setText(W.getCapital());
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        final ImageView flagView;
        final TextView capitalView;
        OnNoteListener onNoteListener;
        ViewHolder(View view, OnNoteListener onNoteListener){
            super(view);
            flagView = view.findViewById(R.id.img);
            capitalView = view.findViewById(R.id.theme);
            this.onNoteListener = onNoteListener;
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }
}
