package com.example.poroverse;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private EditText correoEditText;
    private EditText contrasenaEditText;
    private EditText nombreUsuarioEditText;
    private Button confirmButton;
    private Button backToHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        correoEditText = findViewById(R.id.pt1);
        contrasenaEditText = findViewById(R.id.pt2);
        nombreUsuarioEditText = findViewById(R.id.pt3);
        confirmButton = findViewById(R.id.confirmButton);
        backToHomeButton = findViewById(R.id.backToHomeButton);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correo = correoEditText.getText().toString();
                String contrasena = contrasenaEditText.getText().toString();
                String nombreUsuario = nombreUsuarioEditText.getText().toString();

                // Verifica si algún campo está vacío
                if (correo.isEmpty() || contrasena.isEmpty() || nombreUsuario.isEmpty()) {
                    Toast.makeText(Register.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    String mensaje = "Registro confirmado:\nCorreo: " + correo + "\nContraseña: " + contrasena + "\nNombre de Usuario: " + nombreUsuario;
                    Toast.makeText(Register.this, mensaje, Toast.LENGTH_LONG).show();

                    // Redirige a MainActivity después de un registro exitoso
                    Intent intent = new Intent(Register.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        backToHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    }
