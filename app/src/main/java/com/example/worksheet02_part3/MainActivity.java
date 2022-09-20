package com.example.worksheet02_part3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    private Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
    private Button plus,minus,mul,div,sqrt,equal,decimal;
    private EditText ans;
    private String LHS = "0";
    private String RHS = "0";
    private boolean ansPop = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] lastop = {""};
        final String[] decimalPressed = {"No"};
        final String[] numadded = {"No"};
        final String[] equalPressed = {"No"};

        ans = (EditText) findViewById(R.id.answer);
        num0 = (Button) findViewById(R.id.num0);
        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        sqrt = (Button) findViewById(R.id.sqrt);
        equal = (Button) findViewById(R.id.eq);
        decimal = (Button) findViewById(R.id.dec);




        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimalPressed[0].equals("No")) {
                    if (ans.getText().toString().equals("0")) {
                        ans.setText("0");
                        numadded[0] = "Yes";
                    } else if (numadded[0].equals("No")) {
                        LHS = ans.getText().toString();
                        ans.setText("0");
                        ansPop = false;
                        numadded[0] = "Yes";
                    } else {
                        ans.setText(ans.getText().toString() + 0);
                        numadded[0] = "Yes";
                    }
                }
                else if (equalPressed[0].equals("Yes")) {
                    if (numadded[0].equals("No")) {
                        ans.setText("0");
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText(ans.getText().toString() + 0);
                        numadded[0] = "Yes";

                    }
                }
                else if (lastop[0].equals("+")) {
                    ans.setText("0");
                    numadded[0] = "Yes";
                }
                else {
                    if (numadded[0].equals("Yes")) {
                        ans.setText(ans.getText().toString() + 0);
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText("0");
                        numadded[0] = "Yes";
                    }

                }

            }



        });

        final boolean[] toadd = {false};

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimalPressed[0].equals("No")) {
                    if (ans.getText().toString().equals("0")) {
                        ans.setText("1");
                        numadded[0] = "Yes";
                    } else if (numadded[0].equals("No")) {
                        LHS = ans.getText().toString();
                        ans.setText("1");
                        ansPop = false;
                        numadded[0] = "Yes";
                    } else {
                        ans.setText(ans.getText().toString() + 1);
                        numadded[0] = "Yes";
                    }
                }
                else if (equalPressed[0].equals("Yes")) {
                    if (numadded[0].equals("No")) {
                        ans.setText("1");
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText(ans.getText().toString() + 1);
                        numadded[0] = "Yes";

                    }
                }
                else if (lastop[0].equals("+")) {
                    if (numadded[0].equals("Yes")) {
                        if (toadd[0] ==true) {
                            ans.setText(ans.getText().toString() + 1);
                            numadded[0] = "Yes";
                        }
                        else {
                            ans.setText("1");
                            numadded[0] = "Yes";
                            toadd[0] = true;

                        }
                    }
                    ans.setText("1");
                    numadded[0] = "Yes";
                    toadd[0] = true;


                }
                else {
                    ans.setText("1");
                    numadded[0] = "Yes";
                    toadd[0] = true;
                }


            }


        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimalPressed[0].equals("No")) {
                    if (ans.getText().toString().equals("0")) {
                        ans.setText("2");
                        numadded[0] = "Yes";
                    } else if (numadded[0].equals("No")) {
                        LHS = ans.getText().toString();
                        ans.setText("2");
                        ansPop = false;
                        numadded[0] = "Yes";
                    } else {
                        ans.setText(ans.getText().toString() + 2);
                        numadded[0] = "Yes";
                    }
                }
                else if (equalPressed[0].equals("Yes")) {
                    if (numadded[0].equals("No")) {
                        ans.setText("2");
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText(ans.getText().toString() + 2);
                        numadded[0] = "Yes";

                    }
                }
                else if (lastop[0].equals("+")) {
                    ans.setText("2");
                    numadded[0] = "Yes";
                }
                else {
                    if (numadded[0].equals("Yes")) {
                        ans.setText(ans.getText().toString() + 2);
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText("2");
                        numadded[0] = "Yes";
                    }

                }

            }


        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimalPressed[0].equals("No")) {
                    if (ans.getText().toString().equals("0")) {
                        ans.setText("3");
                        numadded[0] = "Yes";
                    } else if (numadded[0].equals("No")) {
                        LHS = ans.getText().toString();
                        ans.setText("3");
                        ansPop = false;
                        numadded[0] = "Yes";
                    } else {
                        ans.setText(ans.getText().toString() + 3);
                        numadded[0] = "Yes";
                    }
                }
                else if (equalPressed[0].equals("Yes")) {
                    if (numadded[0].equals("No")) {
                        ans.setText("3");
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText(ans.getText().toString() + 3);
                        numadded[0] = "Yes";

                    }
                }
                else if (lastop[0].equals("+")) {
                    ans.setText("3");
                    numadded[0] = "Yes";
                }
                else {
                    if (numadded[0].equals("Yes")) {
                        ans.setText(ans.getText().toString() + 3);
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText("3");
                        numadded[0] = "Yes";
                    }

                }

            }


        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimalPressed[0].equals("No")) {
                    if (ans.getText().toString().equals("0")) {
                        ans.setText("4");
                        numadded[0] = "Yes";
                    } else if (numadded[0].equals("No")) {
                        LHS = ans.getText().toString();
                        ans.setText("4");
                        ansPop = false;
                        numadded[0] = "Yes";
                    } else {
                        ans.setText(ans.getText().toString() + 4);
                        numadded[0] = "Yes";
                    }
                }
                else if (equalPressed[0].equals("Yes")) {
                    if (numadded[0].equals("No")) {
                        ans.setText("4");
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText(ans.getText().toString() + 4);
                        numadded[0] = "Yes";

                    }
                }
                else if (lastop[0].equals("+")) {
                    ans.setText("4");
                    numadded[0] = "Yes";
                }
                else {
                    if (numadded[0].equals("Yes")) {
                        ans.setText(ans.getText().toString() + 4);
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText("4");
                        numadded[0] = "Yes";
                    }

                }

            }


        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimalPressed[0].equals("No")) {
                    if (ans.getText().toString().equals("0")) {
                        ans.setText("5");
                        numadded[0] = "Yes";
                    } else if (numadded[0].equals("No")) {
                        LHS = ans.getText().toString();
                        ans.setText("5");
                        ansPop = false;
                        numadded[0] = "Yes";
                    } else {
                        ans.setText(ans.getText().toString() + 5);
                        numadded[0] = "Yes";
                    }
                }
                else if (equalPressed[0].equals("Yes")) {
                    if (numadded[0].equals("No")) {
                        ans.setText("5");
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText(ans.getText().toString() + 5);
                        numadded[0] = "Yes";

                    }
                }
                else if (lastop[0].equals("+")) {
                    ans.setText("5");
                    numadded[0] = "Yes";
                }
                else {
                    if (numadded[0].equals("Yes")) {
                        ans.setText(ans.getText().toString() + 5);
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText("5");
                        numadded[0] = "Yes";
                    }

                }

            }


        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimalPressed[0].equals("No")) {
                    if (ans.getText().toString().equals("0")) {
                        ans.setText("6");
                        numadded[0] = "Yes";
                    } else if (numadded.equals("No")) {
                        LHS = ans.getText().toString();
                        ans.setText("6");
                        ansPop = false;
                        numadded[0] = "Yes";
                    } else {
                        ans.setText(ans.getText().toString() + 6);
                        numadded[0] = "Yes";
                    }
                }
                else if (equalPressed[0].equals("Yes")) {
                    if (numadded[0].equals("No")) {
                        ans.setText("6");
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText(ans.getText().toString() + 6);
                        numadded[0] = "Yes";

                    }
                }
                else if (lastop[0].equals("+")) {
                    ans.setText("6");
                    numadded[0] = "Yes";
                }
                else {
                    if (numadded[0].equals("Yes")) {
                        ans.setText(ans.getText().toString() + 6);
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText("6");
                        numadded[0] = "Yes";
                    }

                }
            }


        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimalPressed[0].equals("No")) {
                    if (ans.getText().toString().equals("0")) {
                        ans.setText("7");
                        numadded[0] = "Yes";
                    } else if (numadded[0].equals("No")) {
                        LHS = ans.getText().toString();
                        ans.setText("7");
                        ansPop = false;
                        numadded[0] = "Yes";
                    } else {
                        ans.setText(ans.getText().toString() + 7);
                        numadded[0] = "Yes";
                    }
                }
                else if (equalPressed[0].equals("Yes")) {
                    if (numadded[0].equals("No")) {
                        ans.setText("7");
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText(ans.getText().toString() + 7);
                        numadded[0] = "Yes";

                    }
                }
                else if (lastop[0].equals("+")) {
                    ans.setText("7");
                    numadded[0] = "Yes";
                }
                else {
                    if (numadded[0].equals("Yes")) {
                        ans.setText(ans.getText().toString() + 7);
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText("7");
                        numadded[0] = "Yes";
                    }

                }

            }


        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ansPop){
                    if (decimalPressed[0].equals("No")) {
                        if (ans.getText().toString().equals("0")) {
                            ans.setText("8");
                            numadded[0] = "Yes";
                        } else if (numadded[0].equals("No")) {
                            LHS = ans.getText().toString();
                            ans.setText("8");
                            ansPop = false;
                            numadded[0] = "Yes";
                        } else {
                            ans.setText(ans.getText().toString() + 8);
                            numadded[0] = "Yes";
                        }
                    }
                    else if (equalPressed[0].equals("Yes")) {
                        if (numadded[0].equals("No")) {
                            ans.setText("8");
                            numadded[0] = "Yes";
                        }
                        else {
                            ans.setText(ans.getText().toString() + 8);
                            numadded[0] = "Yes";

                        }
                    }
                    else if (lastop[0].equals("+")) {
                        ans.setText("8");
                        numadded[0] = "Yes";
                    }
                    else {
                        if (numadded[0].equals("Yes")) {
                            ans.setText(ans.getText().toString() + 8);
                            numadded[0] = "Yes";
                        }
                        else {
                            ans.setText("8");
                            numadded[0] = "Yes";
                        }

                    }
                }


            }


        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimalPressed[0].equals("No")) {
                    if (ans.getText().toString().equals("0")) {
                        ans.setText("9");
                        numadded[0] = "Yes";
                    } else if (numadded[0].equals("No")) {
                        LHS = ans.getText().toString();
                        ans.setText("9");
                        ansPop = false;
                        numadded[0] = "Yes";
                    } else {
                        ans.setText(ans.getText().toString() + 9);
                        numadded[0] = "Yes";
                    }
                }
                else if (equalPressed[0].equals("Yes")) {
                    if (numadded[0].equals("No")) {
                        ans.setText("9");
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText(ans.getText().toString() + 9);
                        numadded[0] = "Yes";

                    }
                }
                else if (lastop[0].equals("+")) {
                    ans.setText("9");
                    numadded[0] = "Yes";
                }
                else {
                    if (numadded[0].equals("Yes")) {
                        ans.setText(ans.getText().toString() + 9);
                        numadded[0] = "Yes";
                    }
                    else {
                        ans.setText("9");
                        numadded[0] = "Yes";
                    }

                }

            }


        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (LHS.equals("0") && ansPop == false) {
                    LHS = ans.getText().toString();
                    ans.setText("0");
                }

                else {
                    if (equalPressed[0].equals("Yes")) {
                        LHS = ans.getText().toString();
                        ans.setText("0");
                    }
                    else {
                        double num01 = Double.parseDouble(LHS);
                        double num02 = Double.parseDouble(ans.getText().toString());
                        double result = num01 + num02;
                        String plusAns = String.valueOf(result);
                        LHS = "" + result;
                        ans.setText(plusAns);
                        ansPop = true;
                    }
                }
                lastop[0] = "+";
                toadd[0] = false;
            }

        });





        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (LHS.equals("0") && ansPop == false) {
                    LHS = ans.getText().toString();
                    ans.setText("0");
                }else {
                    double num01 = Double.parseDouble(LHS);
                    double num02 = Double.parseDouble(ans.getText().toString());
                    double result = num01 - num02;
                    String plusAns = String.valueOf(result);
                    LHS = "0";
                    ans.setText(plusAns);
                    ansPop = true;
                }
                lastop[0] = "-";
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (LHS.equals("0") && ansPop == false) {
                    LHS = ans.getText().toString();
                    ans.setText("0");
                }else {
                    double num01 = Double.parseDouble(LHS);
                    double num02 = Double.parseDouble(ans.getText().toString());
                    double result = num01 * num02;
                    String plusAns = String.valueOf(result);
                    LHS = "0";
                    ans.setText(plusAns);
                    ansPop = true;
                }
                lastop[0] = "*";
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (LHS.equals("0") && !ansPop) {
                    LHS = ans.getText().toString();
                    ans.setText("0");
                }else {
                    double num01 = Double.parseDouble(LHS);
                    double num02 = Double.parseDouble(ans.getText().toString());
                    double result = num01 / num02;
                    String divAns = String.valueOf(result);
                    LHS = "0";
                    ans.setText(divAns);
                    ansPop = true;
                }
                lastop[0] = "/";

            }
        });

        final double[] initval = {0};
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equalPressed[0] = "Yes";
                if (lastop[0].equals("+")) {
                    double finalval = (Double.parseDouble(LHS)) + (Double.parseDouble(ans.getText().toString()));
                    LHS = ""+finalval;
                    ans.setText(""+finalval);


                    numadded[0] = "No";
                    ansPop = true;
                    equalPressed[0] = "Yes";

                }
                if (lastop[0].equals("-")) {
                    if (initval[0] == 0) {
                        double finalval = (Double.parseDouble(LHS)) - (Double.parseDouble(ans.getText().toString()));
                        LHS = ""+finalval;
                        initval[0] = Double.parseDouble(ans.getText().toString());
                        ans.setText(""+finalval);

                    }

                    else {
                        double finalval = ((Double.parseDouble(ans.getText().toString()))-initval[0]);
                        LHS = ""+finalval;
                        ans.setText(""+finalval);

                    }
                    numadded[0] = "No";
                }
                if (lastop[0].equals("*")) {
                    if (initval[0] == 0) {
                        double finalval = (Double.parseDouble(LHS)) * (Double.parseDouble(ans.getText().toString()));
                        LHS = ""+finalval;
                        initval[0] = Double.parseDouble(ans.getText().toString());
                        ans.setText(""+finalval);

                    }

                    else {
                        double finalval = ((Double.parseDouble(ans.getText().toString()))*initval[0]);
                        LHS = ""+finalval;
                        ans.setText(""+finalval);

                    }
                    numadded[0] = "No";
                }
                if (lastop[0].equals("/")) {
                    if (initval[0] == 0) {
                        double finalval = (Double.parseDouble(LHS)) / (Double.parseDouble(ans.getText().toString()));
                        LHS = ""+finalval;
                        initval[0] = Double.parseDouble(ans.getText().toString());
                        ans.setText(""+finalval);

                    }

                    else {
                        double finalval = ((Double.parseDouble(ans.getText().toString()))/initval[0]);
                        LHS = ""+finalval;
                        ans.setText(""+finalval);

                    }
                    numadded[0] = "No";
                }

                if (lastop[0].equals("sqrt")){
                    double finalval = Double.parseDouble(ans.getText().toString());
                    finalval = Math.sqrt(finalval);
                    ans.setText(""+finalval);
                    numadded[0] = "No";
                }
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimalPressed[0].equals("Yes")) {
                    ans.setText(ans.getText().toString());
                }
                else{
                    ans.setText(ans.getText().toString() + ".");
                    decimalPressed[0] = "Yes";
                }
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double finalval = Double.parseDouble(ans.getText().toString());
                finalval = Math.sqrt(finalval);
                ans.setText(""+finalval);
                lastop[0] = "sqrt";
            }
        });





    }
}