package br.senac.pi.demoviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //identifica o botão pelo id
        findViewById(R.id.btnTextViewDemo).setOnClickListener(abrirTextViewDemo());
        findViewById(R.id.btnEditText).setOnClickListener(abrirEditTextDemo());
        findViewById(R.id.btnImageView).setOnClickListener(abrirImageViewDemo());
        findViewById(R.id.btnAutoComplete).setOnClickListener(abrirAutoCompleteDemo());
        findViewById(R.id.btnImageButton).setOnClickListener(abrirImageButtonDemo());
        findViewById(R.id.btnButtonsViews).setOnClickListener(abrirButtonsViewsDemo());
        findViewById(R.id.btnProgressDialog).setOnClickListener(abrirProgressDialogDemo());
        findViewById(R.id.btnAlertDialog).setOnClickListener(abrirAlertDialog());
    }
    //método que levará para a página do TextView
    private View.OnClickListener abrirTextViewDemo(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TextViewDemo.class);
                startActivity(intent);
            }
        };
    }
    //método que levará para a página do editText
    private View.OnClickListener abrirEditTextDemo(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditeTextDemo.class);
                startActivity(intent);
            }
        };
    }
    //método que levará para a página do Imageview
    private View.OnClickListener abrirImageViewDemo(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageViewDemo.class);
                startActivity(intent);
            }
        };
    }
    private View.OnClickListener abrirAutoCompleteDemo(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AutoComplete.class);
                startActivity(intent);
            }
        };
    }
    private View.OnClickListener abrirImageButtonDemo(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageButton.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener abrirButtonsViewsDemo(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckBoxTogleButton.class);
                startActivity(intent);
            }
        };
    }
    private View.OnClickListener abrirProgressDialogDemo(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProgressDialogDemoActivity.class);
                startActivity(intent);
            }
        };
    }
    private View.OnClickListener abrirAlertDialog(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlertDialogDemoActivity.class);
                startActivity(intent);
            }
        };
    }
    //Chamar outra pagina sem utilizar um listener:
   // public void abrirTextViewDemo(View view){
    //    Intent intent = new Intent(this,TextViewDemo.class);
    //    startActivity(intent);
    //}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
