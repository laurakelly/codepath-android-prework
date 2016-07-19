package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    String itemText = getIntent().getStringExtra("itemText");
    setContentView(R.layout.activity_edit_item);

    EditText etItem = (EditText) findViewById(R.id.etItem);
    etItem.setText(itemText);
  }

  public void onSubmit(View v) {
    EditText etItem = (EditText) findViewById(R.id.etItem);
    Intent data = new Intent();
    data.putExtra("itemText", etItem.getText().toString());
    data.putExtra("pos", getIntent().getIntExtra("pos", 0));
    setResult(RESULT_OK, data);
    this.finish();
  }
}
