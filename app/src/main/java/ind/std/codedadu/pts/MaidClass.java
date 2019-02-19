package ind.std.codedadu.pts;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;

public class MaidClass {

    public static void toast(Context activity, String pesan) {
        Toast.makeText(activity, pesan, Toast.LENGTH_SHORT).show();
    }

    public static void set_EditTextError(EditText editTextError, String textError) {
        editTextError.setError(textError);
    }

    public static void alertdailogBasic(Context context) {
        AlertDialog.Builder builderAlert = new AlertDialog.Builder(context);
        builderAlert
                .setTitle("Title: Alert Dialog Basic")
                .setMessage("Message: Ini adalah pesan dari alert dialog basic di android");
        AlertDialog buildDialog = builderAlert.create();
        buildDialog.show();
    }

    public static void alertdialogwithAction(final Context context) {
        AlertDialog.Builder builderAlert = new AlertDialog.Builder(context);
        builderAlert
                .setTitle("Title: Alert Dialog with Action")
                .setMessage("Message: Ini adalah pesan dari alert dialog dengan Action di android")

                .setPositiveButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        toast(context, "Anda baru saja menekan aksi Positif Button");
                    }
                })

                .setNegativeButton("Tutup", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        toast(context, "Anda baru saja menekan aksi Negative Button");
                    }
                })

                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        toast(context,"Anda baru saja menekan aksi Netral Button");
                    }
                });

        AlertDialog buildDialog = builderAlert.create();
        buildDialog.show();
    }

    public static void alertwithgetText(Context context, String inputan) {
        AlertDialog.Builder builderAlert = new AlertDialog.Builder(context);
        builderAlert
                    .setTitle("Title: Alert Get Text from Input")
                    .setMessage("Message: Pesan yang anda masukan pada EditText adalah: `" + inputan + "`");
        AlertDialog buildDialog = builderAlert.create();
        buildDialog.show();
    }
}
