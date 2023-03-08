package com.example.pr4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WordsAdapter extends RecyclerView.Adapter<WordsAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Words> words;

    WordsAdapter(Context context, List<Words> words) {
        this.words = words;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public WordsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WordsAdapter.ViewHolder holder, int position) {
        Words Words = words.get(position);
        holder.flagView.setImageResource(Words.getFlagResource());
        holder.capitalView.setText(Words.getCapital());
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView capitalView;
        ViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.img);
            capitalView = view.findViewById(R.id.theme);
        }
    }
}
