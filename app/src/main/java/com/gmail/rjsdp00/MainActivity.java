package com.gmail.rjsdp00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    //TAG=스트링 타입이고 로그 안에서 변화할게 아니여서 final로 지정
    // class이용하는 이유: Public class의 MainActivity를 리팩토링->rename해주면 밑에 문장 MainActivity도 같이 변경됨.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void writeLog(View view) {
        UserProfile userProfile = new UserProfile("홍길동", "010-1111-1111", "서울시 강남구 대치동");

        Log.v(TAG, "이것은 verbose 로그입니다." + userProfile); //toString 호
        Log.d(TAG, "이것은 debug 로그입니다." + userProfile);
        Log.i(TAG, "이것은 info 로그입니다." + userProfile);
        Log.w(TAG, "이것은 warning 로그입니다." + userProfile);
        Log.e(TAG, "이것은 error 로그입니다." + userProfile);
    }
}