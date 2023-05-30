package com.example.helloapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class CustomDialogFragment extends DialogFragment {

//    @NonNull
//    public Dialog onCreateDialog(Bundle savedInstanceState) {

//        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
//        return builder.setTitle("Диалоговое окно").setMessage("Для закрытия окна нажмите ОК").create();
//    }

//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        return builder
//                .setTitle("Диалоговое окно")
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .setMessage("Для закрытия окна нажмите ОК")
//                .setPositiveButton("OK", null)
//                .setNegativeButton("Отмена", null)
//                .create();
//    }

//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        return builder
//                .setTitle("Диалоговое окно")
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .setView(R.layout.dialog)
//                .setPositiveButton("OK", null)
//                .setNegativeButton("Отмена", null)
//                .create();
//    }


//        String phone = getArguments().getString("phone");
//        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
//        return builder
//                .setTitle("Диалоговое окно")
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .setMessage("Вы хотите удалить " + phone + "?")
//                .setPositiveButton("OK", null)
//                .setNegativeButton("Отмена", null)
//                .create();
//    }


        private Removable removable;

        @Override
        public void onAttach(Context context){
            super.onAttach(context);
            removable = (Removable) context;
        }

        @NonNull
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            final String phone = getArguments().getString("phone");
            AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
            return builder
                    .setTitle("Диалоговое окно")
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setMessage("Вы хотите удалить " + phone + "?")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            removable.remove(phone);
                        }
                    })
                    .setNegativeButton("Отмена", null)
                    .create();
        }
}