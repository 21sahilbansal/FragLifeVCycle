package com.example.admin.fraglifevcycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;


public class BaseFragment extends Fragment {

        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Log.d("fragemnt",this.getTag()+"oncreate");
        }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            Log.d("fragemnt",this.getTag()+"onViewCreated");
        }

        @Override
        public void onStart() {
            super.onStart();
            Log.d("fragemnt",this.getTag()+"onstart");
        }

        @Override
        public void onDetach() {
            super.onDetach();
            Log.d("fragemnt",this.getTag()+"onDetach");
        }

        @Override
        public void onAttach(Context context) {
            super.onAttach(context);
            Log.d("fragemnt",this.getTag()+"onAttach");
        }



        @Override
        public void onResume() {
            super.onResume();
            Log.d("fragemnt",this.getTag()+"onResume");
        }

        @Override
        public void onPause() {
            super.onPause();
            Log.d("fragemnt",this.getTag()+"onPause");
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            Log.d("fragemnt",this.getTag()+"onDestroyView");
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            Log.d("fragemnt",this.getTag()+"onDestroy");
        }

        @Override
        public void onActivityCreated(@Nullable Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            Log.d("fragemnt",this.getTag()+"onActivityCreated");
        }

        @Override
        public void onSaveInstanceState(@NonNull Bundle outState) {
            super.onSaveInstanceState(outState);
            Log.d("fragemnt",this.getTag()+"onSaveInstanceState");
        }
        @Override
        public void onStop() {
            super.onStop();
            Log.d("fragemnt",this.getTag()+"onStop");
        }
    }



