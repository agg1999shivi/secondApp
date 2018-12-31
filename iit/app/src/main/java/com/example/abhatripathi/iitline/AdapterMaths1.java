package com.example.abhatripathi.iitline;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class AdapterMaths1 extends RecyclerView.Adapter<AdapterMaths1.MyViewHolder> {
    private ArrayList<quizDisplay> MathsArrayList;
    private Context context;
    RadioButton option1, option2, option3, option4;
    private String Answer;

    public AdapterMaths1(ArrayList<quizDisplay> quizDisplays, Context ctx) {
        MathsArrayList = quizDisplays;
        context = ctx;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LayoutInflater lif = LayoutInflater.from(context);
        View inflatedView = lif.inflate(R.layout.item_row, parent, false);
        return new MyViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        quizDisplay quizDisplay = MathsArrayList.get(position);



        holder.questionNumber.setText(quizDisplay.getQuestionNumber());
        holder.question.setText(quizDisplay.getQuestion());
        holder.explanation.setText(quizDisplay.getExplanation());
        holder.option1.setText(quizDisplay.getOption1());
        holder.option2.setText(quizDisplay.getOption2());
        holder.option3.setText(quizDisplay.getOption3());
        holder.option4.setText(quizDisplay.getOption4());



        holder.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {


            }
        });

        Log.e("TAG", "onBindViewHolder: ");
    }




    @Override
    public int getItemCount() {
        return MathsArrayList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView questionNumber, question, explanation;
        RadioButton option1, option2, option3, option4;
        RadioGroup radioGroup;

        public MyViewHolder(View itemView) {
            super(itemView);
            questionNumber = itemView.findViewById(R.id.QuestionNumber);
            question = itemView.findViewById(R.id.Question);
            explanation = itemView.findViewById(R.id.explanation);
            option1 = itemView.findViewById(R.id.radioButton1);
            option2 = itemView.findViewById(R.id.radioButton2);
            option3 = itemView.findViewById(R.id.radioButton3);
            option4 = itemView.findViewById(R.id.radioButton4);
            radioGroup=itemView.findViewById(R.id.radioGroup);

        }
    }

}