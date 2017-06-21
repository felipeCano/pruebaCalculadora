package com.calculadora.felipecano.calculadoraprueba;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import org.apache.commons.lang3.StringUtils;


/**
 * Created by felipecano on 14/05/17.
 */

public class CalculatorActivity extends Activity {

    private EditText mTextNumbers;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);

        mTextNumbers = (EditText) findViewById(R.id.textNumbers);

    }

    public void onClickButton1(View view) {

        setTextEditText("1");

    }

    public void onClickButton2(View view) {

        setTextEditText("2");

    }

    public void onClickButton3(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void onClickButton4(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void onClickButton5(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void onClickButton6(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void onClickButton7(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void onClickButton8(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void onClickButton9(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void onClickButton0(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void onClickButtonC(View view) {

        mTextNumbers.setText("");

    }

    public void onClickButtonDel(View view) {

        String text = mTextNumbers.getText().toString();

        if (text.isEmpty() == false) {
            String substring = text.substring(0, text.length() - 1);
            mTextNumbers.setText(substring);
        } else {
            mTextNumbers.setText(text);
        }

    }

    public void onClickButtonDivi(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void onClickButtonMult(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void onClickButtonRest(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void onClickButtonPlus(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void onClickButtonPoint(View view) {


        int countPoint = StringUtils.countMatches(mTextNumbers.getText().toString(), ".");
        Log.d("variable", mTextNumbers.getText().toString());
        Log.d("me dieron texto", countPoint + "");

        if (countPoint == 0) {
            setTextEditText(view.getTag().toString());
        }

    }

    public void onClickButtonEqual(View view) {


        if (mTextNumbers.getText().toString().contains("+")) {
            int plusRetun = operationPlus();

            mTextNumbers.setText(String.valueOf(plusRetun));



        } else if (mTextNumbers.getText().toString().contains("-")) {

            int restRetun = opetarionRest();
            mTextNumbers.setText(String.valueOf(restRetun));


    } else if (mTextNumbers.getText().toString().contains("*")) {

        int multRetun = opetarionMult();
        mTextNumbers.setText(String.valueOf(multRetun));
    } else if (mTextNumbers.getText().toString().contains("/")) {

            double diviRetun = opetarionDivi();
            mTextNumbers.setText(String.valueOf(diviRetun));

        } else if (mTextNumbers.getText().toString().contains("%")) {

            double percentRetun = opetarionPercent();
            mTextNumbers.setText(String.valueOf(percentRetun));

        }
    }




    public void onClickButtonPercent(View view) {

        setTextEditText(view.getTag().toString());

    }

    public void setTextEditText(String text) {

        Editable editable = mTextNumbers.getEditableText();
        editable.append(text);

    }
    private int operationPlus(){

        String CurrentString = mTextNumbers.getText().toString();
        String[] separated = CurrentString.split("\\+");

        int sum = 0;

        for (int a = 0; a < separated.length; a++) {

            String stringNumber = separated[a];

            int number = Integer.parseInt(stringNumber);

            sum += number;


        }return sum;

    }

    private int opetarionRest() {
        String CurrentString1 = mTextNumbers.getText().toString();
        String[] separated1 = CurrentString1.split("-");

        int res = Integer.parseInt(separated1[0]);

        for (int b = 1; b < separated1.length; b++) {

            String stringNumber1 = separated1[b];

            int number1 = Integer.parseInt(stringNumber1);

            res -= number1;
        }return res;

    }
    private int opetarionMult() {
        String CurrentString1 = mTextNumbers.getText().toString();
        String[] separated1 = CurrentString1.split("\\*");

        int mult = Integer.parseInt(separated1[0]);

        for (int b = 1; b < separated1.length; b++) {

            String stringNumber1 = separated1[b];

            int number1 = Integer.parseInt(stringNumber1);

            mult *= number1;
        }
        return mult;

    }
    private double opetarionDivi() {
        String CurrentString1 = mTextNumbers.getText().toString();
        String[] separated1 = CurrentString1.split("/");

        double divi = Double.parseDouble(separated1[0]);

        for (int b = 1; b < separated1.length; b++) {

            String stringNumber1 = separated1[b];

            double number1 = Double.parseDouble(stringNumber1);

            divi /= number1;
        }
        return divi;

    }
    private double opetarionPercent() {
        String CurrentString1 = mTextNumbers.getText().toString();
        String[] separated1 = CurrentString1.split("%");

        double percent = Double.parseDouble(separated1[0]);
        double percent1 = Double.parseDouble(separated1[1]);


            return (percent / 100) * percent1;



    }
    }
