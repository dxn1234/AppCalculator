package com.example.administrator.demoappcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    TextView tvKetQua;
    float ketQua=0;
    String gan="";
    Button btnAc,btnPhanTram,btnChia,btn7,btn8,btn9,btnNhan,btn4,btn5,btn6,btnTru,btn1,btn2,btn3,btnCong,btn0,btnCham,btnBang,btnPhanSo;
    EditText edtKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        edtKetQua.setText(gan);
        batSuKien();
    }

    private void batSuKien() {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="0";
                edtKetQua.setText(gan);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="1";
                edtKetQua.setText(gan);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="2";
                edtKetQua.setText(gan);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="3";
                edtKetQua.setText(gan);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="4";
                edtKetQua.setText(gan);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="5";
                edtKetQua.setText(gan);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="6";
                edtKetQua.setText(gan);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="7";
                edtKetQua.setText(gan);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="8";
                edtKetQua.setText(gan);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="9";
                edtKetQua.setText(gan);
            }
        });
        btnCham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+=".";
                edtKetQua.setText(gan);
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="+";
                edtKetQua.setText(gan);
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="-";
                edtKetQua.setText(gan);
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="x";
                edtKetQua.setText(gan);
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="/";
                edtKetQua.setText(gan);
            }
        });
        btnPhanTram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gan+="%";
                edtKetQua.setText(gan);
            }
        });
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtKetQua.setText("");
                gan="";
            }
        });
        btnBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result=0;
                addOperation(edtKetQua.getText().toString());
                addNumber(edtKetQua.getText().toString());
                if(arrOperation.size()>=arrNumber.size() ||arrOperation.size()<1){
//                    tvResult.setText("Lỗi định dạng");
                    tvKetQua.setText("Lỗi định dạng");
                }else {
                    for (int i = 0; i < (arrNumber.size() - 1); i++) {
                        switch (arrOperation.get(i)) {
                            case "+":
                                if (i == 0) {
                                    result = arrNumber.get(i) + arrNumber.get(i + 1);
                                } else {
                                    result = result + arrNumber.get(i + 1);
                                }
                                break;
                            case "-":
                                if (i == 0) {
                                    result = arrNumber.get(i) - arrNumber.get(i + 1);
                                } else {
                                    result = result - arrNumber.get(i + 1);
                                }
                                break;
                            case "x":
                                if (i == 0) {
                                    result = arrNumber.get(i) * arrNumber.get(i + 1);
                                } else {
                                    result = result * arrNumber.get(i + 1);
                                }
                                break;
                            case "/":
                                if (i == 0) {
                                    result = arrNumber.get(i) / arrNumber.get(i + 1);
                                } else {
                                    result = result / arrNumber.get(i + 1);
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    tvKetQua.setText(result+"");
                }
           }
        });
    }

    private void anhXa() {
        tvKetQua=findViewById(R.id.tv_ketqua);
        edtKetQua=findViewById(R.id.edt_ketqua);
        btn0=findViewById(R.id.btn_0);
        btn1=findViewById(R.id.btn_1);
        btn2=findViewById(R.id.btn_2);
        btn3=findViewById(R.id.btn_3);
        btn4=findViewById(R.id.btn_4);
        btn5=findViewById(R.id.btn_5);
        btn6=findViewById(R.id.btn_6);
        btn7=findViewById(R.id.btn_7);
        btn8=findViewById(R.id.btn_8);
        btn9=findViewById(R.id.btn_9);
        btnAc=findViewById(R.id.btn_ac);
        btnBang=findViewById(R.id.btn_bang);
        btnCham=findViewById(R.id.btn_cham);
        btnCong=findViewById(R.id.btn_cong);
        btnTru=findViewById(R.id.btn_tru);
        btnNhan=findViewById(R.id.btn_nhan);
        btnChia=findViewById(R.id.btn_chia);
        btnPhanTram=findViewById(R.id.btn_phantram);
        btnPhanSo=findViewById(R.id.btn_phanso);
    }
    public ArrayList<String>arrOperation;
    public ArrayList<Double>arrNumber;
    public int addOperation(String input) {
        arrOperation = new ArrayList<>();
        char[] cArray = input.toCharArray();
        for (int i = 0; i < cArray.length; i++) {
            switch (cArray[i]) {
                case '+':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '-':
                    arrOperation.add(cArray[i] + "");
                    break;
                case 'x':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '/':
                    arrOperation.add(cArray[i] + "");
                    break;
                default:
                    break;
            }
        }
        return 0;
    }
    public void addNumber(String stringInput) {
        arrNumber = new ArrayList<>();
        Pattern regex = Pattern.compile("(\\d+(?:\\.\\d+)?)");
        Matcher matcher = regex.matcher(stringInput);
        while(matcher.find()){
            arrNumber.add(Double.valueOf(matcher.group(1)));
        }
    }
}
